package Hashing;
import java.util.*;
public class max_len_equal_No_Of_Zeros_And_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,1,0,0,1,0,0,1};
		System.out.println(maxlenequalNoOfZerosAndOne(a));
	}
	public static int maxlenequalNoOfZerosAndOne(int[] a){
	    for(int i=0;i<a.length;i++){
	        if(a[i]==0)
	        a[i]=-1;
	    }
	    HashMap<Integer, Integer> freq=new HashMap<Integer, Integer>();
	    int sum=0, maxlen=0;
	    freq.put(sum,-1);
	    for(int i=0;i<a.length;i++){
	        sum+=a[i];
	        if(!(freq.containsKey(sum))){
	            freq.put(sum,i);
	        }
	        else{
	            int len=i-freq.get(sum);
	            if(len>maxlen){
	                maxlen=len;
	            }
	        }
	    }
	    return maxlen;
	}
}
