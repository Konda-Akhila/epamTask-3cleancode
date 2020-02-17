package akhilatask_4.akhilatask1_4;

	import java.util.Scanner;

	public class Building1{
		public void cost1(){
			@SuppressWarnings("resource")
			Scanner s=new Scanner(System.in);
			System.out.format("%s","menu");
			System.out.format("%s","\n1.standard materials");
			System.out.format("%s","\n2.above stabdard materials");
			System.out.format("%s","\n3.high standard materials");
			System.out.format("%s","\n4.high standar materials and fully automated home");
			int[] mc= {1200,1500,1700,2600};
			int res;
			double a,b;
			System.out.format("%s","\n enter your choice for material of house");
			res=s.nextInt();
			System.out.format("%s","\n enter total area of the house in sq.ft");
			a=s.nextDouble();
			b=mc[res-1]*a;
			System.out.format("the cost of constuction is %.2f",b);
			
		}

}
