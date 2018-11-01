/**
 * @author liyuchen
 * @create 2018-11-01
 **/
public class GuessGame {
//    three player instance;
    Player p1;
    Player p2;
    Player p3;
//    start game class
    public void startGame(){
        // create three player objects;
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        // declare 3 variables to hold guess
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        // declare three boolean var
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        // generate target number
        int target = (int)(Math.random()*10);
        System.out.println("I'm thinking a number between 0 and 9...");
        while (true){
            System.out.println("Nunber to guess is "+ target);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);
            if(guessp1 == target){
                p1isRight = true;
            }
            if(guessp2 == target){
                p2isRight = true;
            }
            if(guessp3 == target){
                p3isRight = true;
            }
            if(p1isRight||p2isRight||p3isRight){
                System.out.println("We have a winner");
                System.out.println("Player one is " + p1isRight);
                System.out.println("Player two is " + p2isRight);
                System.out.println("Player three is " + p3isRight);
                System.out.println("Game is over");
                break;
            }
            else{
                System.out.println("Players will have to try again.");
            }
        }
    }
}

class Player{
    int number = 0;
    public void guess(){
        number = (int)(Math.random()*10);
        System.out.println("I'm guessing "+ number);
    }
}

class GameLauncher{
    public static void main(String[] args){
        GuessGame game = new GuessGame();
        game.startGame();
    }
}