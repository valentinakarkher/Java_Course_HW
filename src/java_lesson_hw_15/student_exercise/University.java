package java_lesson_hw_15.student_exercise;

import java.util.ArrayList;
//Написать метод, который удаляет студентов со средним баллом <3. Если средний
//балл>=3, студент переводится на следующий курс.
public class University {
    private ArrayList<Student> studentList;
    public University(){}

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    public void getAverageScore(Student student) {
        int []marks=studentList.get(studentList.indexOf(student)).getMarks();
       double markSum = 0.0;
       for (int mark : marks){
           markSum+=mark;
       }
       double averageMark = markSum/marks.length;
       if(averageMark<3){
           System.out.println(student+"\n"+"Ваш средний балл "+averageMark+ " меньше 3. Вы исключены из Университета!!");
           studentList.remove(student);
       } else if (averageMark>=3) {
           System.out.println(student+"\n"+"Ваш средний балл "+averageMark+ " больше или равен 3. Вы переведены на следующий курс Университета!!");
           int newCourseNum = student.getCourseNum()+1;
           student.setCourseNum(newCourseNum);
           System.out.println("Вы преведены на "+student.getCourseNum()+"й курс!");
       }
    }
    public void printStudents(ArrayList<Student> studentsList, int course){
        for(Student student: studentsList){
            if(student.getCourseNum()==course){
                System.out.println(student.getName()+" обучается на "+course+"м курсе");
            }
        }
    }
}
