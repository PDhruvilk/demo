

public class pattern {
public static void main(String[] args) {
	int n = 10;
	for(int i=n-1;i>=1;i--) {
		for(int j=1;j<(n-i);j++) {
			System.out.print("  ");
		}
		for(int x=1;x<=(2*i)-1;x++) {
			if(i==1) {
				System.out.print(". ");
			}
			else if(x==1||x==(2*i)-1||i==n-1)
			{
				System.out.print("* ");	
			}
			
			else{
				System.out.print(". ");
			}
		}
		System.out.println();
	}
	for(int i=2;i<=n-1;i++) {
		for(int j=1;j<(n-i);j++) {
			System.out.print("  ");
		}
	for(int x=1;x<=(2*i)-1;x++) {
		if(x==1||x==(2*i)-1||i==n-1)
		{
			System.out.print("* ");	
		}
		else if(x==((2*i))/2||i==n-2) {
			System.out.print(". ");
		}
		else {
			System.out.print("  ");
		}
	}
		System.out.println();
	}
}
}
