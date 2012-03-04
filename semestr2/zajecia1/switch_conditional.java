package zajecia1;

class switch_conditional {
        public static void main(String [] a) {
                String firstname="Karol";
                String surnamename="Barski";
                int faculty=0;

                String faculty_name="Don't know";
                switch (faculty) {
                case 0:
                        faculty_name = "TI";
                        break;
                case 1:
                        faculty_name = "Grafik";
                        break;
                default:
                        faculty_name = "Yo";
                }
                System.out.println("Hi, " + firstname + " " + surnamename + " from " + faculty_name);
        };
}
