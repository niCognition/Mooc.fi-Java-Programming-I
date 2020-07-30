import java.util.ArrayList;

public class Recipe {
    private String name;
    private String cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(
            String name,
            String cookingTime,
            ArrayList<String> ingredients) {

        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }

    public String getName() {
        return this.name;
    }

    public String getCookingTime() {
        return this.cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

}
