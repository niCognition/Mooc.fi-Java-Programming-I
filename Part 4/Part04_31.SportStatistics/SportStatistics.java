
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> matches = new ArrayList<>();
        ArrayList<Integer> wins = new ArrayList<>();
        ArrayList<Integer> losses = new ArrayList<>();

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
               String line = fileReader.nextLine();
               String[] parts = line.split(",");

               String homeTeam = parts[0];
               String visitingTeam = parts[1];
               int homePoints = Integer.parseInt(parts[2]);
               int visitingPoints = Integer.parseInt(parts[3]);

               if (homeTeam.equals(team)) {
                   matches.add(homeTeam);

                   if (homePoints > visitingPoints) {
                       wins.add(1);
                   } else if (visitingPoints > homePoints){
                       losses.add(1);
                   }
               } else if (visitingTeam.equals(team)) {
                   matches.add(visitingTeam);

                   if (visitingPoints > homePoints) {
                       wins.add(1);
                   } else if (homePoints > visitingPoints){
                       losses.add(1);
                   }
               }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong when reading file: " + file);
        }

        System.out.println("Games: " + matches.size());
        System.out.println("Wins: " + wins.size());
        System.out.println("Losses: " + losses.size());
    }

}
