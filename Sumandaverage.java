class Sumandaverage
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,sum;
		float avg;+++

		System.out.println("enter the values of a,b amd c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sum=sc.nextInt();
		avg=sum/3.0f;

		System.out.println("Sum of three integer numbers="+sum);
		System.out.println("average of three numbers="+avg);
	}
}