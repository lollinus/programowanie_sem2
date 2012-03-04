package zajecia1;

public class for_loop {
        public static void main(String [] args) {
                for (int i=0; i<=10; i++) {
                        // pomin nieparzyste
                        if(i%2==1) {
                                continue;
                        }

                        System.out.println("Iteration " + i);

                        // przerwij jezeli trafilismy na 4
                        if(i==4) {
                                break;
                        }
                }
        }
}
