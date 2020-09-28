package java_fundamentals;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public Student(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public void setCity(String city){
        this.city=city;
    }

    public String getCity(){
        return this.city;
    }

    public int getAge(){
        return this.age=age;
    }

    public String getFisrtName(){
        return this.firstName=firstName;
    }

    public String getLastName(){
        return this.lastName=lastName;
    }
}
