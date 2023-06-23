package Hashing;
import java.util.*;
public class Unoin_and_Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={6,5,9,3,2,5};
	    int[] a1={1,2,3,4,5};
	    int[] b=intersection(a, a1);
	    int[] c=union(a,a1);
	    print(b);
	    print(c);
	}
	public static void print(int[] a){
	    for(int i=0;i<a.length;i++){
	        System.out.print(a[i]+" ");
	    }
	    System.out.println();
	}
	public static int[] convertToArray(ArrayList<Integer> list){
	    int[] a=new int[list.size()];
	    for(int i=0;i<list.size();i++){
	        a[i]=list.get(i);
	    }
	    return a;
	}
	public static int count(int arr []){
	     HashSet<Integer> set = new HashSet<>();
	       for(int i=0; i<arr.length; i++){
	          set.add(arr[i]);
	        }
	        return set.size();
	    }
	   public static int[] union(int a[], int b[]){
	     HashSet<Integer> s = new HashSet<>();
	        for(int i=0; i<a.length;i++){
	            s.add(a[i]);
	        }
	        for(int i=0; i<b.length; i++){
	            s.add(b[i]);
	        }
	        int arr [] = new int[s.size()];
	            int i=0;
	        Iterator it = s.iterator();
	        while(it.hasNext()){
	          arr[i++] = (int)it.next();
	        }
	        return arr;
	    }
	    public static int[] intersection(int a[], int b[]){
	       HashSet <Integer> s = new HashSet <>();
	       ArrayList<Integer> list = new ArrayList<>();
	        for(int i=0; i<a.length;i++){
	              s.add(a[i]);
	        }
	        for(int i=0; i<b.length; i++){
	           if(s.contains(b[i])){
	              list.add(b[i]);
	            }
	        }
	          return convertToArray(list);
	    }
}
