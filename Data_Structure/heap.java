import java.util.*;
import java.io.*;

class Heap{
    
    int parent(int i){return i/2;}
    int right(int i){return 2*i+2;}
    int left(int i){return 2*i+1;}
    void swap(int a,int b){}
    void max_heapify(int[] A,int i,int n)
    {
	int largest=i,l=left(i),r=right(i);
	
	if( l < n && A[l] > A[i]){largest=l;}
	if( r < n && A[r] > A[largest]){largest=r;}
	if(largest!=i){
	    A[i]=A[largest]^A[i];
	    A[largest]=A[i]^A[largest];
	    A[i]=A[i]^A[largest];
	    max_heapify(A,largest,n);
	}
    }
    
    void Build_Max_Heap(int[] A){
	for(int i = (A.length)/2-1; i >= 0 ; i--)
	    {max_heapify(A,i,A.length);}
    }

    void HeapSort(int[] A)
    {
	int n = A.length;
	Build_Max_Heap(A);
	for(int i = A.length-1 ; i >=1 ; i--)
	    {
		A[0] =  A[0] ^ A[i];
		A[i] =  A[0] ^ A[i];
		A[0] =  A[0] ^ A[i];
		n = n - 1 ;
		max_heapify(A,0,n);
	    }
    }
}

class Priority_Queue{
    


}

class solution{

    public static void main(String Args[]){
	
	int[] A={4,1,3,2,16,9,10,14,8,7};
	Heap H =  new Heap();
	H.HeapSort(A);
	System.out.println(Arrays.toString(A));
    }

}
