import java.util.*;
class test {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if(num1<0) {
			System.out.println("You entered negative number");
		}
		else {
			System.out.println("You entered positive number");
		}
	}
}