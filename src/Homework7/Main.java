package Homework7;

public class Main {
    public static void main(String[] args) {
        Team barcelona = new Team("Barcelona");

        try {
            Player messi = new Player("Lionel_Messi", 75, 85, 84, 92, 67);
            barcelona.addPlayer(messi);

            Player pique = new Player("Gerard_Pique", 95, 82, 82, 89, 68);
            barcelona.addPlayer(pique);

            barcelona.removePlayer("Gerard_Pique");

            System.out.println(barcelona.getName() + " – " + (int) barcelona.getRating());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Player invalidPlayer = new Player("Invalid_Player", 105, 85, 70, 60, 99);
            barcelona.addPlayer(invalidPlayer);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(barcelona.getName() + " – " + (int) barcelona.getRating());
    }
}