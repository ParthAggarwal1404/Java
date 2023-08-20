import java.util.*;
public class prime_number{
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter num");
		int n = Sc.nextInt();
		int i,count=1;
		for(i=2;i<=n;i++){
		if(n%i==0){
		count++;
		}
		if(count==1){
		System.out.println("It is a Prime number");
		break;
		}
		else{
		System.out.print("Not a prime");
			}
		}
	}
}