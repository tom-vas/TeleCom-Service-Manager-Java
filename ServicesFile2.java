/*import java.io.*;
import java.util.*;
//den mporousame sigoura na katalavoume kai na ylopoihsoume pws na diavazei tags aneksarthtou seiras,
//wstoso oriste o kwdikas kai h prospa8eia mas 
public class ServicesFile2 extends ServiceCollection {
    private ArrayList<Service> ProviderServices = new ArrayList<Service>();

    public void loadFile(String data) {
        File f = null;
        BufferedReader reader = null;
        Service service = new Service();
        String line;
        int counter=0;
        try {
            f = new File(data);
        } catch (NullPointerException e) {
            System.err.println("File not found.");
        }
        try {
            reader = new BufferedReader(new FileReader(f));
        } catch (FileNotFoundException e) {
            System.err.println("Error opening file!");
        }
        try {
            line = reader.readLine();
            if (line != null) {
                if (line.trim().equals("SERVICE_LIST") || line.trim().equals("service_list")) {
                    line = reader.readLine();
                    if (line.trim().equals("{")) {
                        line = reader.readLine();
                        while (line != null) {
                            if (line.trim().equals("}")) {
                                break;

                            }else if (line.trim().equals("SERVICE") || line.trim().equals("service")) {
                                line = reader.readLine();
                                if (line.trim().equals("{")) {
                                    line = reader.readLine();
                                    int i = 0;
                                    while (i < 3){
                                        if (line.trim().startsWith("SERVICE_NAME ") || line.trim().startsWith("service_name ") ||line.trim().startsWith("TYPE ") || line.trim().startsWith("type ") ){
                                            if (line.trim().startsWith("SERVICE_NAME ") || line.trim().startsWith("service_name ")) {
                                                service.setServiceName(line.substring(13).trim());
                                                line = reader.readLine();
                                                counter=counter + 1;
                                            }else if (line.trim().startsWith("TYPE ") || line.trim().startsWith("type ")){
                                                counter=counter +1;
                                                if (line.trim().substring(5).trim().equals("symvolaio_kin")){
                                                    symvolaio_kin service1 = new symvolaio_kin();
                                                    service1.setServiceName(service.getServiceName());
                                                    line = reader.readLine();
                                                    if (line.trim().startsWith("MONTHLY_PRICE ") || line.trim().startsWith("monthly_price ")) {
                                                        service1.setPagio(Integer.parseInt(line.substring(14).trim()));
                                                        line = reader.readLine();
                                                        counter = counter + 1;
                                                        if (line.trim().startsWith("FREE_MINUTES ") || line.trim().startsWith("free_minutes "))
                                                            service1.setMinutes(Integer.parseInt(line.substring(13).trim()));
                                                        line = reader.readLine();
                                                        if (line.trim().startsWith("FREE_SMS ") || line.trim().startsWith("free_sms "))
                                                            service1.setSMS(Integer.parseInt(line.substring(9).trim()));
                                                        line = reader.readLine();
                                                        if (line.trim().startsWith("XREWSH_MINUTES ") || line.trim().startsWith("xrewsh_minutes "))
                                                            service1.setXrewsiMinutes(
                                                                    Double.parseDouble(line.substring(15).trim()));
                                                        line = reader.readLine();
                                                        if (line.trim().startsWith("XREWSH_SMS ")||line.trim().startsWith("xrewsh_sms "))
                                                            service1.setXrewsiSMS(
                                                                    Double.parseDouble(line.substring(11).trim()));
                                                        line = reader.readLine();
                                                        if (line.trim().equals("}"))
                                                            ProviderServices.add(service1);
                                                    }else{
                                                        System.out.println("ERROR! MONTHLY_PRICE NOT FOUND");
                                                        while (true) {
                                                            line = reader.readLine();
                                                            if (line.trim().equals("}")) 
                                                                break;
                                                            
                                                        }
                                                        
    
                                                    }
                                                } else if (line.trim().substring(13).trim().equals("Kartosymvolaio")) {
                                                    Kartosymvolaio service1 = new Kartosymvolaio();
                                                    service1.setServiceName(service.getServiceName());
                                                    line = reader.readLine();
                                                    if (line.trim().startsWith("MONTHLY_PRICE ") || line.trim().startsWith("monthly_price ")) {
                                                        service1.setPagio(Integer.parseInt(line.substring(14).trim()));
                                                        counter = counter + 1;
                                                        line = reader.readLine();
                                                        if (line.trim().startsWith("FREE_MINUTES ") || line.trim().startsWith("free_minutes "))
                                                            service1.setMinutes(Integer.parseInt(line.substring(13).trim()));
                                                        line = reader.readLine();
                                                        if (line.trim().startsWith("FREE_SMS ") || line.trim().startsWith("free_sms "))
                                                            service1.setSMS(Integer.parseInt(line.substring(9).trim()));
                                                        line = reader.readLine();
                                                        if (line.trim().startsWith("XREWSH_MINUTES ") || line.trim().startsWith("xrewsh_minutes "))
                                                            service1.setXrewsiMinutes(
                                                                    Double.parseDouble(line.substring(15).trim()));
                                                        line = reader.readLine();
                                                        if (line.trim().startsWith("XREWSH_SMS ")||line.trim().startsWith("xrewsh_sms "))
                                                            service1.setXrewsiSMS(
                                                                    Double.parseDouble(line.substring(11).trim()));
                                                        if (line.trim().startsWith("MONTHLY_BALANCE ")||line.trim().startsWith("monthly_balance "))
                                                            service1.setYpoloipo(Double.parseDouble(line.substring(15).trim()));
                                                        line = reader.readLine();
                                                        if (line.trim().equals("}"))
                                                            ProviderServices.add(service1);
                                                    } else {
                                                        System.out.println("ERROR! MONTHLY_PRICE NOT FOUND");
                                                        while (true) {
                                                            line = reader.readLine();
                                                            if (line.trim().equals("}")) {
                                                                break;
                                                            }
                                                        }
                                                        
                                                    }
                                                } else if (line.trim().substring(13).trim().equals("Internet")) {
                                                    Internet service1 = new Internet();
                                                    service1.setServiceName(service.getServiceName());
                                                    line = reader.readLine();
                                                    if (line.trim().startsWith("MONTHLY_PRICE ") || line.trim().startsWith("monthly_price ")) {
                                                        counter = counter + 1;
                                                        service1.setPagio(Integer.parseInt(line.substring(14).trim()));
                                                        line = reader.readLine();
                                                        if (line.trim().startsWith("FREE_USAGE ") || line.trim().startsWith("free_usage "))
                                                            service1.setOgkos(Integer.parseInt(line.substring(11).trim()));
                                                        line = reader.readLine();
                                                        if (line.trim().startsWith("XREWSH_DATA ") || line.trim().startsWith("xrewsh_data "))
                                                            service1.setXrewsiInt(
                                                                    Double.parseDouble(line.substring(12).trim()));
                                                        line = reader.readLine();
                                                        if (line.trim().equals("}"))
                                                            ProviderServices.add(service1);
                                                            
                                                    } else {
                                                        System.out.println("ERROR! MONTHLY_PRICE NOT FOUND");
                                                        while (true) {
                                                            line = reader.readLine();
                                                            if (line.trim().equals("}")) {
                                                                break;
                                                            }
                                                        }
                                                        
                                                    }
                                                }
                                            }  
                                        }else{
                                            System.out.println("ERROR! INVALID SERVICE INFO");
                                            while (true) {
                                                line = reader.readLine();
                                                if (line.trim().equals("}")) 
                                                    break;
                                            }        

                                        }
                                        i=i+1;
                                    }
                             
                                }   
                            }
                            line = reader.readLine();
                        }         
                    }
                }
            }
        }catch (IOException e) {
            System.out.println("Error reading line ...");
        }
        try {
            reader.close();
        } catch (IOException e) {
            System.err.println("Error closing file.");
        }
    }                 

}*/
