package custom;

public class CustomException 
{
	public void veifyAge(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("Not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}
	public static void main(String[] args) throws AgeException 
	{
		CustomException ob=new CustomException();
		ob.veifyAge(12);

	}

}
