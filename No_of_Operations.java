package Hashing;
import java.util.*;
public class No_of_Operations {
	public static void main(String[] args) {
	    int[] a={2,2,2,3,3,4,2};
		System.out.println(noOfOperation(a));
	}
	public static int noOfOperation(int[] a){
	    HashMap<Integer, Integer> map=new HashMap<>();
	    for(int i=0;i<a.length;i++){
	        if(map.containsKey(a[i])==false)
	        map.put(a[i],1);
	        else
	        map.put(a[i],(map.get(a[i])+1));
	    }
	    int sum=0, max=0;
	    for(Map.Entry<Integer, Integer> e : map.entrySet()){
	        sum+=e.getValue();
	        if(max<e.getValue()){
	            max=e.getValue();
	        }
	    }
	    return sum-max;
	}
}
