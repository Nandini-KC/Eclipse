
public class Ex {
	void sum(int... values)
	{
		System.out.println(values.length);
		int sum=0;
		for(int i=0;i<values.length;i++)
		{
			sum+=values[i];
		}
		System.out.println("sum="+sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated metho stub
		Ex a=new Ex();
		a.sum(10,30,60,100);

	}

}
