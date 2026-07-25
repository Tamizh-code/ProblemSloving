package June_July_Placement.BANKING_APP.Model;

public  class Account {
    private int Ac_No;
    private String Ac_type;
    private int Balance;
    public Account(int Ac_No,String Ac_type,int Balance){
        this.Ac_No=Ac_No;
        this.Ac_type=Ac_type;
        this.Balance=Balance;
    }

    public Account() {
    }

    public int getAc_No() {
        return Ac_No;
    }

    public void setAc_No(int ac_No) {
        Ac_No = ac_No;
    }

    public String getAc_type() {
        return Ac_type;
    }

    public void setAc_type(String ac_type) {
        Ac_type = ac_type;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}
