/**
 * @author liyuchen
 * @create 2018-11-01
 **/

// class dog

class Dog{
    int size;
    String breed;
    String name;
    void bark(){
        System.out.println("Ruff!");
    }
}
public class DogTestDrive {
    public static void main(String[] args){
//        Dog test
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}
