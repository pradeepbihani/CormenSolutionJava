import java.util.*;
import java.io.*;
import java.util.Arrays;


class run{
    
    public static HashMap<Integer,Integer>  hm = new HashMap<Integer,Integer>(); 
    
    public static void main(String Args[])throws Exception
	{
	    Scanner in=new Scanner(new File("tmp.data"));
	    String s;
	    String[] ary;
	    int n;
	    n=Integer.parseInt(in.nextLine());
	    int price[]=new int[n];
	    int length[] = new int[n];
	    
	    //input
	    for(int i=0;in.hasNext();i++)
		{
		    s=in.nextLine();
		    ary=s.split(" ");
		    length[i]=Integer.parseInt(ary[0]);
		    price[i]=Integer.parseInt(ary[1]);
		}
	    
	    //	    System.out.println(Arrays.toString(length));
	    	    System.out.println(Arrays.toString(price));
	    
	    System.out.println(value(7,price));
	    System.out.println(hm);
	}
    
    public static int max(int a,int b)
    {
	if(a>b)
	    {return a;}
	else {return b;}
    }
    
    public static int value(int n,int[] price)
    {
	int m=price[n-1];	
	if(hm.containsKey(n))
	    {return hm.get(n); }
	else
	    {
		if(n==1)
		    {
			hm.put(1,price[0]);
			return price[0];
		    }
		else
		    {
		for(int i=1;i<n;i++){m=max(m,value(i,price)+value(n-i,price)); }			
			hm.put(n,m);
			return m;
		    }
	    }	
    }
}
