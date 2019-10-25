import java.util.Scanner;

public class PaymentApp {
    public static void main(String[] args)
    {
        boolean PositivePayment=true ;
        double payment=0 ;


          do {
              System.out.println("Enter your amount:") ;
              Scanner in=new Scanner(System.in);
              payment = in.nextDouble();
              try {

                  if (payment < 0)
                  {
                      throw new test(payment);
                  }
                  else
                      break;
              } catch (test e) {
                  System.out.println(e.toString());
                  PositivePayment=false ;
              }

          }while(PositivePayment==false) ;

      System.out.println("Thank you for paying your payment of $:" + payment) ;
    }
}
