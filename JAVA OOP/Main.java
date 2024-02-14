//Creating class in java
public class Main {

    //Class Variables
    static int classVariable = 23;
    static String name = "Vithusan";

    //Instance Variables
    int instanceVariable = 6089;
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

    /*************************************************
        Methods --> Class Methods / Instance Method     
    *************************************************/
    //Class Methods
    public static void classMethod() {
        System.out.println("This is a class Method.");
        System.out.println("Class Variable Value : " + classVariable);
    }

    //Instance Variables
    public void instanceMethod() {
        System.out.println("This is a Instance Method.");
        System.out.println("Instance Variable Value : " + instanceVariable);
    }


    //Starting point of the program
    public static void main(String[] args) {
        //Creating Objects to Main class
        Main object1 = new Main();

        /*
        //Print Object
        System.out.println(object1);
        System.out.println(object2);
        */

        //Access instance Variables
        System.out.println("The value of ID : " + object1.instanceVariable);

        //Access class variables
        System.out.println("The value of name is : " + Main.name);

        //Call the class method
        classMethod();

        //Access instance Method
        object1.instanceMethod();
    }
}

