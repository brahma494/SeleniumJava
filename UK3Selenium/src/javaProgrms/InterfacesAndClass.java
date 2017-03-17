package javaProgrms;


interface Bank
{
	static float BaseRoi=10; // static variables only allowed
	
	float calRateofInterest();
}

interface Government
{
	static float taxOnFixedDeposit=4; // static variables only allowed
	
	float taxOnCommercialInvestments();
}



public class InterfacesAndClass  {

	public static void main(String[] args) {
		SBI s = new SBI();
			
		System.out.println("SBI Personal Loan Bank Rate:"+s.calRateofInterest());
		
		System.out.println("SBI Tax Rate on Commercial Trans:"+s.taxOnCommercialInvestments());
		
		// Kotak Bank
		Kotak k = new Kotak();
		System.out.println("Kotak Personal Loan Bank Rate:"+k.calRateofInterest());
		
		System.out.println("Kotak Tax Rate on Commercial Trans:"+k.taxOnCommercialInvestments());
		
		
		
		
		
	}
	
}

class SBI implements Bank,Government
{
	int bankcharges=1;
	
	public float calRateofInterest()
	 {
		return (BaseRoi+3+(12/100));
	 }
	
	public float calHomeLoansInterest(){
		
		return (11*10/100+bankcharges);
	}
	
	public float taxOnCommercialInvestments()
	{
		float roif =(float)(taxOnFixedDeposit+0.4+(9/100));
		return roif;
		
	}


}

class Kotak implements Bank,Government
{
	
	public float calRateofInterest()
	 {
		 
		return (BaseRoi+4+(15/100));
	 }
	
	public float taxOnCommercialInvestments()
	{
		return (float)(taxOnFixedDeposit+0.33+(9/100));
	}


}