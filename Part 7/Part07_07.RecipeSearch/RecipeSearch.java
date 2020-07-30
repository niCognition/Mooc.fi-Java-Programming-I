
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String file = scanner.nextLine();

        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                ArrayList<String> ingredients = new ArrayList<>();

                String name = fileReader.nextLine();
                String cookingTime = fileReader.nextLine();
                String ingredient = fileReader.nextLine();

                do {
                    ingredients.add(ingredient);

                    ingredient = fileReader.hasNext() ? fileReader.nextLine() : "";

                } while (!ingredient.isEmpty());

                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                recipes.add(recipe);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }

            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String word = scanner.nextLine();

                for (Recipe recipe : recipes) {
                    if (recipe.getName().toLowerCase().contains(word.toLowerCase())) {
                        System.out.println(recipe);
                    }
                }
            }

            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int maxCookingTime = Integer.parseInt(scanner.nextLine());

                for (Recipe recipe : recipes) {
                    if (Integer.parseInt(recipe.getCookingTime()) <= maxCookingTime) {
                        System.out.println(recipe);
                    }
                }
            }

            if (command.equals("find ingredient")) {
                System.out.println("Ingredient");
                String ingredient = scanner.nextLine();

                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe);
                    }
                }
            }

        }
    }
}
