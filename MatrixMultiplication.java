import java.util.*;
public class MatrixMultiplication {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int m,n,p,q;
		System.out.println("enter row length");
		m=sc.nextInt();
		System.out.println("enter coloumn length");
		n=sc.nextInt();
		System.out.println("enter second row length");
		p=sc.nextInt();
		System.out.println("enter second column length");
		q=sc.nextInt();
		if(n==p) {
		int[][]a=new int[m][n];
		int[][]b=new int[p][q];
		int[][]c=new int[m][q];
			System.out.println("enter the values");
			for (int i=0;i<m;i++) {
				for (int j=0;j<n;j++) {
					a[i][j]=sc.nextInt();
					
				}
			}
			System.out.println("1st matrix ele are:");
			for (int i=0;i<m;i++) {
				for (int j=0;j<n;j++) {
					System.out.print(a[i][j]);
				System.out.println();	
				}
			}
			System.out.println("enter 2the values");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					b[i][j]=sc.nextInt();
				}
			}
			System.out.println("2nd matrix ele are:");
			for (int i=0;i<p;i++) {
				for (int j=0;j<q;j++) {
					System.out.print(b[i][j]);
				System.out.println();	
				}
			}
			
			
		for(int i=0;i<m;i++) {
				for(int j=0;j<q;j++) {
					c[i][j]=0;
					for(int k=0;k<n;k++) {
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}
				}
			}
			for(int i=0;i<m;i++) {
				for(int j=0;j<q;j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();

			}
		}
	}

}
