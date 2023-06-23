
package Hashing;
import java.util.*;
public class Max_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {1,2,2,2,4,4,2};
        System.out.print(maxDist(a));
	}
	public static int maxDist(int arr[]){
	    int n = arr.length;
	    int maxcount =0;
	    int count =0;
	    HashMap<Integer , Integer> map = new HashMap<>();
	    for(int i=0;i<n;i++){
	        if(map.containsKey(arr[i])==false){
	            map.put(arr[i],i);
	        }
	        else{
	            count = i-map.get(arr[i]);
	            maxcount = (count > maxcount)?count:maxcount;
	        }
	    }
	    return maxcount;
	}
}
