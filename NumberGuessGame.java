// public class NumberGuessGame {
// public class NumberGues {
        import java.util.Random;
        import java.util.Scanner;

        public class NumberGuessGame {
        
            public static void main(String[] args) {
                Scanner scanner =  new Scanner(System.in);
                Random random = new Random();
                int toguess;
                int guess;
                toguess = random.nextInt(10);

                while (true) {
                    System.out.println("Enter a Guess Number" );
                    guess =  scanner.nextInt();
                    if (guess > toguess) {
                        System.out.println("Your guess is too High");
                    } else if (guess<toguess) {
                        System.out.println("Your guess is too Low ");
                    } else if (guess == toguess) {
                        System.out.println("You got it bro, Guess Right Number");
                       return;
                    }
                }
            }
        }  

   

