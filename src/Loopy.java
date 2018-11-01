/**
 * @ author milkycx;
 * @ create 2018-11-01 16:31
 **/
public class Loopy {
    public static void main(String[] args){
        int x = 1;
        System.out.println("Before while loop");
        while (x < 4){
            System.out.println("In the loop");
            System.out.println("Value of x is " + x);
            x = x+1;
        }
        System.out.println("After the loop");
    }
}
