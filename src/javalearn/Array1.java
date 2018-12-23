package javalearn;

public class Array1
{
	public static void main(String[] args)
	{
	    int numArray[];
	    numArray =new int[5];
	    numArray[0]=10;
	    numArray[1]=20;
	    numArray[2]=30;
	    numArray[3]=40;
	    numArray[4]=50;
 
	    for (int i : numArray)
	    {
	    	i=numArray[0];
	    	
	    	for (int j : numArray)
	    	{
	    		System.out.println(i+j);
			}
		}
	    
	    System.out.println("=============================");
	    for (int i = 1; i < numArray.length; i++)
	    {
	    	i=numArray[0];
	    	System.out.println(i);
	    	
	    	for (int j : numArray)
	    	{
			   System.out.println(i*j);	
			}
	    	
		}
	    
	    
	}

}
