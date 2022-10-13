package javacallingprogramme;
/* Write a Java programme using the following steps.
        3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables into both instance and static methods inside the
        print statement.
        3.5 Declare the Main method.
        3.6 Call both instance and static methods into the Main method and run the programme

 */
public class Programme3 {
     int  a = 10; // instance variable
     static int  b = 10; // static variable
     public static void main(String []args){
          myMethod();
          Programme3 programme3= new Programme3();
     }
     public void meth1(){
          System.out.println(a);
          System.out.println(b);
     }
     public static void myMethod(){
          Programme3 programme3 = new Programme3();
          System.out.println(programme3.a);
          System.out.println(b);
     }

}
