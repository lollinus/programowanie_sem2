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
        public static void main(String[] args) throws Dostawczy.Przeladowanie, Osobowy.WolneMiejsce, Osobowy.BrakMiejsc, Osobowy.Zajete {
                Auto a = new Auto(1, 2, 3);
                System.out.println(a);

                Osobowy o = new Osobowy(5, 6, 7);
                System.out.println(o);

                Dostawczy d = new Dostawczy(7, 8, 9, 10);
                System.out.println(d);
                System.out.println("laduje -> " + 1 + " -> 10 jabka");
                d.laduj(1, 10, "jabka");
                System.out.println(d);

                System.out.println("laduje -> " + 7 + " -> 20 gruchy");
                d.laduj(7, 20, "gruchy");
                System.out.println(d);

                o = new Osobowy(100, 5, 5);
                System.out.println(o);
                o.wsiadl(1, "zenek");
                System.out.println(o);

                try {
                        o.wsiadl(5, "janek");
                } catch (java.lang.Exception ex) {
                        System.out.println("Exception: " + ex);
                }
                System.out.println(o);
        }
}
