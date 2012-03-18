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

class Dostawczy extends Auto {
        private int ladownosc;
        private int ladunek;

        public Dostawczy(int przebieg, int ileOsob, int pojemnosc, int ladownosc) {
                super(przebieg, ileOsob, pojemnosc);
                this.ladownosc = ladownosc;
                this.ladunek = 0;
        }

        //! dodaj ladunek do Dostawczego
        //!
        //! \param ladunek - ilosc ladunku
        //!
        public void laduj(int ladunek) {
                this.ladunek += ladunek;
                if ( this.ladunek > this.ladownosc) {
                        System.err.println("Przeladowanie");
                }
        }
        public String toString() {
                return "Dostawczy {" + super.toString() +
                        ", ladownosc:" + this.ladownosc +
                        ", ladunek:" + this.ladunek + " }";
        }
}
