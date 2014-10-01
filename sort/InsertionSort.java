import java.util.*;
import java.io.*;

class solution{
    public static void main(String Args[])
    {
	int A[] = new int[]{5,2,4,3,1,5,3,6,9,7,8,9,7};
	long ST,ET;
	/*ST = System.nanoTime();
	InsertionSort(A,A.length);
	ET = System.nanoTime();
	System.out.println("Insettion sort by REC:"+(ET-ST)/100);
	
	
	A= new int[]{5,2,4,6,1,3,8,6,3,5,1,3,6,9,9,7,4};
	ST = System.nanoTime();
	InsertionSort(A);
	ET = System.nanoTime();*/
	ST = System.nanoTime();
	MergeSort(A);	
	ET = System.nanoTime();
	System.out.println(binarySearch(A,1));
	System.out.println("Insettion sort by COMM:"+(ET-ST)/100);
	System.out.println("Final String"+Arrays.toString(A));
    }
    
    public static void InsertionSort(int A[])
    {
	int n=A.length;
	int temp,j=0;
	
	for(int i=1;i<n;i++)    
	    {
		temp = A[i];
		j=i-1;
		while( j >= 0 && A[j] < temp)
		    {    A[j+1]=A[j];j--;}
		A[j+1] = temp;
	    
	    }
    }

    public static int InsertionSort(int A[],int N)   // By recursion
    {
	if(N<=1)
	    return 0;
        int j=N-2;
	int temp=A[N-1];
	InsertionSort(A,N-1);
	while( j >= 0 && A[j] < temp)
	    {A[j+1]=A[j];j--;}
	A[j+1] = temp;
	return 1;
    }
	
    public static void SelectionSort(int A[])
    {
	for(int i=A.length-1;i>=0;i--)
	    {
	       
	    }
	
    }

    public static void MergeSort(int[] A)
    {
	Divide_MergeSort(A,1,(A.length+1)/2);
	Divide_MergeSort(A,((A.length+1)/2)+1,A.length);
	Merge_MergeSort(A,1,A.length);
    }
    
    public static int Divide_MergeSort (int[] A,int p,int q)
    {
	if(q<=p){return 0;}
	//	System.out.println(t+"***");
	Divide_MergeSort(A,p,(p+q)/2);
	Divide_MergeSort(A,(p+q)/2+1,q);
	Merge_MergeSort(A,p,q);
	return 1;
    }
    
    
    public static int Merge_MergeSort(int[] A,int p,int q)
    {
	if(q <= p){return 0;}
	int[] a = Arrays.copyOfRange(A,p-1,(p+q)/2);
	int[] b = Arrays.copyOfRange(A,(p+q)/2,q);
	
	int n1=a.length,n2=b.length;
	int K=p-1,i=0,j=0;
	for(K=p-1;K<q;K++)
	    {
		if(i<n1 && j<n2){
		    if(a[i]<=b[j]){A[K]=a[i];i++;}
		    else{A[K]=b[j];j++;}}
		else if(i==n1)
		    {A[K]=b[j];j++;}
		else{A[K]=a[i];i++;}
	    }
	//	System.out.println(Arrays.toString(a)+""+Arrays.toString(b)+""+Arrays.toString(A));
	return 0;
    }
    
    public static void swap(int a,int b)
    {
	int temp;
	temp = a;
	a = b ;
	b = temp;
    }
    
    public static boolean binarySearch(int[] A,int x) 
    {
	int n=(1+A.length)/2-1;
	if(A[n]==x)
	    {return true;}
	else if(x > A[n])
	    {return  Divide(A,A.length/2+1,A.length,x);}
	else
	    {return Divide(A,1,A.length/2,x);}
    }

    public static boolean Divide(int[] A,int p,int q,int x)
    {
	int n=(p+q)/2-1;
	
	if(p>=q){return false;}
       
	if(A[n]==x)
	    {return true;}
	else if(x > A[n])
	    {return  Divide(A,(p+q)/2+1,q,x);}
	else
	    { return Divide(A,p,(p+q)/2,x);}
    }

}
