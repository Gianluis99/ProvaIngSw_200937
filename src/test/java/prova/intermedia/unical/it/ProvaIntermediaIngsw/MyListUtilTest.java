package prova.intermedia.unical.it.ProvaIntermediaIngsw;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;


public class MyListUtilTest 
{
  
	private static MyListUtil my;
	
	@BeforeClass
	public static void init() {
		my=new MyListUtil();
	}
	
    @Test
    public void firstTest()
    {
    	List<Integer> listA=my.sort(Arrays.asList(4,2,3,1), true);
    	List<Integer> listE=Arrays.asList(1,2,3,4);
    	
    	assertEquals(listE, listA);
    	assertEquals(listA.size(), listA.size());
       
    }
    
    @Test
    public void secondTest()
    {
    	List<Integer> listA=my.sort(Arrays.asList(1,2,3,4), false);
    	List<Integer> listE=Arrays.asList(4,3,2,1);
    	
    	assertEquals(listE, listA);
    	assertEquals(listA.size(), listA.size());
       
    }
    
    @Test
    public void thirdTest()
    {
    	List<Integer> listA=my.sort(new ArrayList<Integer>() ,false);
    	List<Integer> listE= new ArrayList<Integer>();
    	
    	assertEquals(listE, listA);
    	assertEquals(listA.size(), listA.size());
    	
    	List<Integer> listA2=my.sort(new ArrayList<Integer>() ,true);
    	List<Integer> listE2= new ArrayList<Integer>();
    	
    	assertEquals(listE2, listA2);
    	assertEquals(listA2.size(), listA2.size());
    }
    
    
}
