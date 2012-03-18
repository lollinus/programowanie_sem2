//!
//! \file   Start.java
//! \author Jadzia Wsadzia <Krysia Marysia>
//! \date   Sun Mar 18 12:53:02 2012
//!
//! \brief  starter app for autka
//!
//!
//!
package autka;
import autka.*;

class Start {
        public static void main(String[] args) {
                Auto a = new Auto(1, 2, 3);
                System.out.println(a);

                Osobowy o = new Osobowy(5, 6, 7);
                System.out.println(o);

                Dostawczy d = new Dostawczy(7, 8, 9, 10);
                System.out.println(d);
                System.out.println("laduje -> " + 5);
                d.laduj(5);
                System.out.println(d);

                System.out.println("laduje -> " + 7);
                d.laduj(7);
                System.out.println(d);
        }
}
