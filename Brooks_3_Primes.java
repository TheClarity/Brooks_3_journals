
public class Brooks_3_Primes {
	public static void main(String[] args){
		int evens = 0;
		for(int i=0; i<=100; i++ ) {
			//                                                                    System.out.println(i);
			if(i % 2 == 0){
				evens = evens + 1;
			}
			//System.out.println("is " + i + " even? " + isEven(i));
			//System.out.println("is " + i + " odd? " + isOdd(i));
			System.out.println("Is " + i + " Prime? " + isPrime(i));
			if(isPrime(i) == true) {
			  
			}
			}
		System.out.println("Ther are "+evens+" evens in this");
		
	}

		
	


/*
  What is a method?
  	A method is a function
  	Like a little program, e.g.
  	like finding a square root, something you want to do again and again
*/

	static boolean isEven(int number){
	// A return value is the type of value you're giving back to the program
		return (number % 2 == 0);
	}
	static boolean isOdd(int number){
	// A return value is the type of value you're giving back to the program
		return (number % 2 == 1);
	}
	static boolean isPrime(int number){
		boolean prime = true;
		int divisor = 0;
		// A return value is the type of value you're giving back to the program
		for(int i=2; i < number; i++) {
			if (number % i == 0) {
				divisor += 1;
			}
			if(number % i == 0 ){
				prime = false;
				divisor += 1;
			}
		
		}
		return prime;
}
}




//for(int i = 0;1 < 100;i++){
//if(i % 2 != 0){
//	if(i % 3 != 0){
//		if(i % 3 != 0){
//			if(i % 5 != 0){
//				if(i % 7 != 0){
//					System.out.println(i+" is not even");
//				}
//			}
//		}
//	}
////	System.out.println(i+" is not even");
//}