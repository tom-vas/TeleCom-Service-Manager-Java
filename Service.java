public class Service {

    private String serviceName;
    private int pagio;
    private String serviceType;
    private double cost;

    public Service(){
    }

    public Service(String serviceName, int pagio){
        this.serviceName=serviceName;
        this.pagio=pagio;

    }

    public void setServiceName(String serviceName){
        this.serviceName=serviceName;
    }
    public String getServiceName(){
        return serviceName;
    }
    
    public void setPagio(int pagio){
        this.pagio=pagio;
    }
    public int getPagio(){
        return pagio;
    }

    public void setServiceType(String serviceType){
        this.serviceType=serviceType;
        


    }

    public double getCost(double cost){
        return cost;
    }

    public String toStringName(){
        return ("Name: "+ getServiceName());
    }

    public String toString(){
        return ("Name: "+ getServiceName() + "\t Pagio: "+ getPagio());
    }













    


}
