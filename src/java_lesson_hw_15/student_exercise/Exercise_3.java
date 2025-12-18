package java_lesson_hw_15.student_exercise;

import java.util.ArrayList;

public class Exercise_3 {
         /*
    Задача 3:
    Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
    оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
    Написать метод, который удаляет студентов со средним баллом <3. Если средний
    балл>=3, студент переводится на следующий курс.
    Дополнительно написать метод
    printStudents(List<Student> students, int course), который получает список студентов и
    номер курса. А также печатает на консоль имена тех студентов из списка, которые
    обучаются на данном курсе.
    */
         public static void main(String[] args) {
             createStudents();
         }
         public static void createStudents(){
             Student dariaKolotova = new Student("Дарья Колотова","Biology Science",3);
             dariaKolotova.setMarks(new int[]{5,3,4,5,4});
             Student daniilKim = new Student("Даниил Ким", "Math Science",4);
             daniilKim.setMarks(new int[]{3,4,4,4,5});
             Student ivanSmirnov = new Student("Иван Смирнов","Linguistics", 2);
             ivanSmirnov.setMarks(new int[]{3,5,4,5,5});
             Student alexeyLanin = new Student("Алексей Ланин","International Relationship and Politic Science", 1);
             alexeyLanin.setMarks(new int[]{4,5,4,4,5});
             Student mariaLuzhkova = new Student("Мария Лужкова","Math Science", 1);
             mariaLuzhkova.setMarks(new int[]{4,3,4,4,5});
             Student lidiaSan = new Student("Лидия Сан","Biology Science", 3);
             lidiaSan.setMarks(new int[]{2,3,4,2,3});
             Student vladislavRepin = new Student("Владислав Репин","Linguistics", 2);
             vladislavRepin.setMarks(new int[]{2,2,4,2,3});

             University universityMain = new University();
             universityMain.setStudentList(new ArrayList<>());
             universityMain.getStudentList().add(dariaKolotova);
             universityMain.getStudentList().add(daniilKim);
             universityMain.getStudentList().add(ivanSmirnov);
             universityMain.getStudentList().add(alexeyLanin);
             universityMain.getStudentList().add(mariaLuzhkova);
             universityMain.getStudentList().add(lidiaSan);
             universityMain.getStudentList().add(vladislavRepin);

             universityMain.getAverageScore(dariaKolotova);
             System.out.println("-".repeat(100));
             universityMain.getAverageScore(vladislavRepin);

             System.out.println("-".repeat(100));
             universityMain.printStudents(universityMain.getStudentList(),2);
             System.out.println("-".repeat(100));
             universityMain.printStudents(universityMain.getStudentList(),3);

         }

}
