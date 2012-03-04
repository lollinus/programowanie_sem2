package zajecia1;

/**
 * @class Student
 * Sample class storing Student information
 */
public class Student {
        public Student(String name, String surname, int birthYear) {
                this.name = name;
                this.surname = surname;
                this.birthYear = birthYear;
        }

        public String format() {
                return "Student { name: " + this.name + ", surname: " + this.surname + ", birthYear: " + this.birthYear + "}";
        }

        public void print() {
                System.out.println(this.format());
        }

        public void print(String yo) {
                System.out.println(yo);
        }

        private String name;      //< student name
        private String surname;   //< student surname
        private int    birthYear; //< student birth name
}
