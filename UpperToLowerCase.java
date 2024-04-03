package strings;
import java.util.*;
public class UpperToLowerCase {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the String");
			String str= sc.nextLine();
			System.out.println(tolowercase(str));
			}
	}
	public static String tolowercase(String str) {
		StringBuilder sb=new StringBuilder("");
		char ch=Character.toUpperCase(str.charAt(0));
		sb.append(ch);
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==' '&& i<str.length()-1) {
				sb.append(str.charAt(i));
				i++;
				sb.append(Character.toUpperCase(str.charAt(i)));
			}else {
				sb.append(Character.toLowerCase(str.charAt(i)));
			}
		}
		return sb.toString();
	}
}
