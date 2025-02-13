public class VendingMachine {

    public static void main(String[] args){
        System.out.println("Hi, this is a vending machine. Follow the instructions as follows to use me properly. ");

        String[][] snacks = {
                {"Lays", "Skittles", "Rice Krispies", "Granola"},
                {"Pretzels", "Cheetos", "Doritos", "M&Ms"},
                {"Cheez-Itz", "Goldfish", "Oreos", "Ruffles"},
                {"Takis", "Air Heads", "Water", "Chex mix"}
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
                System.out.print(snacks[i][j] + " | ");
            }
            System.out.println();
            System.out.println("----------------------------------------------");
        }



    }

}