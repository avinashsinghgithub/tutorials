package strings;

import java.util.HashSet;
import java.util.Set;

public class StringManipulation {
	
	public static void main (String [] args){
		String str1="aaabbbbccddd";
		int count=0;
		StringBuffer sb= new StringBuffer();
		char[] chars=str1.toCharArray();
		char lastChar='-';
		Set<Character> charSet= new HashSet<Character>();
		for(int i=0;i<chars.length;i++){
			//System.out.println(sb.length()-1);
			if(sb.length()-1 >=0 && sb.charAt(sb.length()-1)== chars[i]){
				//sb.append(chars[i]);
				count++;
				System.out.println("count in if loop :" +count);
			}else{
				sb.append(chars[i]);
				count=1;
				System.out.println("count in else loop :" + count);
			}
				
		}
		System.out.println(sb);
	}

}
