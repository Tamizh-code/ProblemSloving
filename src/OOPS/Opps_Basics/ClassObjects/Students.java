package Opps_Basics.ClassObjects;

public class Students {
    String name;
    int RollNo;
    int Mark;
    public Students(String Name,int Rollno,int mark){
        this.name=Name;
        this.RollNo=Rollno;
        this.Mark=mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return RollNo;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", RollNo=" + RollNo +
                ", Mark=" + Mark +
                '}';
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public int getMark() {
        return Mark;
    }

    public void setMark(int mark) {
        Mark = mark;
    }
}
