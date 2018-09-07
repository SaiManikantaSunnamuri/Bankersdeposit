import java.util.*;
public class Tictactoe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,k,l;
		k=3;
		l=3;
		int a[][]=new int[k][l];
		for (int m=0;m<k;m++) {
			for(int n=0;n<l;n++) {
				a[m][n]=0;
			}
		}
		for (int m=0;m<k;m++) {
			for(int n=0;n<l;n++) {
				System.out.print(a[m][n]+" ");
			}
			System.out.println();
		}
		int c=1,br=0,b1=0,b2=0;
		while(c>0&&br==0) {
			if(br==0) {
			if(c%2==1 && b2==0) {
			System.out.println("enter index value of player 1");
			i=sc.nextInt();
		    j=sc.nextInt();
					if(a[i][j]==0) {
						a[i][j]=1;
						b1=0;
					}
					else {
						System.out.println("Already entered");
						b1=1;
					}
			for (int m=0;m<3;m++) {
				for(int n=0;n<3;n++) {
					System.out.print(a[m][n]+" ");
				}
				System.out.println();
			}
		}
		else if(c%2==0 && b1==0){
			System.out.println("enter index value of player 2");
			i=sc.nextInt();
			j=sc.nextInt();
					if(a[i][j]==0) {
						a[i][j]=2;
						b2=0;
					}
					else {
						System.out.println("Already entered");
						b2=1;
					}
			for (int m=0;m<3;m++) {
				for(int n=0;n<3;n++) {
					System.out.print(a[m][n]+" ");
				}
				System.out.println();
			}		
		}
		for( i=0;i<3;i++) {
			j=0;
			if(a[i][j]==1) {
				if(a[i][++j]==1) {
					if(a[i][++j]==1) {
						System.out.println("player 1 winner");
						br++;
					}
				}
			}
		}
		for( j=0;j<3;j++) {
			i=0;
			if(a[i][j]==1) {
				if(a[++i][j]==1) {
					if(a[++i][j]==1) {
						System.out.println("player 1 winner");
						br++;
					}
				}
			}
		}
		for( i=0;i<3;i++) {
			j=0;
			if(a[i][j]==2) {
				if(a[i][++j]==2) {
					if(a[i][++j]==2) {
						System.out.println("player 2 winner");
						br++;
					}
				}
			}
		}
		for( j=0;j<3;j++) {
			i=0;
			if(a[i][j]==2) {
				if(a[++i][j]==2) {
					if(a[++i][j]==2) {
						System.out.println("player 2 winner");
						br++;
					}
				}
			}
		}
		if(a[0][0]==1 && a[1][1]==1 && a[2][2]==1) {
			System.out.println("player 1 wins");
			br++;
		}
		 if(a[0][0]==2 && a[1][1]==2 && a[2][2]==2) {
			System.out.println("player 2 wins");
			br++;
			}
		if(a[0][2]==1 && a[1][1]==1 && a[2][0]==1) {
				System.out.println("player 1 wins");
				br++;
			}
		if(a[0][2]==2 && a[1][1]==2 && a[2][0]==2) {
				System.out.println("player 2 wins");
				br++;
			}
		c++;
			}
			else {
				break;
			}
		}
}
}