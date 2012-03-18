//!
//! \file   start.java
//! \author Jadzia Wsadzia <Krysia Marysia>
//! \date   Sun Mar 18 12:26:50 2012
//!
//! \brief  Main class of a project
//!
//!
//!
package zajecia2;
import java.util.Arrays;
import zajecia2.*;

class start {
        public static void main(String[] args) {
                int a = 0;
                calculator c = new calculator();
                System.out.println("Calculator suma: " + c.suma(4, 5));

                int[] values= new int[]{1,2,3,4,5};
                MathOperations mo = new MathOperations();
                System.out.println("Arithmetic mean: "+mo.arithmethicMean(values));
        }
}

