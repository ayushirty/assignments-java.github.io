
public class countdigits2 {
public static void main(String args[]) {
	//099
	int num = 099 ;
	int count = 0;
	while(num != 0);{
	num /= 10 ;
	count = count + 1;
	}
	System.out.println("number of digits in given number is " + count);
	
			
}
}
