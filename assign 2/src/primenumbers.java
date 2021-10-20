
public class primenumbers {
public static void main(String args[]) {
	//print all prime numbers between 1 to 100
	int i;
	int num;
	int count = 0;
	System.out.println("prime number between 1 to 100\n");
	for(i = 2; i<= 100; i++ ) {
		for(num = 1; num<=i; num++) {
			if (i%num == 0)
				count = count + 1 ;
		}
		if (count == 2)
			
			System.out.println("" +i);
	count = 0;
	}
	
	
}
}
