
public class IsPrime {
	public static void main(String[] args) {
		int n=23,temp=0,i;
	    for(i=2;i<=n/2;++i)
	    {
	    	if(n%i==0)
	    	{
	    		temp=1;
	    		break;
	    	}
	    }
		if(n==1)
			System.out.println("number"+n+"is prime");
		else {
			if(temp==0)
				System.out.println("number"+n+"is prime");
			else
				System.out.println("number"+n+"is not prime");
		}
	}

}
