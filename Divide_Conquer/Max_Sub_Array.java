import java.util.*;

class Max_Array implements Comparable<Max_Array>{
    int headi;
    int headj;
    int sum;
    
    public Max_Array(int i,int j,int s)
    {headi=i;headj=j;sum=s;}
    
    public Max_Array()
    {
	headi=0;headj=0;sum=0;
    }
    
    public int compareTo(Max_Array M){
	if(this.sum > M.sum) {return 1;}
	else if(this.sum < M.sum ){return -1;}
	else{return 0;}
   }
}

class solution{
    
    public static int randomInt(int min,int max)
    {
	Random R = new Random();
	return R.nextInt((max-min)+1)+min;
    }
    public static void main(String Args[])
    {
	
	/*int n = Integer.parseInt(Args[0]);
	  Random R = new Random();*/
	int n=0;
	int[] A,B;
	long ST,ET;
	for(n=1;n<50;n++){
	    System.out.printf("for N=%d time Are Following\n",n);
	    A = new int[n];
	
	    for(int i=0;i<n;i++){A[i]=randomInt(-n,n);}
	    
	    
	    ST = System.nanoTime();
	    Max_Array M = Max_Array_R(A);
	    ET=System.nanoTime();
	    System.out.println("Recrussion took"+(ET-ST)/1000);
	
	    ST = System.nanoTime();
	    M = Max_Array_BF(A);
	    ET=System.nanoTime();
	    System.out.println("Burth Force took"+(ET-ST)/1000);
	    System.out.println();
	    System.out.println();
	}
	/*System.out.println(Arrays.toString(A));
	  System.out.println("headi:"+M.headi+"     headj"+M.headj+"        Actual_sum:"+M.sum);*/
    }
    
    public static Max_Array Max_Array_R(int[] A)
    {
	return Divide_Max_Array(A,1,A.length);
     }

    //Divide
    public static Max_Array Divide_Max_Array(int[] A,int p,int q)
    {
	Max_Array L,M,R;

	if(p==q){ return new Max_Array(p,q,A[p-1]);}
	
	int mid = (p+q)/2;
	
	L=Divide_Max_Array(A,p,mid);
	R=Divide_Max_Array(A,mid+1,q);
	M=Mid_Max_Array(A,p,q);
	if(L.compareTo(M)==1 && L.compareTo(R)==1)
	    return L;
	else if(M.compareTo(L)==1 && M.compareTo(R)==1){return M;}
	else if(R.compareTo(L)==1 && R.compareTo(M)==1){return L;}
	else{return new Max_Array(0,0,0);}
    }

    //
    public static Max_Array Mid_Max_Array(int[] A,int p,int q)
    {
	int mid = (p+q)/2;
	int left_sum=0,right_sum=0,sum=0;
	int lefti=0,righti=0;
	for(int i = mid-1;i > p;i--){sum+=A[i];if(sum > left_sum){lefti=i;left_sum=sum;}}
	sum=0;
	for(int i = mid;i  < q;i++){sum+=A[i];if(sum > right_sum){righti=i;right_sum=sum;}}
	
	return new Max_Array(lefti,righti,left_sum+right_sum);
    }
    
    public static Max_Array Max_Array_BF(int A[]){
	int n=A.length;
	int current_sum=0,actual_sum=0;
	Max_Array M = new Max_Array();
	for(int i=0;i<n;i++)
	    {
		current_sum = 0;
		for(int j=i;j<n;j++)
		    {
			current_sum+=A[j];
			if(current_sum > actual_sum)
			    {M.headi=i;M.headj=j;actual_sum=current_sum;}
		    }
	    }
	M.sum=actual_sum;
	return M;
    }
}
