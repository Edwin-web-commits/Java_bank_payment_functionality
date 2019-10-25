public class test extends Exception {

        double payment ;

        public test(double payment)
        { this.payment=payment ;
        }
        public String toString()
        { return "Cannot take a negative amount:"+ payment ;
        }

    }

