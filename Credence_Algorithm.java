package Hashing;
import java.util.*;
public class Credence_Algorithm {
	public static void main(String[] args) {
	    int[] a={-5,4,6,-3,4,-1};
	  //  int[] a={-5,-4,-6,-3,-4,-1};
		System.out.println(maximumSum(a));
	}
	public static ArrayList<Integer> maximumSum(int[] a){
	    int maxSum=Integer.MIN_VALUE;
	    int sum=-1, start=0, end=0;
	    for(int i=0;i<a.length;i++){
	        if(a[i]<0){
	            if(a[i]>maxSum){
	               maxSum=a[i];
	               start=end=i;        
	            }
	        }
	        else{
	            sum=0;
	            break;
	        }
	    }
	    if(sum==0){
	    for(int i=0;i<a.length;i++){
	        sum+=a[i];
	        if(sum>maxSum){
	            maxSum=sum;
	            end=i;
	        }
	        if(sum<0){
	            sum=0;
	            start=i+1;
	        }
	    }
	    }
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    for(int i=start;i<=end;i++){
	        list.add(a[i]);
	    }
	    return list;
	}
}
