package Hashing;
import java.util.*;
public class SubArrays_equal_No_Of_Zeros_And_One {
	public static void main(String[] args) {
	    int[] a={1,1,0,0,1,0,0,1,1,1};
		System.out.println(equalNoOfZerosAndOne(a));
	}
	public static int equalNoOfZerosAndOne(int[] a){
	    for(int i=0;i<a.length;i++){
	        if(a[i]==0)
	        a[i]=-1;
	    }
	    HashMap<Integer, Integer> freq=new HashMap<Integer, Integer>();
	    int sum=0,count=0;
	    freq.put(sum,1);
	    for(int i=0;i<a.length;i++){
	        int x=a[i];
	        sum+=x;
	        if(freq.containsKey(sum)){
	            count+=freq.get(sum);
	            freq.put(sum,freq.get(sum)+1);
	        }
	        else{
	            freq.put(sum,1);
	        }
	    }
	    return count;
	}
}
