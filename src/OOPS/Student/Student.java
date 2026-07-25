package Student;

public class Student {
//    private static int id=100;
    private String name;
    private int age;
    private String heigth;
    private String email;
    private String phone;
    private Student(String name, int age, String heigth,String email,String phone) {
        this.name = name;
        this.age = age;
        this.heigth = heigth;
        this.email = email;
        this.phone = phone;
    }
    public static Student newStudent(String name, int age, String heigth, String email,String phone) {
        return new Student(name, age, heigth,email,phone);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getHeigth() {
        return heigth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHeigth(String heigth) {
        this.heigth = heigth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heigth='" + heigth + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
