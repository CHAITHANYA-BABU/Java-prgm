
public class IsPallindrom {
	public static void main(String[] args) {
		int n=171,num,i,rev,rim=0;
		num=n;		
		while(n>0) {
			rev=n%10;
			rim=rim*10+rev;
			n=n/10;
		}
		if(num==rim)
			System.out.println("the number"+num+"is pallindrom");
		else
			System.out.println("the number"+num+"is not pallindrom");
	}

}
