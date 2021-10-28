package prova.intermedia.unical.it.ProvaIntermediaIngsw;

import java.util.Comparator;
import java.util.List;

public class MyListUtil 
{
      public List<Integer> sort(List<Integer> list, final boolean value){
		
    	  list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
			
				if(value)
					return o1-o2;
				else
					return o2-o1;
			}
		
    	  
    	  });
    	  
    	  return list;
    	  
      }
     
      
}
