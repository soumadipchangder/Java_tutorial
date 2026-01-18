package abstraction;

public class JuniorDinga extends Dinga{
	
	@Override
	public void goldloan() {
		System.out.println("JuniorDinga paid gold loan");
	}
	
	public void bike() {
		System.out.println("BMW");
	}
	public static void main(String[] args) {
		JuniorDinga jd=new JuniorDinga();
		jd.homeloan();
		jd.goldloan();
		jd.bike();
		
		Parent p=new JuniorDinga();//UPCASTING
		p.homeloan();
		p.goldloan();
		
		Dinga d=new JuniorDinga();
		d.homeloan();
		d.goldloan();
	}

}
