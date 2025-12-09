import java.util.*;
import java.text.*;
public class mainApp {
//Omada 67
//Gewrgios Vlasshs:3200020, Thomas Vasilas:3200012, Iwanna Zaxarakh:3200051

    public static void main( String args[]){
        Scanner input = new Scanner(System.in);
        
        ServicesFile Services = new ServicesFile();
		Services.loadFile("service_list.txt");
		ContractFiles Contracts = new ContractFiles();
		Contracts.loadFile("contracts_list.txt");
        Service ser1 = Services.getIndex(0);
		Service ser2 = Services.getIndex(1);
		Service ser3 = Services.getIndex(2);
		Service ser4 = Services.getIndex(3);
		Service ser5 = Services.getIndex(4);
		Service ser6 = Services.getIndex(5);

        symvolaio_kin s1 =(symvolaio_kin) ser1;
        symvolaio_kin s2 =(symvolaio_kin) ser2;
        Kartosymvolaio k1 =(Kartosymvolaio) ser3;
        Kartosymvolaio k2 =(Kartosymvolaio) ser4;
        Internet i1 = (Internet)ser5;
        Internet i2 = (Internet)ser6;

        Symvolaia sym1 = Contracts.getIndex(0);
        Symvolaia sym2 = Contracts.getIndex(1);
        Symvolaia sym3 = Contracts.getIndex(2);
        Symvolaia sym4 = Contracts.getIndex(3);
        Symvolaia sym5 = Contracts.getIndex(4);
        Symvolaia sym6 = Contracts.getIndex(5);
        Symvolaia sym7 = Contracts.getIndex(6);
        Symvolaia sym8 = Contracts.getIndex(7);
        Symvolaia sym9 = Contracts.getIndex(8);
        Symvolaia sym10 = Contracts.getIndex(9);
        Symvolaia sym11 = Contracts.getIndex(10);
        Symvolaia sym12 = Contracts.getIndex(11);
        
        
        
        int answerNum;
        boolean flag=false;
        int ID=12;
        String answer,name,S_name,number,payment,date;
        while (!flag){
            System.out.println("1. See Services");
            System.out.println("2. Create a new contract");
            System.out.println("3. View active contracts of a specific service");
            System.out.println("4. Update statistics of an active contract");
            System.out.println("5. Calculation of the total monthly cost");
            System.out.println("6. Current client stats");
            System.out.println("0. Exit");
            System.out.println("(9.BACK TO MENU)");
            System.out.print("> ");
            answer=input.nextLine();
            while(!(answer.equals("1") || answer.equals("2") || answer.equals("3") || answer.equals("4") || answer.equals("5") || answer.equals("6") || answer.equals("0") || answer.equals("9"))) {
				System.out.println("Enter 1, 2, 3, 4, 5, 6, 0 or 9. Please try again.");
				System.out.print("> ");
				answer = input.nextLine();
			}
            if (answer.equals("1")){
                System.out.println("1. Contract");
                System.out.println("2. Card-contract");
                System.out.println("3. Internet contract");
                System.out.println("(9. BACK TO MENU)");
                System.out.print("> ");
                answer=input.nextLine();
                while(!(answer.equals("1") || answer.equals("2") || answer.equals("3") || answer.equals("9"))) {
                    System.out.println("Enter 1, 2, 3 or 9. Please try again.");
                    System.out.print("> ");
                    answer = input.nextLine();
			    }
                if(answer.equals("1")){
                    //emfanisi simvolaiwn
                    System.out.println(s1);
                    System.out.println(s2);
                }else if(answer.equals("2")){
                    //emfanisi kartosymvolaiwn
                    System.out.println(k1);
                    System.out.println(k2);
                }else if(answer.equals("3"))  {
                    //emfanisi internet
                    System.out.println(i1);
                    System.out.println(i2);
                }else{
                    continue;
                }
                System.out.println("(9. BACK TO MENU)");
                System.out.print("> ");
                answer=input.nextLine();
                if (answer.equals("9")){
                    continue;
                }
            }else if(answer.equals("2")){
                System.out.println("Which contract do you want?");
                System.out.println("1. Contract");
                System.out.println("2. Card Contract");
                System.out.println("3. Internet contract");
                System.out.println("(9. BACK TO MENU)");
                System.out.print("> ");
                answer=input.nextLine();
                while(!(answer.equals("1") || answer.equals("2") || answer.equals("3") || answer.equals("9"))) {
                    System.out.println("Enter 1, 2, 3 or 9. Please try again.");
                    System.out.print("> ");
                    answer = input.nextLine();
			    }
                if (answer.equals("1")){
                    //emfanisi contracts with numbers
                    System.out.println("Choose Mobile Contract:");
                    System.out.println("1."+s1);
                    System.out.println("2."+s2);
                    System.out.println("(9. BACK TO MENU)");
                    System.out.print("> ");
                    answer=input.nextLine();
                    while(!(answer.equals("1") || answer.equals("2") || answer.equals("9"))) {
                        System.out.println("Enter 1, 2 or 9. Please try again.");
                        System.out.print("> ");
                        answer = input.nextLine();
                    }
                    if (answer.equals("1")){
                        S_name=s1.getServiceName();
                    }else if (answer.equals("2")) {
                        S_name=s2.getServiceName();
                    }else{
                        continue;
                    }
                }else if(answer.equals("2")){
                    System.out.println("Choose Mobile Card-Contract:");
                    System.out.println("1."+k1);
                    System.out.println("2."+k2);
                    System.out.println("(9. BACK TO MENU)");
                    System.out.print("> ");
                    answer=input.nextLine();
                    while(!(answer.equals("1") || answer.equals("2") || answer.equals("9"))) {
                        System.out.println("Enter 1, 2 or 9. Please try again.");
                        System.out.print("> ");
                        answer = input.nextLine();
                    }
                    if (answer.equals("1")){
                        S_name=k1.getServiceName();
                    }else if (answer.equals("2")) {
                        S_name=k2.getServiceName();
                    }else{
                        continue;
                    }
                    
                }else if(answer.equals("3")) {
                    System.out.println("Choose Mobile Internet Contract:");
                    System.out.println("1."+i1);
                    System.out.println("2."+i2);
                    System.out.println("(9. BACK TO MENU)");
                    System.out.print("> ");
                    answer=input.nextLine();
                    while(!(answer.equals("1") || answer.equals("2") || answer.equals("9"))) {
                        System.out.println("Enter 1, 2 or 9. Please try again.");
                        System.out.print("> ");
                        answer = input.nextLine();
                    }
                    if (answer.equals("1")){
                        S_name=i1.getServiceName();
                    }else if (answer.equals("2")){
                        S_name=i2.getServiceName();
                    }else{
                        continue;
                    }
                }else{
                    continue;
                }
                System.out.println("Enter Name: ");
                System.out.print("> ");
                name=input.nextLine();
                System.out.println("Enter Tel_number: ");
                System.out.print("> ");
                number=input.nextLine();
                System.out.println("Enter Payment_Method : ");
                System.out.print("> ");
                payment=input.nextLine();
                Date Date = Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
                date = dateFormat.format(Date);  
                ID+=1; 
                Symvolaia new_sym = new Symvolaia(ID,S_name,name,number,date,payment);
                Contracts.addSymvolaia(new_sym);
                System.out.println("(9. BACK TO MENU)");
                System.out.print("> ");
                answer=input.nextLine();
                if (answer.equals("9")){
                    continue;
                }
            }else if (answer.equals("3")){
                System.out.println("Which contract do you want?");
                System.out.println("1. Contract");
                System.out.println("2. Card Contract");
                System.out.println("3. Internet contract");
                System.out.println("(9. BACK TO MENU)");
                System.out.print("> ");
                answer=input.nextLine();
                while(!(answer.equals("1") || answer.equals("2") || answer.equals("3") || answer.equals("9"))) {
                    System.out.println("Enter 1, 2, 3 or 9. Please try again.");
                    System.out.print("> ");
                    answer = input.nextLine();
			    }
                if (answer.equals("1")){
                    //emfanisi contracts with numbers
                    System.out.println("Choose Mobile Contract:");
                    System.out.println("1."+s1);
                    System.out.println("2."+s2);
                    System.out.println("(9. BACK TO MENU)");
                    System.out.print("> ");
                    answer=input.nextLine();
                    while(!(answer.equals("1") || answer.equals("2") || answer.equals("9"))) {
                        System.out.println("Enter 1, 2 or 9. Please try again.");
                        System.out.print("> ");
                        answer = input.nextLine();
                    }
                    if (answer.equals("1")){
                        S_name=s1.getServiceName();
                    }else if (answer.equals("2")) {
                        S_name=s2.getServiceName();
                    }else{
                        continue;
                    }
                }else if(answer.equals("2")){
                    System.out.println("Choose Mobile Card-Contract:");
                    System.out.println("1."+k1);
                    System.out.println("2."+k2);
                    System.out.println("(9. BACK TO MENU)");
                    System.out.print("> ");
                    answer=input.nextLine();
                    while(!(answer.equals("1") || answer.equals("2") || answer.equals("9"))) {
                        System.out.println("Enter 1, 2 or 9. Please try again.");
                        System.out.print("> ");
                        answer = input.nextLine();
                    }
                    if (answer.equals("1")){
                        S_name=k1.getServiceName();
                    }else if (answer.equals("2")) {
                        S_name=k2.getServiceName();
                    }else{
                        continue;
                    }
                    
                }else if(answer.equals("3")) {
                    System.out.println("Choose Mobile Internet Contract:");
                    System.out.println("1."+i1);
                    System.out.println("2."+i2);
                    System.out.println("(9. BACK TO MENU)");
                    System.out.print("> ");
                    answer=input.nextLine();
                    while(!(answer.equals("1") || answer.equals("2") || answer.equals("9"))) {
                        System.out.println("Enter 1, 2 or 9. Please try again.");
                        System.out.print("> ");
                        answer = input.nextLine();
                    }
                    if (answer.equals("1")){
                        S_name=i1.getServiceName();
                    }else if (answer.equals("2")) {
                        S_name=i2.getServiceName();
                    }else{
                        continue;
                    }

                }else{
                    continue;
                }
                Contracts.certainSymvolaia(S_name);
                System.out.println("(9. BACK TO MENU)");
                System.out.print("> ");
                answer=input.nextLine();
                if (answer.equals("9")){
                    continue;
                }
                
            }else if (answer.equals("4")){
                
                System.out.println("Choose a contract by the ID number: ");
                Contracts.listSymvolaia();
                System.out.print("> ");
                answer=input.nextLine();
                int index=(Integer.valueOf(answer)-1);
                Symvolaia k=Contracts.getSymvolaia(index);
                if ((k.get_yphresia()=="GIGA WEEK") || (k.get_yphresia()=="GIGA MONTH") ){
                    System.out.println("Set data: ");
                    System.out.print("> ");
                    answerNum=input.nextInt(); 
                    k.setData(answerNum);
                }else{
                    System.out.println("Set lepta omilias: ");
                    System.out.print("> ");
                    answerNum=input.nextInt(); 
                    k.setXronosOmilias(answerNum);
                    System.out.println("Set SMS: ");
                    System.out.print("> ");
                    answerNum=input.nextInt(); 
                    k.setSMS(answerNum);
                }
                
                
            }else if(answer.equals("5")){
                for (int counter = 0; counter < Contracts.sizeSymvolaia(); counter++){
                    double cost=10;
                    Symvolaia k=Contracts.getSymvolaia(counter);
                    if (k.get_yphresia()=="GIGA WEEK"){
                        if (k.getOgkosData()>6000){
                            cost+=(k.getOgkosData()-6000)*0.1;
                        }
        
                    }else if(k.get_yphresia()=="GIGA MONTH"){
                        if (k.getOgkosData()>10000){
                            cost+=(k.getOgkosData()-10000)*0.2;}
                    }else if(k.get_yphresia()=="MONTH FAVORITE 1"){
                        if (k.getXronosOmilias()>1000){
                            cost+=(k.getXronosOmilias()-1000)*0.12;

                        }
                        if (k.getSms()>800){
                            cost+=(k.getSms()-800)*0.1;
                        }
                        cost=k1.getYpoloipo()-cost;
                    }else if(k.get_yphresia()=="MONTH FAVORITE 2"){
                        if (k.getXronosOmilias()>1500){
                            cost+=(k.getXronosOmilias()-1500)*0.15;
                        }
                        if (k.getSms()>1000){
                            cost+=(k.getSms()-1000)*0.12;
                        }
                        cost=k2.getYpoloipo()-cost;
                    }else if(k.get_yphresia()=="UNLIMITED 850"){
                        if (k.getXronosOmilias()>850){
                            cost+=(k.getXronosOmilias()-850)*0.1;
                        }
                        if (k.getSms()>200){
                            cost+=(k.getSms()-200)*0.2;
                        }
                    }else if(k.get_yphresia()=="UNLIMITED 1500"){
                        if (k.getXronosOmilias()>1500){
                            cost+=(k.getXronosOmilias()-1500)*0.2;
                        }
                        if (k.getSms()>500){
                            cost+=(k.getSms()-500)*0.4;
                        }
                    }
                    
                    System.out.println(k.toString2()+cost);
                    

                }
                System.out.println("(9. BACK TO MENU)");
                System.out.print("> ");
                answer=input.nextLine();
                if (answer.equals("9")){
                    continue;
                }


            }else if(answer.equals("6")){
                for (int counter = 0; counter < Contracts.sizeSymvolaia(); counter++){
                    int fData=0,fSMS=0,fLepta=0;
                    double fYpoloipo=0;
                    Symvolaia k=Contracts.getSymvolaia(counter);
                    if (k.get_yphresia()=="GIGA WEEK"){
                        fData=6000-k.getOgkosData();
                    }else if(k.get_yphresia()=="GIGA MONTH"){
                        fData=10000-k.getOgkosData();
                    }else if(k.get_yphresia()=="MONTH FAVORITE 1"){
                        if (k.getXronosOmilias()>1000){
                            fYpoloipo+=(k.getXronosOmilias()-1000)*0.12;

                        }
                        if (k.getSms()>800){
                            fYpoloipo+=(k.getSms()-800)*0.1;
                        }
                        fYpoloipo=k1.getYpoloipo()-fYpoloipo-k1.getPagio();
                        fLepta=1000-k.getXronosOmilias();
                        fSMS=800-k.getSms();

                    }else if(k.get_yphresia()=="MONTH FAVORITE 2"){
                        if (k.getXronosOmilias()>1500){
                            fYpoloipo+=(k.getXronosOmilias()-1500)*0.15;
                        }
                        if (k.getSms()>1000){
                            fYpoloipo+=(k.getSms()-1000)*0.12;
                        }
                        fYpoloipo=k2.getYpoloipo()-fYpoloipo-k2.getPagio();
                        fLepta=1500-k.getXronosOmilias();
                        fSMS=1000-k.getSms();
                    
                    }else if(k.get_yphresia()=="UNLIMITED 850 "){
                        fLepta=850-k.getXronosOmilias();
                        fSMS=200-k.getSms();
                    }else if(k.get_yphresia()=="UNLIMITED 1500"){
                        fLepta=1500-k.getXronosOmilias();
                        fSMS=500-k.getSms();
                    }
                    if (fLepta<0){
                        fLepta=0;
                    }
                    if (fSMS<0){
                        fSMS=0;
                    }
                    if(fData<0){
                        fData=0;

                    }
                    System.out.println(k.toString3(fLepta, fSMS, fData, fYpoloipo));
                } 
                System.out.println("(9. BACK TO MENU)");
                System.out.print("> ");
                answer=input.nextLine();
                if (answer.equals("9")){
                    continue;
                }
            }else if(answer.equals("0")){
                System.out.println("Eksodos programmatos");
                Contracts.WriteFile("contracts_list.txt");
                break;
            }else{
                continue;
            }    
        }       
        
    }


        

        


        
    
}    

