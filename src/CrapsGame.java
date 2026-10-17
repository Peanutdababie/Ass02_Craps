public class CrapsGame {
    static void main() {
        java.util.Random rand = new java.util.Random();
        java.util.Scanner input = new java.util.Scanner(System.in);

        //declarations
            int initialRoll1;
            int initialRoll2;

            int sum = 0;

            String rollAgain = "";
            int roll1;
            int roll2;

            String playAgain = "";

        do {
            initialRoll1 = rand.nextInt(6) + 1;
            initialRoll2 = rand.nextInt(6) + 1;

            System.out.println("The first roll is: " + initialRoll1);
            System.out.println("The second roll is: " + initialRoll2);

            sum = initialRoll1 + initialRoll2;

            if(sum == 7 || sum == 11)
            {
                System.out.println(sum + ", it's a natural! You win!");
            } else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println(sum + ", you've crapped out. You lose!");
            }else{
                System.out.println("The point is " + sum);
                int point = sum;
                sum = 0;

                System.out.println("Will you make a roll? [Y/N]");
                rollAgain = input.nextLine();

                if(rollAgain.equalsIgnoreCase("Y")){
                    while (rollAgain.equalsIgnoreCase("Y") && sum !=7 && sum != point){
                        roll1 = rand.nextInt(6) + 1;
                        roll2 = rand.nextInt(6) + 1;
                        sum = roll1 + roll2;
                        System.out.println("You've rolled a(n) " + sum);

                        if (sum != point && sum != 7) {
                            System.out.println("Will you make a roll? [Y/N]");
                            rollAgain = input.nextLine();
                        }
                    }

                }

                if(sum == 7){
                    System.out.println("Bad roll! You lose!");
                }else if (sum == point){
                    System.out.println("You've made point, you've won!");
                }

            }

            System.out.println("Will you play again?[Y/N]");
            playAgain = input.nextLine();
        }while(playAgain.equalsIgnoreCase("y"));




    }
}
