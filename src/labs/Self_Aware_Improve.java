package labs;

public class Self_Aware_Improve {
	 
	 public boolean Self_Aware(int arr[])
	    {
	       if(arr==null||arr.length==0)
	    	  return true;
	       int length=arr.length;
	       for(int i=0;i<length;i++)
	       {
	    	   int number=i;
	    	   int count=0;
	    	   for(int j=0;j<length;j++)
	    	   {
	    		   if(arr[j]==number)
	    		   {
	    			   count++;
	    			   int tmp=arr[j];
	    			   arr[j]=arr[arr.length-1];
	    			   arr[arr.length-1]=tmp;
	    			   length--;
	    		   }
	    	   }
	    	   if(count!=arr[i])
	    		   return false;
	    	   else 
	    		   continue;
	    	   
	       }
	       return true;
	    }
	    public static void main(String[] args)
	    {
	    	Self_Aware sa=new Self_Aware();
	    	int[] arr={2,0,2,0};
	    	System.out.println(sa.Self_Aware(arr));
	    }
}
