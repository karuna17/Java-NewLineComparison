import java.util.Scanner;

public class LineComparisonDemo {
	Scanner sc = new Scanner(System.in);
	public void compareLine() {
		System.out.println("Enter the value of X1, X2 ,Y1, Y2 for first line");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		
		System.out.println("Enter the value of A1, A2 ,B1, B2 for second line");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		double line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (x2 - x1));
		double line2 = Math.sqrt((a2 - a1) * (a2 - a1) + (a2 - a1) * (b2 - b1));

		System.out.println("Line1: "+line1);
		System.out.println("Line2: "+line2);

		if(line1==line2){
			System.out.println("Both lines are equal");
		}
		else{
			System.out.println("Both lines are not equal");
		}
	}
	public static void main(String[] args) {
     LineComparisonDemo l = new LineComparisonDemo();
     l.compareLine();
	}

}
