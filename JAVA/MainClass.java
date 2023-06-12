import java.util.Scanner;

class MainClass{
	public static void main(String[] args){
	System.out.println("Enter a decimal number=");
	Scanner sc= new Scanner(System.in);
	int dec=sc.nextInt();
			
	FunClass fc= new FunClass();
		
	System.out.println("Binary value="+fc.btod(dec));
	}
}