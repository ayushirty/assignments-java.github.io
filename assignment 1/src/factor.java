
public class factor {
public static void main(String args[]) {
	// even numbers
	//int even = 500;
	//for(int i = 0; i<= even; i = i+1) {
		//if (i % 2 == 0) {
			//System.out.println(i);
		//}
	//odd number
	//int odd = 500;
	//for (int i = 0; i<=odd; i = i+1) {
		//if (i%2 != 0) {
		//System.out.println(i);
	//}
		
	//how many factors does 100 have (count)
	int num = 100;
	int count = 0;
	for  (int i = 1 ; i <= num ; i = i+1) {
		if (num % i ==0) {
			count = count + 1;
		}
	}
	System.out.println(count);
}
}
