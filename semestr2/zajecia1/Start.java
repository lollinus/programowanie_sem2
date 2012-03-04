package zajecia1;

public class Start {
        public static void main(String [] args) {
                Student student = new Student();
                student.name = "Karol";
                student.surname = "Barski";
                student.birthYear = 78;

                System.out.println("Student: " + student.name + " " + student.surname + " " + student.birthYear);
        }
}
