
public class IsFact {
	public static void main(String[] args) {
		int n=40,i;
		System.out.println("The factors of number" +n+ "are:");
	    for(i=1;i<=n;++i)
	    {
	    	if(n%i==0)
	    		System.out.println(i);
	    }
	}

}
