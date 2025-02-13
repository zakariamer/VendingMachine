import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, this is a vending machine. Follow the instructions as follows to use me properly. ");

        String[][] snacks = {
                {"Lays", "Skittles", "Rice Krispies", "Granola"},
                {"Pretzels", "Cheetos", "Doritos", "M&Ms"},
                {"Cheez-Itz", "Goldfish", "Oreos", "Ruffles"},
                {"Takis", "Air Heads", "Water", "Chex mix"}
            };

        int[][] prices = {
            {1,2,3,1},
            {2,3,1,2},
            {2,2,3,3},
            {2,2,1,4}
        };
        
        System.out.println("Here is what we have:");

        System.out.println("      1        2            3           4");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.print("A: | ");
                    break;
                case 1:
                    System.out.print("B: | ");
                    break;
                case 2:
                    System.out.print("C: | ");
                    break;
                case 3:
                    System.out.print("D: | ");
                    break;
            }
            for (int j = 0; j < 4; j++) {
                System.out.print(snacks[i][j] + " ($" + prices[i][j] + ") | ");
            }
            System.out.println();
            System.out.println("----------------------------------------------");
        }
        System.out.print("\nEnter the letter and number of the snack you want to buy: ");
        String choice = scanner.nextLine();

        String letter = choice.substring(0,1);
        String num = choice.substring(1);
        int number = Integer.parseInt(num);

        int x = 0; 
        int y = 0;

        switch (letter) {
            case "A":
                x = 0;
                break;
            case "B":
                x = 1;
                break;
            case "C":
                x = 2;
                break;
            case "D":
                x = 3;
                break;
            default:
                System.out.println("Didn't enter a valid letter");
                System.exit(0);
                break;
        }

        switch (number) {
            case 1:
                y = 0;
                break;
            case 2:
                y = 1;
                break;
            case 3:
                y = 2;
                break;
            case 4:
                y = 3;
                break;
            default:
                System.out.println("Didn't enter a valid number");
                System.exit(0);
                break;
        }

        System.out.println("The item you picked is " + snacks[x][y] + " and it costs $" + prices[x][y]);
        
        // Accept money from the user
        int totalInserted = 0;
        int price = prices[x][y];
        while (totalInserted < price) {
            System.out.print("Insert $1 bill (enter 1 to insert, or 0 to cancel): ");
            int money = scanner.nextInt();
            
            if (money == 1) {
                totalInserted++;
                System.out.println("Total inserted: $" + totalInserted);
            } else if (money == 0) {
                System.out.println("Transaction canceled. Refunding...");
                scanner.close();
                return;
            } else {
                System.out.println("Only $1 bills are accepted. Please enter 1 to insert money or 0 to cancel.");
            }
        }
    }
}