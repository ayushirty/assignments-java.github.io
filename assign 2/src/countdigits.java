
public class countdigits {
public static void main(String args[]) {
	//count all digits in a number
	//898

	
	int num = 898;
	int count = 0;
	
	while (num != 0) {
		num /= 10;
		count = count+1;
	}
		System.out.println("Number of Digits in given number is " + count);
	}
		
	
	
}

