import java.lang.Object;
import java.util.Objects;

public class Ex4 {
    public static void main(String [] args){
          System.out.println("Comparable is in the java.util package." + "is false");

          Integer number  = 120000;
          Integer number1 = 1000;
          System.out.println(number.compareTo(number1));

          System.out.println("Comparator is in the java.util package." +  "is true");

          Integer nr1 = 110;
          Integer nr2 = 110;

          System.out.println(nr1.compare(nr2, nr1));
          System.out.println(nr1.equals(nr2));


          System.out.println("compare() is in the Comparable interface." + " is false .");
          System.out.println("compare() is in the Comparator interface." + " is true");
          System.out.println("compare() takes one method parameter"      + " is false. ");
          System.out.println("compare() takes two method parameters."    + " is true. ");
    }
}
