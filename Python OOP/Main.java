//Creating class in java
public class Main {

    //Class Variables
    static int age = 23;
    static String name = "Vithusan";

    //Instance Variables
    int id = 6089;
    String nic = "123456789";

    //Creating Constructor
    public Main() {
        System.out.println("Hello iam Constructor!");
    }
    
    /*
    //Print Object Deatils
    public String toString() {
        return "This is Main Object";
    }
    */

    //Starting point of the program
    public static void main(String[] args) {
        //Creating Objects to Main class
        Main object1 = new Main();

        /*
        //Print Object
        System.out.println(object1);
        System.out.println(object2);
        */

        //Print instance Variables
        System.out.println("ID : " + object1.id);
    }
}

