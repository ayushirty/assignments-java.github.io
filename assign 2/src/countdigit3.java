
public class countdigit3 {
	public static void main(String args[]) {
		//9837483
		int num = 9837483;
		int count = 0;
		while(num != 0){
			num /= 10;
			count = count+1;
		}
		System.out.println("number of digits in given number is " + count);
	}

}
