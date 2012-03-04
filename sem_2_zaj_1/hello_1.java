class hello_1 {
        public static void main(String [] a) {
                String firstname="Karol";
                String surnamename="Barski";
                int faculty=0;

                String faculty_name="Don't know";
                if( faculty==0 ) {
                        faculty_name = "TI";
                } else if( faculty==1 ) {
                        faculty_name = "Grafik";
                }
                System.out.println("Hi, " + firstname + " " + surnamename + " from " + faculty_name);
        };

}
