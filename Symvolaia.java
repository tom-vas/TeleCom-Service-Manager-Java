import java.time.LocalDate;
import java.util.*;


public class Symvolaia  {
    //xarakthristika
    private int kwdikos_symv;
    private String yphresia;
    private String Name;
    private String Tel_Number;
    private String date;
    private String Payment_Method;
    private float Extra_Disc;
    //statistika
    private int XronosOmilias = 0;
    private int Sms = 0;
    private int OgkosData = 0;
    private double Spent = 0;

    public Symvolaia(){
    }

    public Symvolaia(int kwdikos_symv, String yphresia, String Name, String Tel_number,String date,String Payment_Method){
        this.kwdikos_symv=kwdikos_symv;
        this.yphresia=yphresia;
        this.Name=Name;
        this.Tel_Number=Tel_number;
        this.date=date;
        this.Payment_Method=Payment_Method;
    }

    public Symvolaia(int XronosOmilias,int Sms){
        this.XronosOmilias=XronosOmilias;
        this.Sms=Sms;
    }

    public Symvolaia(int OgkosData){
        this.OgkosData=OgkosData;
    }


    public int getKwdikos_symv(){
        return kwdikos_symv;
    }

    public void setYphresia(String yphresia){
        this.yphresia=yphresia;
    }
    public String get_yphresia(){
        return yphresia;
    }

    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
    public void setTel_Number(String Tel_Number){
        this.Tel_Number=Tel_Number;

    }
    public String getTel_Number(){
        return Tel_Number;
    }

    public void setDate(String date){
        this.date=date;

    }

    public String getDate(){
        return date;
    }

    public String getPayment_Method(){
        return Payment_Method;
    }

    public float getExtra_Disc(){
        return Extra_Disc;
    }

    public void setExtra_Disc(float Extra_Disc){
        this.Extra_Disc=Extra_Disc;
    }

    public int getXronosOmilias(){
        return XronosOmilias;
    }

    public int getSms(){
        return Sms;
    }

    public int getOgkosData(){
        return OgkosData;
    }
    public double getSpent(){
        return Spent;
    }
    public void setXronosOmilias(int XronosOmilias){
        this.XronosOmilias=XronosOmilias;
    }
    public void setSMS(int Sms){
        this.Sms=Sms;
    }

    public void setData(int OgkosData){
        this.OgkosData=OgkosData;
    }
    
    public void setSpent(double Spent){
        this.Spent=Spent;
    }

    public void setKwdikos(int kwdikos_symv){
        this.kwdikos_symv=kwdikos_symv;
    }

    public String toString(){
        return ("ID: "+ getKwdikos_symv()+"\tYphresia: "+ get_yphresia()+"\tName: "+getName()+"\tTel_Number: "+getTel_Number()+"\tDate: "+getDate()+"\tPayment_Method: "+getPayment_Method());
    }

    public String toString2(){
        if (get_yphresia()=="MONTH FAVORITE 1" || get_yphresia()=="MONTH FAVORITE 2"){
            return ("ID: "+ getKwdikos_symv()+"\tYphresia: "+ get_yphresia()+"\tName: "+getName()+"\tYpoloipo: ");
        }else{
            return ("ID: "+ getKwdikos_symv()+"\tYphresia: "+ get_yphresia()+"\tName: "+getName()+"\tKostos: ");
        }
    }

    public String toString3(int lepta,int sms,int data,double ypoloipo){
        return ("ID: "+ getKwdikos_symv()+"\tYphresia: "+ get_yphresia()+"\tName: "+getName()+"\tlepta: "+lepta+"\tsms: "+sms+"\tdata: "+data+"\typoloipo: "+ypoloipo);
    }


    
}
