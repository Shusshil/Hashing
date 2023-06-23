package Hashing;
import java.util.*;
public class smallest_SubArray_MaxFreq {
	public static void main(String[] args) {
			int[] a={4,1,1,2,2,1,3,3};
			System.out.println(SmallestSubArrayMaxFreq(a));
		}
		public static ArrayList<Integer> SmallestSubArrayMaxFreq(int[] a){
		    HashMap<Integer, Integer> len=new HashMap<>();
		    HashMap<Integer, Integer> count=new HashMap<>();
		    int maxFreq=0, minLen=0;
		    int start=0;
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
		                minLen=i-len.get(x)+1;
		                start=len.get(x);
		            }
		            else if(count.get(x)==maxFreq && (i-len.get(x)+1)<minLen){
		                minLen=i-len.get(x)+1;
		                start=len.get(x);
		            }
		        }
		    }
		    int end=start+minLen-1;
		    ArrayList<Integer> list=new ArrayList<Integer>();
		    for(int i=start;i<=end;i++){
		        list.add(a[i]);
		    }
		    return list;
		}
}
