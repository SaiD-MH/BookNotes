package ch2.code;

public class GuessGame {

    Player p1, p2, p3;
    char c;
    int x;
    public void get(){
        System.out.println( c);
    }

    public void startGame() {

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int P1_g = 0, P2_g = 0, P3_g = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I’m thinking of a number between 0 and 9... is = " + targetNumber);

        while (true) {

            p1.guess();
            p2.guess();
            p3.guess();

            P1_g = p1.number;
            System.out.println("Player 1 Guess = " + P1_g);
            P2_g = p2.number;
            System.out.println("Player 2 Guess = " + P2_g);
            P3_g = p3.number;
            System.out.println("Player 3 Guess = " + P3_g);

            if (P1_g == targetNumber) {
                p1isRight = true;
            }
            if (P2_g == targetNumber) {
                p2isRight = true;
            }
            if (P3_g == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {

                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break; // game over, so break out of the loop
            } else {
                // we must keep going because nobody got it right!
                System.out.println("Players will have to try again.");
            } //

        }

    }

}
