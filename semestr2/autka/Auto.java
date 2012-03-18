//!
//! \file   Auto.java
//! \author Jadzia Wsadzia <Krysia Marysia>
//! \date   Sun Mar 18 12:54:27 2012
//!
//! \brief  Base class for all auto types
//!
//!
//!
package autka;

class Auto {
        private int przebieg;
        private int ileOsob;
        private int pojemnosc;

        public Auto(int przebieg, int ileOsob, int pojemnosc) {
                this.przebieg=przebieg;
                this.ileOsob=ileOsob;
                this.pojemnosc=pojemnosc;
        }

        public String toString() {
                return "przebieg:" +this.przebieg+
                        ", ileOsob:" +this.ileOsob+
                        ", pojemnosc:" +this.pojemnosc;
        }
}
