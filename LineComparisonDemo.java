import java.util.Scanner;

public class LineComparisonDemo {

	public boolean equals(Object o1,Object o2)
	{
		if(o1.equals(o2)){
			System.out.println("line1 and line2 are equal");
		}else {
			System.out.println("line1 and line2 are not equal");
		}
		return false;
		
	}
	public static void main(String[] args) {
		LineComparisonDemo l = new LineComparisonDemo();

		Scanner sc = new Scanner(System.in);
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

		int line1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (x2 - x1));
		int line2 = (int) Math.sqrt((a2 - a1) * (a2 - a1) + (a2 - a1) * (b2 - b1));

		System.out.println("Value of Line1: "+line1);
		System.out.println("Value of Line2: "+line2);

		Integer i1 = new Integer(line1);
		Integer i2 = new Integer(line2);
		int res=i1.compareTo(i2);

		if(res>0){
			System.out.println("line1 is greater than line2");
		}else if(res<0) {
			System.out.println("line1 is less than line2");
		}else {
			System.out.println("line1 and line2 are equal");
		}
		
		System.out.println("=================================");
		l.equals(i1, i2);		
	}

}
