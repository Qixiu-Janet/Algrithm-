package labs;

public class Self_Aware {
    public boolean Self_Aware(int arr[])
    {
      if(arr==null||arr.length==0)
    	  return true;
       for(int i=0;i<arr.length;i++)
       {
    	   int number=i;
    	   int count=0;
    	   for(int j=0;j<arr.length;j++)
    	   {
    		   if(arr[j]==number)
    		   {
    			   count++;  
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
