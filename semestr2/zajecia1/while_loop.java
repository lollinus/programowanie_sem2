package zajecia1;

public class while_loop {
        public static void main(String [] args) {
                int counter = 11;
                while (counter <= 10) {
                        System.out.println("Counter value is " + counter);
                        // zwiekszamy wartosc licznika
                        // bez nastepnej instrukcji program wpadlby w
                        // wieczna petle poniewaz wartosc licznika by
                        // sie nie zmieniala a co za tym idzie warunek
                        // petli zawsze by byl prawdziwy
                        counter++;
                }
        }
}
