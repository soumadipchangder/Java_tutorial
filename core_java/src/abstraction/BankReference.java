package abstraction;

abstract class Bank{
	abstract void getInterestRate();

}
class SBI extends Bank{
	@Override
	void getInterestRate() {
		System.out.println("2% interest rate");
	}
}
class HDFC extends Bank{
	@Override
	void getInterestRate() {
		System.out.println("4% interest rate");
	}
}
public class BankReference{
	public static void main(String[] args) {
		Bank b1=new SBI();
		b1.getInterestRate();
		System.out.println("-----------");
		Bank b2=new HDFC();
		b2.getInterestRate();
	}
}