//!
//! \file   MathOperations.java
//! \author Jadzia Wsadzia <Krysia Marysia>
//! \date   Sun Mar 18 12:40:05 2012
//!
//! \brief  simple Mathematic Operations class
//!
//!
//!
package zajecia2;

class MathOperations {
        public float arithmethicMean(int[] values) {
                int sum=0;
                for (int i: values) {
                        sum+=i;
                }
                return sum/values.length;
        }
        public float median(int[] values) {
        }
}
