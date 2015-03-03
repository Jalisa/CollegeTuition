import java.util.Scanner;
//Jalisa Hewitt
public class TuitionCost {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the initial tuition cost: ");
		double IC = input.nextDouble();
		System.out.println("Enter the percentage increase per year: ");
		double p = input.nextDouble();
		double y2= (IC*p)+IC;
		double y3= (y2*p)+y2;
		double y4= (y3*p)+y3;
		double totalcost = ((IC+y2+y3+y4));
		// print the total tuition cost
		System.out.printf("The total cost of tuition to complete a degree is $"+
						totalcost);
	}
}