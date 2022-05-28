package com.example.userlogin;

public class DataModel {
    String Sl_No,Date,Description,Debit,Credit,Balance;

//    public DataModelR(String Sl_No, String Date,String Description) {
//        this.Sl_No = Sl_No;
//        this.Date = Date;
//        this.Description = Description;
//    }

    public DataModel(String Sl_No, String Date, String Description,String Debit,String Credit,String Balance) {
        this.Sl_No = Sl_No;
        this.Date = Date;
        this.Description = Description;
        this.Debit = Debit;
        this.Credit = Credit;
        this.Balance = Balance;
    }

    public String getSl_No() {
        return Sl_No;
    }

    public void setSl_No(String Sl_No) {
        Sl_No = Sl_No;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        Date = Date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        Description = Description;
    }

    public String getCredit() {
        return Credit;
    }

    public void setCredit(String Credit) {
        Credit = Credit;
    }

    public String getDebit() {
        return Debit;
    }

    public void setDebit(String Debit) {
        Debit = Debit;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String Balance) {
        Balance = Balance;
    }
}
