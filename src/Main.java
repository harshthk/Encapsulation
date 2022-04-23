//Encapsulation >> Binding data with method
class student{
    private int age;
    private String name;
    // here two method use getter and setter
    //this method is used to set the data of age
    public void setAge(int age){
        this.age = age;
    }
    //this method is used to get the data of age and return type will be int
    public int getAge() {
        return age;
    }
    //this method is used to set the data of name
    public void setName(String name){
        this.name = name;
    }
    //this method is used to get the data of name and return type will be string
    public String getName(){
        return name;
    }
}
public class Main {
    public static void main(String[] args)
    {
        student s1 = new student();
        s1.setName("harsh"); // here the name is define through method
        s1.setAge(25);// here the age is define through method
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}