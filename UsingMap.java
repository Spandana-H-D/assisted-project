
	import java.util.*;
public class UsingMap {
	public static void main(String[] args) {
			
					//Hashmap
					HashMap<Integer,String> hm=new HashMap<Integer,String>();      
				      hm.put(1,"yenu");    
				      hm.put(2,"bubu");    
				      hm.put(3,"hunu");   
				       
				      System.out.println("\nThe elements of Hashmap are ");  
				      for(Map.Entry m:hm.entrySet()){    
				       System.out.println(m.getKey()+" "+m.getValue());    
				      }
				      
				     //HashTable
				       
				      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
				      
				      ht.put(4,"seenu");  
				      ht.put(5,"tanu");  
				      ht.put(6,"manu");  
				      ht.put(7,"banu");  

				      System.out.println("\nThe elements of HashTable are ");  
				      for(Map.Entry n:ht.entrySet()){    
				       System.out.println(n.getKey()+" "+n.getValue());    
				      }
				      
				      
				      //TreeMap
				      
				      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
				      map.put(8,"rama");    
				      map.put(9,"seeta");    
				      map.put(10,"ravana");       
				      
				      System.out.println("\nThe elements of TreeMap are ");  
				      for(Map.Entry l:map.entrySet()){    
				       System.out.println(l.getKey()+" "+l.getValue());    
				      }    
				      
				   }  
}

	


