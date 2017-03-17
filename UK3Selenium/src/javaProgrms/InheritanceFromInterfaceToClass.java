package javaProgrms;

interface Bank1
{
	static float BaseRoi=10; // static variables only allowed
	
	float calRateofInterest();
}

interface Government1 extends Bank1
{
	static float taxOnFixedDeposit=4; // static variables only allowed
	
	float taxOnCommercialInvestments();
}


public class InheritanceFromInterfaceToClass implements Government1 {

	public static void main(String[] args) {
			
		InheritanceFromInterfaceToClass IandC = new InheritanceFromInterfaceToClass();
		
		System.out.println(IandC.calRateofInterest());
		
		System.out.println(IandC.taxOnCommercialInvestments());
		
	}
	
	public float taxOnCommercialInvestments()
	{

		return (float)(taxOnFixedDeposit+0.4+(9/100));
		
	}

	public float calRateofInterest() {
		
		return (BaseRoi+4+(15/100));
	}

}
