package java复习;

class Student{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 6){
            this.age = 7;
        }else {
            this.age = age;
        }
    }
}
public class Demo02 {
}
