package java_lesson_hw_8;

public class Animal {
    private String type;
    private String age;
    private String color;
    private String gender;

    public Animal(String type,String age, String color, String gender){
        this.type=type;
        this.age=age;
        this.color=color;
        this.gender=gender;

    }
    public String getType(){
        return type;
    }
    public String getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
    public String getGender(){
        return gender;
    }
    public void voice(){
        System.out.println("Animal's voice is : ...");
    }
    public void eat(String food){
        System.out.println("Animal eats "+ food);
    }


}
