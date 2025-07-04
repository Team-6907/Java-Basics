//Project Name: Spectrum 4th Program
public class JavaIntro4 {
    /*add 4 to the parameter sent to the method and return the result*/
    public static double addFour(double num){ // the variable type before the method name is what type will be returned
        return num + 4; //return is the keyword that tells java to end the method and send the value
    }

    /*if the boolean named bol is true than print out the double named num*/
    public static void ifTruePrint(boolean bol, double num){ //void means the method won't return any value
        if (bol){
            System.out.println(num);
        }
    } //this method doesn't return a value

    public static void main(String[] args) { //This line lets Java know what to run when you click execute below
        boolean b1 = true;
        boolean b2 = false;
        double x = 10;
        double y = 20;

        System.out.println(addFour(x));

        ifTruePrint(b1, x); //if b1 is true print x
        ifTruePrint(!b1, y); //if b1 is not true print y
    }
}
