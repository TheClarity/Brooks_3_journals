
public class brooks_ProjectZero {

	public static void main(String[] args) {
		for(int i=0; i <= 500; i++) {
			if (isDivTwo(i) && isDivEleven(i)) {
				System.out.println("Ninja");
			}
			else if (isDivThree(i) && isDivEleven(i)) {
				System.out.println("Herr Direktor");
			}
			else if (isDivFive(i) && isDivEleven(i)) {
				System.out.println("Animate This!");
			}
			else if (isDivTwo(i) && isDivThree(i) && isDivFive(i)) {
				System.out.println("Team Building");
			}
			else if (isDivFive(i) && isDivThree(i)) {
				System.out.println("Old School");
			}
			else if (isDivTwo(i) && isDivThree(i)) {
				System.out.println("chisme");
			}
			else if (isDivTwo(i)){
				System.out.println("Davis");
			}
			else if (isDivThree(i)){
				System.out.println("Claughton");
			}
			else if (isDivFive(i)){
				System.out.println("Vidal");
			}
			else {
				System.out.println((i));
			}
		}
	}
	static boolean isDivTwo (int number){
		return(number % 2 == 0);
	}
	static boolean isDivThree (int number){
		return(number % 3 == 0);
	}
	static boolean isDivFive (int number){
		return(number % 5 == 0);
	}
	static boolean isDivEleven (int number){
		return(number % 11 == 0);
	}
}
