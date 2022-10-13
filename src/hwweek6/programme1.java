package javacallingprogramme;

/* Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */
public class programme1 {
    int a = 20;//one instance variable
    int b = 20;//two instance variable
    public static void main(String[]args){
        programme1 obj = new programme1();
        obj.ins();
    }
    //instance
    public void ins() {
        System.out.println(a);
        System.out.println(b);
    }
}

