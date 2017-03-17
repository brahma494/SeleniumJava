package javaprograms2;
public class BaseEmployee {

		int empId=1;
		float bsal=10000;

		public float calEmployeeSal()
		{
			return (float) (bsal+(bsal*20)+(bsal*5)-(bsal*14)-(bsal*1)); 
		}
	
}
