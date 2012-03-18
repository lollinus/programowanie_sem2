//!
//! \file   Osobowy.java
//! \author Jadzia Wsadzia <Krysia Marysia>
//! \date   Sun Mar 18 12:54:48 2012
//! 
//! \brief  Defition of osobowy class
//! 
//! 
//!
package autka;

class Osobowy extends Auto {
        public Osobowy(int przebieg, int ileOsob, int pojemnosc) {
                super(przebieg, ileOsob, pojemnosc);
        }
        public String toString() {
                return "Osobowy {" + super.toString() + " }";
        }
}
