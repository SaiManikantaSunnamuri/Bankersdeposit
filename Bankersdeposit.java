import java.util.*;
public class Bank_Intrest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("enter your gender m/f");
		char gender=sc.next().charAt(0);
		System.out.println("enter your deposited amount");
		int amount=sc.nextInt();
		System.out.println("fixed deposited days");
		int days=sc.nextInt();
		System.out.println("enter date of birth year");
		int year=sc.nextInt();
		if(amount>10000 && days<90) {
			double r=8.5;
			if(gender=='m') {
				if(year==1983) {
					r=r+0.9;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age>60 && age<70) {
					r=r+1.0;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age>70) {
					r=r+2.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age<60) {
					r=r;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
			}
			else if(gender=='f') {
				if(year==1983) {
					r=r+0.9+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age<60 && age>70) {
					r=r+1.0+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}	
				else if(age>70) {
					r=r+2.5+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age<60) {
					r=r+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
			}
		}
		if(amount>20000 &&days>90 && days<120) {
			double r=9.5;
			if(gender=='m') {
				if(year==1983) {
					r=r+0.9;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age>60 && age<70) {
					r=r+1.0;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age>70) {
					r=r+2.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age<60) {
					r=r;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
			}
			else if(gender=='f') {
				if(year==1983) {
					r=r+0.9+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age<60 && age>70) {
					r=r+1.0+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}	
				else if(age>70) {
					r=r+2.5+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age<60) {
					r=r+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
			}
		}
		if(amount>50000 && days>90 && days<120) {
			double r=9.8;
			if(gender=='m') {
				if(year==1983) {
					r=r+0.9;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age>60 && age<70) {
					r=r+1.0;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age>70) {
					r=r+2.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age<60) {
					r=r;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);

				}
			}
			else if(gender=='f') {
				if(year==1983) {
					r=r+0.9+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age<60 && age>70) {
					r=r+1.0+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}	
				else if(age>70) {
					r=r+2.5+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age<60) {
					r=r+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
			}
		}
		if(amount<=100000 && days>90) {
			double r=10.5;
			if(gender=='m') {
				if(year==1983) {
					r=r+0.9;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age>60 && age<70) {
					r=r+1.0;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age>70) {
					r=r+2.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age<60) {
					r=r;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);

				}
			}
			else if(gender=='f') {
				if(year==1983) {
					r=r+0.9+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age<60 && age>70) {
					r=r+1.0+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}	
				else if(age>70) {
					r=r+2.5+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);
				}
				else if(age<60) {
					r=r+0.5;
					System.out.println("your name is  :"+name);
					System.out.println("your age is ;"+age);
					System.out.println("rate of interest ="+r);
					double totalamount=(amount+(amount/100)*r);
					System.out.println("your deposited amount is="+amount);
					System.out.println("your age is="+age);
					System.out.println("your total amount is:"+totalamount);

				}

			}

		}
		
	}

}
