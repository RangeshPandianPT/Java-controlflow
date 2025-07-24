import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the number of games you want to play:");
        int numberOfGames = sc.nextInt();
        sc.nextLine(); 

        int playerWins = 0;
        int computerWins = 0;
        String[][] gameResults = new String[numberOfGames][3];

        for (int i = 0; i < numberOfGames; i++) {
            System.out.println("\nGame " + (i + 1));
            System.out.println("Enter your choice (rock, paper, or scissors):");
            String playerChoice = sc.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = determineWinner(playerChoice, computerChoice);

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }

            
            gameResults[i][0] = playerChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

       
        String[][] stats = calculateStats(playerWins, computerWins, numberOfGames);

        
        displayResults(gameResults, stats);
    }

    
    public static String getComputerChoice() {
        double randomValue = Math.random();
        if (randomValue < 0.34) {
            return "rock";
        } else if (randomValue < 0.67) {
            return "paper";
        } else {
            return "scissors";
        }
    }

   
    public static String determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Draw";
        }
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("scissors") && computer.equals("paper")) ||
            (player.equals("paper") && computer.equals("rock"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    
    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", (playerWins * 100.0) / totalGames) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0) / totalGames) + "%";

        return stats;
    }

    
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tPlayer Choice\tComputer Choice\tWinner");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nStatistics:");
        System.out.println("Player\tWins\tWinning %");
        System.out.println("-----------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }
}
