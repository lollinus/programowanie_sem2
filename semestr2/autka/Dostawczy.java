//!
//! \file   Dostawczy.java
//! \author Jadzia Wsadzia <Krysia Marysia>
//! \date   Sun Mar 18 12:55:35 2012
//!
//! \brief  Defition of Dostawczy class
//!
//!
//!
package autka;
import autka.*;


class Dostawczy extends Auto {
        //!
        //! \class Simple container for two types used to represent ladunek in Dostawczy
        //!
        class Ladunek {
                public int ile;
                public String co;
        }
        class Przeladowanie extends java.lang.Exception {
                Przeladowanie(String e) {
                        super(e);
                }
                Przeladowanie(String e, java.lang.Exception cause) {
                        super(e, cause);
                }
        }

        private Ladunek[] ladunek; //!< tablica ladunkow

        public Dostawczy(int przebieg, int ileOsob, int pojemnosc, int ladownosc) {
                super(przebieg, ileOsob, pojemnosc);
                this.ladunek = new Ladunek[ladownosc];
        }

        //! dodaj ladunek do Dostawczego
        //!
        //! \param ladunek - ilosc ladunku
        //!
        public void laduj(int gdzie, int ile, String ladunek) throws Przeladowanie {
                if ( gdzie >= this.ladunek.length ) {
                        System.err.println("Brak kontenera: "+gdzie);
                        Dostawczy.Przeladowanie ex = new Dostawczy.Przeladowanie("Brak kontenera: "+gdzie);
                        throw ex;
                }
                Ladunek l = new Ladunek();
                l.ile = ile;
                l.co = ladunek;
                this.ladunek[gdzie]=l;
        }

        public String toString() {
                return "Dostawczy {" + super.toString() +
                        ", ladownosc:" + this.ladunek.length +
                        ", ladunek{" + this.toStringLadunek() + " }";
        }

        public String toStringLadunek() {
                String result = new String();
                for (Ladunek lad : ladunek) {
                        if (lad == null) {
                                result += "(nic)";
                        } else {
                                result += "("+lad.co+":"+lad.ile+")";
                        }
                }
                return result;
        }
}
