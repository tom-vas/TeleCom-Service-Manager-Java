import java.util.*;
public class ServiceCollection extends Service{
    
    private ArrayList <Service> services = new ArrayList<Service>();

    public void addService(Service s){
        services.add(s);
    }
    
}
