import java.util.*;

public class SymvolaiaCollection extends Symvolaia{
    private ArrayList<Symvolaia> symvolaia=new ArrayList<Symvolaia>();


    public void addSymvolaia(Symvolaia s){
        symvolaia.add(s);
    }

    public Symvolaia getSymvolaia(int index){
        return symvolaia.get(index);
    }

   public int sizeSymvolaia(){
       return symvolaia.size();
   }
   

    public void listSymvolaia() {                        
		for(Symvolaia ob : symvolaia) {
			System.out.println(ob.toString());
		}
	}

    public void certainSymvolaia(String s_name){
        for(Symvolaia ob : symvolaia) {
			if (s_name==ob.get_yphresia()){
                System.out.println(ob.toString());
            }
		}
    }

    
    
    
      
    
        
    
}   


