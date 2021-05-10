import java.util.Scanner;

public class scanDhan {
	public static void main(String[] args) {
	int age;
	String name;
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter Your Name :");
	name=scanner.nextLine();
	System.out.println("Enter Your Age : ");
	age=scanner.nextInt();
	System.out.println("Hello : "+name);
	System.out.println("Age : "+age);
	scanner.close();

}
}