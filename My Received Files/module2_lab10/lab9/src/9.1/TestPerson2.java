import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class  TestPerson2 
{
	@Test
	public void testGetFullName()
	{
		System.out.println("from TestPerson2");
		Person1 per = new Person1("Robert","King");
		assertEquals("Robert King",per.getFullName());
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testNullsInName()
	{
		System.out.println("from TestPerson2 testing exceptions");
		Person1 per1 = new Person1(null,null);		
	}
}
