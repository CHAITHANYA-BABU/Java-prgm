
public class IsAngstrom {
	public static void main(String[] args) {
		int n=370,rim,sum=0,num;
		num=n;
		while(n!=0)
		{
			rim=n%10;
			sum=sum+(rim*rim*rim);
			n=n/10;
		}
		if(num==sum)
			System.out.println("number"+num+"is armstrong");
		else
			System.out.println("number"+num+"is not armstrong");
	}

}
