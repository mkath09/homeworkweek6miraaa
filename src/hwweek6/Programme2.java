package javacallingprogramme;

/* Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
 */
public class Programme2 {
    static int x = 20; //static variable
    static int y = 20; //static variable
    public static void main(String[] args) {
        poj();
    }
    public static void poj() {
        System.out.println(x);
        System.out.println(y);
    }
}

