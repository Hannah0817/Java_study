package homework3_1;
//3面向对象综合练习
public abstract class Person {
    private String name;
    private int year;

    public Person() {
    }

    public Person(String name, int year){
        this.name= name;
        this.year= year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void eat(){
        System.out.println("去食堂吃饭");
    }
}
