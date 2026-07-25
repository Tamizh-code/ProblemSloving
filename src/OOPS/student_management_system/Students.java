package student_management_system;

public class Students {
    private int id;
    private String name;
    private int year;
    private String dept;
    private String email;
    //PRIVATE CONSTRUCTOR
    private  Students(int id,String name,String dept,String email,int year) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.dept = dept;
        this.email = email;
    }
    //create object
    public static Students newStudent(int id,String name,String dept,String email,int year){
        return new Students(++id,name,dept,email,year);
    }
//GETTER STARTS;
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDept() {
        return dept;
    }

    public String getEmail() {
        return email;
    }
   //SETTER STARTS;
    

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //print

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dept='" + dept + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
