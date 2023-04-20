package weektest;

public abstract class Teacher {

    private String name;//成员变量
    private int age;
    private String phoneNumber;
    public abstract void teach();
    public void showInfo(){
        System.out.println("我叫"+name+"我的年龄是"+age+"我的联系方式是"+phoneNumber);
    }

    public Teacher() {
    }

    public Teacher(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

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
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
