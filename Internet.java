public class Internet extends Service {
    private int ogkos;
    private double xrewsiInt;
    private String serviceType = "Internet";

    public Internet(String name, int pagio, int ogkos,double xrewsiInt ){
        super(name,pagio);
        this.ogkos=ogkos;
        this.xrewsiInt=xrewsiInt;
    }

    public Internet(){
        
    }

    public void setOgkos(int ogkos){
        this.ogkos=ogkos;
    }
    public int getOgkos(){
        return ogkos;
    }

    public void setXrewsiInt(double xrewsiInt){
        this.xrewsiInt=xrewsiInt;
    }
    public double getXrewsiInt(){
        return xrewsiInt;
    }

    public String toString(){
        return(super.toString()+ "\t Free MB: "+ getOgkos() +"\t Xrewsh ana MB: "+ getXrewsiInt());
    }

    
}
