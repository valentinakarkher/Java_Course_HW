package java_lesson_hw_15.student_exercise;

import java.util.Arrays;

public class Student {
    //Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
    //оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
    private final String name;
    private final String group;
    private int courseNum;
    private int[] marks;
    public Student (String name, String group, int courseNum){
        this.name= name;
        this.group=group;
        this.courseNum=courseNum;
    }
    public String getName() {
        return name;
    }
    public String getGroup() {
        return group;
    }
    public int getCourseNum() {
        return courseNum;
    }
    public void setCourseNum(int courseNum) {
        this.courseNum=courseNum;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public int[] getMarks() {
        return marks;
    }
    @Override
    public String toString() {
        return "Имя Фамилия : "+getName()+"\n"+
                "Группа : "+ getGroup()+"\n"+
                "Курс : "+getCourseNum()+"\n"+
                "Оценки : "+ Arrays.toString(getMarks());
    }
}
