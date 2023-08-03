import java.util.Scanner;

public class Person {
    private String name;

    public String getName(){
        Scanner nameScan = new Scanner(System.in);
        System.out.println("What is your name?");
        String userInput = nameScan.nextLine();
        return userInput;
    }

    public void setName(String userInput){
        this.name = userInput;

    }
    public void sayHello(){
        System.out.println("Hello from " + name + "!");
    }

    public static void main(String[] args) {
        Person ty = new Person();
        ty.setName(ty.getName());
        ty.sayHello();

//        Person person1 = new Person();
//        Person person2 = new Person();
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person();
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person();
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName(person1.getName());
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}





