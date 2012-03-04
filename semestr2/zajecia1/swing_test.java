package zajecia1;

import javax.swing.*;

public class swing_test {

        private static void createAndShowGUI() {
                // Create and set up the window.
                JFrame frame = new JFrame("swing test program here");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Add the ubiquitous "Hello" label.
                JLabel label = new JLabel("Hello");
                frame.getContentPane().add(label);

                frame.pack();
                frame.setVisible(true);
        }

        public static void main(String[] args) {
                // Schedule a job for the event-dispatching thread:
                // creating and showing this application's GUI.Shell shell = new Shell(display);
                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                                createAndShowGUI();
                        }
                });
        }
}
