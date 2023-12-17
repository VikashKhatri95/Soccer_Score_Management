import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> team1 = new ArrayList<>();
    static ArrayList<String> team2 = new ArrayList<>();
    public static void teamscore() {
        String name;
        char scchoice;
        Scanner s = new Scanner(System.in);

        System.out.println("Does Team A scored a goal");
        scchoice = s.next().charAt(0);
        s.nextLine(); // Consume newline character
        if (scchoice == 'y') {
            System.out.println("Enter who scored the goal for team1");
            name = s.nextLine();
            team1.add(name);
        } else {
            System.out.println("Enter who scored the goal for team2");
            name = s.nextLine();
            team2.add(name);
        }
    }

    public static void anygoals() {
        char goalscored;
        Scanner sc = new Scanner(System.in);

        System.out.println("Any Goals Scored?");
        goalscored = sc.next().charAt(0);
        sc.nextLine(); // Consume newline character
        if (goalscored == 'n') {
            displayfinalscore();
        } else {
            teamscore();
        }
    }

    public static void displayfinalscore() {
        System.out.println("--------------------------------------------");
        System.out.println("\tScores");
        System.out.print("Team A");
        System.out.println("\t\t\tTeam B");
        System.out.print(team1.size());
        System.out.println("\t\t\t" + team2.size());
        for (int i = 0; i < team1.size(); i++) {
            System.out.println(team1.get(i));
        }
        System.out.println("--------------------------------------------");
        for (int j = 0; j < team2.size(); j++) {
            System.out.println(team2.get(j));
        }
        int t1=team1.size(),t2=team2.size();
        if(t1>t2){
            System.out.println("Team 1 is the WINNER !!!!!!!!!!!!!");
        }
        else if(t2>t1){
            System.out.println("Team 2 is the WINNER !!!!!!!!!!!!!");
        }
        else{
            System.out.println("It is a draw!!");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char choice;
        int exit = 0;
        while (exit == 0) {
            System.out.println("\nIs the Match Over?");
            choice = sc.next().charAt(0);
            sc.nextLine(); // Consume newline character
            if (choice == 'y') {
                exit = 1;
                displayfinalscore();
            } else {
                anygoals();
            }
        }
    }
}
