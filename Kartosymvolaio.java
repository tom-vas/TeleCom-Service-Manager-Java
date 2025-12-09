public class Kartosymvolaio extends Service{
    private double ipoloipo;
    private int minutes;
    private int SMS;
    private double xrewsiSMS;
    private double xrewsiMin;
    private String serviceType = "Kartosymvolaio";
    
    public Kartosymvolaio(String name,int pagio, int minutes, int SMS, double xrewsiSMS, double xrewsiMin, double ipoloipo){
        super(name,pagio);
        this.minutes = minutes;
        this.SMS = SMS;
        this.xrewsiSMS = xrewsiSMS;
        this.xrewsiMin = xrewsiMin;
        this.ipoloipo=ipoloipo;

    }

    public Kartosymvolaio(){
    }

    public void setMinutes(int minutes){
        this.minutes=minutes;
    }

    public void setSMS(int SMS){
        this.SMS=SMS;
    }

    public void setXrewsiMinutes(double xrewsiMin){
        this.xrewsiMin=xrewsiMin;
    }

    public void setXrewsiSMS(double xrewsiSMS){
        this.xrewsiSMS=xrewsiSMS;
    }

    public void setYpoloipo(double ipoloipo){
        this.ipoloipo=ipoloipo;
    }

    public int getMinutes(){
        return minutes;
    }
    public int getSMS(){
        return SMS;
    }
    public double getXrewsiSMS(){
        return xrewsiSMS;
    }
    public double getXrewsiMin(){
        return xrewsiMin;
    }

    public double getYpoloipo(){
        return ipoloipo;
    }


    public String toString(){
        return(super.toString()+ "\t Free Lepta Omilias: "+ getMinutes() +"\tFree Sms: "+ getSMS() +"\t Xrewsh ana lepto meta ta free: "+ getXrewsiMin()+"\t Xrewsh ana sms meta ta free: "+ getXrewsiSMS() );
    }
        
    
    
}
