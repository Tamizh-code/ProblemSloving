package June_July_Placement.BANKING_APP.Model;

public class User {
    private int Ac_No;
    private int Ph_No;
    private int Cus_Id;
    private String Name;

    public User(int ac_No, int ph_No, int cus_Id, String name) {
        Ac_No = ac_No;
        Ph_No = ph_No;
        Cus_Id = cus_Id;
        Name = name;
    }

    public int getAc_No() {
        return Ac_No;
    }

    public void setAc_No(int ac_No) {
        Ac_No = ac_No;
    }

    public int getPh_No() {
        return Ph_No;
    }

    public void setPh_No(int ph_No) {
        Ph_No = ph_No;
    }

    public int getCus_Id() {
        return Cus_Id;
    }

    public void setCus_Id(int cus_Id) {
        Cus_Id = cus_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
