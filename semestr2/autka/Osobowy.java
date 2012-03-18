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
        class BrakMiejsc extends java.lang.Exception {
                BrakMiejsc(String e) {
                        super(e);
                }
                BrakMiejsc(String e, java.lang.Exception cause) {
                        super(e, cause);
                }
        }

        class Zajete extends java.lang.Exception {
                Zajete(String e) {
                        super(e);
                }
                Zajete(String e, java.lang.Exception cause) {
                        super(e, cause);
                }
        }

        class WolneMiejsce extends java.lang.Exception {
                WolneMiejsce(String e) {
                        super(e);
                }
                WolneMiejsce(String e, java.lang.Exception cause) {
                        super(e, cause);
                }
        }

        String[] osoby;
        public Osobowy(int przebieg, int ileOsob, int pojemnosc) {
                super(przebieg, ileOsob, pojemnosc);
                osoby = new String[ileOsob];
        }

        public String toString() {
                return "Osobowy {" + super.toString() + ", " + pasazerowie() + " }";
        }


        public void wsiadl(int gdzie, String kto) throws Zajete {
                if (osoby[gdzie] != null) {
                        throw new Zajete(osoby[gdzie]);
                }
                osoby[gdzie] = kto;
        }

        public void wysiadl(int skad) throws WolneMiejsce {
                if (osoby[skad] == null) {
                        throw new WolneMiejsce(""+skad);
                }
                osoby[skad]=null;
        }

        public String pasazerowie() {
                String result = "Pasazerowie {";
                for (String osoba : osoby) {
                        result += osoba + ", ";
                }
                result += "}";
                return result;
        }
}
