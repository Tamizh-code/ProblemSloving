package June_July_Placement.BANKING_APP.Model;

public class Transaction {
    private int T_Id;
    private String T_Status;
    private String T_Type;
    private int Amount;
    private String Date;
    private int Ac_No;

    public Transaction(int t_Id, String t_Status, String t_Type, int amount, String date, int ac_No) {
        T_Id = t_Id;
        T_Status = t_Status;
        T_Type = t_Type;
        Amount = amount;
        Date = date;
        Ac_No = ac_No;
    }

    public int getT_Id() {
        return T_Id;
    }

    public void setT_Id(int t_Id) {
        T_Id = t_Id;
    }

    public String getT_Status() {
        return T_Status;
    }

    public void setT_Status(String t_Status) {
        T_Status = t_Status;
    }

    public String getT_Type() {
        return T_Type;
    }

    public void setT_Type(String t_Type) {
        T_Type = t_Type;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getAc_No() {
        return Ac_No;
    }

    public void setAc_No(int ac_No) {
        Ac_No = ac_No;
    }
}
