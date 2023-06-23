package Hashing;
import java.util.*;
public class MaxFreq_MaxLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={9,8,9,1,1,2,3,9,1};
		System.out.println(MaxFreq(a));
	}
	public static int MaxFreq(int[] a){
	    HashMap<Integer, Integer> len=new HashMap<>();
	    HashMap<Integer, Integer> count=new HashMap<>();
	    int maxFreq=0, maxLen=0;
	    int max=0;
	    for(int i=0;i<a.length;i++){
	        int x=a[i];
	        if(count.containsKey(x)==false){
	            len.put(x,i);
	            count.put(x,1);
	        }
	        else{
	            count.put(x,(count.get(x)+1));
	            if(maxFreq<count.get(x)){
	                maxFreq=count.get(x);
	                maxLen=i-len.get(x)+1;
	                max=x;
	            }
	            else if(count.get(x)==maxFreq && (i-len.get(x)+1)>maxLen){
	                maxLen=i-len.get(x)+1;
	                max=x;
	            }
	        }
	    }
	    return max;
	}
}
