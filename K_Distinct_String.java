package Hashing;
import java.util.*;
public class K_Distinct_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcbaacde";
			System.out.print(kDistinct(s,5));
	}
	public static char kDistinct(String str, int k){
	    HashSet<Character> h=new HashSet<Character>();
	    char c=' ';
	    for(int i=0;i<str.length();i++){
	        h.add(str.charAt(i));
	        if(h.size()==k){
	            c=str.charAt(i);
	        }
	    }
	/*    Iterator<Character> i=h.iterator();
		while(i.hasNext()){
		    System.out.print(i.next()+" ");
		}*/
		return c;
	}
}
