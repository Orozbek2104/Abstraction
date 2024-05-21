import com.sun.source.tree.NewArrayTree;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EDUCATIONCENTER educationcenter1 = new University("Manas", "Bishkek", LocalDate.of(1995, 2, 13));
        EDUCATIONCENTER educationcenter2 = new School("SH.TOksonow", "Batken", LocalDate.of(1990, 2, 23));
        EDUCATIONCENTER educationcenter3 = new College("MUK", "Bishkek", LocalDate.of(1985, 2, 10));
        EDUCATIONCENTER educationcenter4 = new College("MUK", "Bishkek", LocalDate.of(1985, 2, 10));
        EDUCATIONCENTER educationcenter5 = new College("MUK", "Bishkek", LocalDate.of(1985, 2, 10));



      Student student1 = new Student("Orozbek" , "Islambek uuklu", "M", LocalDate.of(2020, 12, 21),educationcenter1);
      Student student2 = new Student("oke" , "Islambek uuklu", "M", LocalDate.of(2018, 12, 21),educationcenter2);
      Student student3 = new Student("Oroz" , "Islambek uuklu", "M", LocalDate.of(2019, 12, 21),educationcenter3);
      Student student4 = new Student("Orozgul" , "Islambek uuklu", "M", LocalDate.of(2023, 12, 21),educationcenter4);
      Student student5 = new Student("Orozbai" , "Islambek uuklu", "M", LocalDate.of(2022, 12, 21),educationcenter5);

      Student[] students = {student1,student2,student3, student4, student5};
        for (Student student : students) {
            System.out.println(student);
            int i = LocalDate.now().getYear() - student.dateOfStart().getYear();
            System.out.println(student.name() +" "+ i + " jyl okudu" );
            System.out.println("```````````````````````````````````");
            if (i > 2){

                System.out.println( "2 jyldan kop okugan student:  " + student.name() );
            }else if (i < 2) {
                System.out.println("2 jyldan az okugan student:"+ student.name());

            }
        }
    }
}