package javacallingprogramme;
/*
Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4 {
    int b = 25; //instance variables
    int c = 25; //instance variables
    static int d = 25; //static variables
    static int f = 25; //static variables
    public static void main (String [] args ){
        Programme4 programme4 = new Programme4();
        System.out.println(programme4.b);
        System.out.println(d);

    }
    public void myFirstMethod(){
        System.out.println(b);
        System.out.println(c);
        System.out.println(Programme4.d);
        System.out.println(Programme4.f);


    }
    public static void myMethod (){

    }


}
