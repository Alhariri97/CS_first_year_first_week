/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seminar.netbeans.and.primitives;

/**
 *
 * @author hariri . Shcool of Computing, Engineering & Digiital Technologies
 */
public class SeminarNetBeansAndPrimitives {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Java World");
        testPrimitives();
        TestArithmetic();
        numbers();
        formulaToJava();
    }
    public static void testPrimitives() {
           int numberOfSweets;
           boolean isPregnant; 
           double itemPrice; 
           char studentGrade;
           numberOfSweets = 41;
           
           isPregnant = false;
           itemPrice = 17.99;
           studentGrade = 'C';
           //7 - a:
           System.out.println("-".repeat(70)); //nothing
            System.out.println(numberOfSweets +  studentGrade);
            System.out.println(itemPrice);
            System.out.println(isPregnant);
            
            System.out.println("-".repeat(70));
            //7 - b: 
            int weightInKilos = 77;
            System.out.println(weightInKilos);
            System.out.println("-".repeat(70));
            // 8:
            int x = 10 + 5;
            System.out.println(x);
            
            // 12: 
            System.out.println("-".repeat(60));
           int first;
           int second;
           first = 17;
           second = first; 
           System.out.println(second);
           int a = 65; 
           char chart = (char) a; 
           System.out.println(chart); //>> A
           char letterD = 'D';
           int numberD = (int )letterD;
           System.out.println(numberD); //>> 68
           System.out.println("-".repeat(70));
           //13:
           double errorNumber = numberOfSweets;
           System.out.println(errorNumber ); // >> 41.0 
           // boolean falseyValue = studentGrade; // error and cant caste it;           
        }
        
    //9:
    public static void TestArithmetic(){
        System.out.println ("-".repeat(70));

        int a,b,c;
        a = 3; 
        b = 5;
        c = 10;
        int d = a + c;
        
        System.out.println(d );
        int e = b + c; 
        System.out.println(e);
        int f =  b/ a;
        System.out.println(f);
        int g =  c / a;
        System.out.println(g);
        double h = c/a;
        System.out.println(h);
        System.out.println("to get the fractions correctly I need to \n "
                + " turn one of the numbers are divieded to a double.");
        double correct = (double) c / a; 
        System.out.println(correct);
        System.out.println("-".repeat(60));
        int celsius = 30;
        int fahrenhiet = celsius  * 9 / 5 + 32;
        System.out.println(fahrenhiet);
        
        int fah2 = 0;
        System.out.println((fah2 -32 ) * 5/9);
    }    
    public static void numbers (){
    //10:
        System.out.println("-".repeat(60));
        int n = (int)3.9;
        System.out.println("n == " + n);
        //11:
        double number = (5/7) * 7;
        System.out.println(number);
        System.out.println("it's Zero, and that's again because \n"
                + "of the (5/7)=0.7 and since 5 and 7 both are integers \n we'll get only the int which is 0   \n"
                + "so we'll end up with 0 * 7 = 0 :) ");
        
    }
    public static void formulaToJava(){
        int x = 1, y = 1, z = 1;
        int formula1 = 3 * x + y;
        int formula2 = x + y / 7;
        int formula3 = 3 * x + y / z +2;
    }
}

