public class SavingAccount
{

	public static void main(String[] args)
	{
	int balance = 1000;
	String name = "Damian";

	int balance2 = 2000;
	String name2 = "Bill";

	int balance3 = 3000;
	String name3 = "Sam";
	}

		public double balance;
			public double interestRate = 0.01;
			public String name;

			public double calcInterest()
			{
				//scope variabel interest pada method calcInterest saja
				double interest = balance*interestRate/12;
				return interest;
			}


			public void deposit(int x)
			{
				balance += x;
			}


			public void displayCustomer()
			{
			System.out.println("Customer: "+ name);
			System.out.println("Balance: "+balance);
			System.out.println("Rate: "+interestRate);
			}
}