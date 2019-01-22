import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestPerson3 {

	@Test
	public void testGetfName()
	{
		PersonInfo p1 = new PersonInfo("ram","rahim",'M');
		assertEquals("ram", p1.getFirstName());
	}
	@Test
	public void testGetlName()
	{
		PersonInfo p2 = new PersonInfo("ram","rahim",'M');
		assertEquals("rahim", p2.getLastName());
	}
	@Test
	public void testGender()
	{
		PersonInfo p3 = new PersonInfo("ram","rahim",'M');
		assertEquals('M', p3.getGender());
	}
	@BeforeEach
	public void testBeforeAll()
	{
		System.out.println(" from person : ");
	}
}
