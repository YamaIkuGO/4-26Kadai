package snakecamel;
import java.util.Scanner;
public class main {

	public static void main(String[] args){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		Scanner sc = new Scanner(System.in);
		System.out.println("type a word!");
		String word = sc.nextLine();
		char c = word.charAt(0);
		
		String changed="";
		if(Character.isUpperCase(c)){
			changed=scu.snakeToCamelcase(word);
		}else{
			changed=scu.camelToSnakecase(word);
		}
		
		System.out.println("→"+changed);
	}
}
