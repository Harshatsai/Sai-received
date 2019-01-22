import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

public class Date1Test {
	
	
		@BeforeEach
		public void getStringName()
		{
			System.out.println("from test : ");
		}
	
		@Test
		public void getTestDate()
		{
			Date1 d1=new Date1(12,10,1996);
			assertEquals(12, d1.getDay());
		}
		@Test
		public void getTestMonth()
		{
			Date1 d2=new Date1(12,10,1996);
			assertEquals(10, d2.getMonth());
		}
		@Test
		public void getTestYear()
		{
			Date1 d3=new Date1(12,10,1996);
			assertEquals(1996, d3.getYear());
		}
		@AfterAll
		public void testConclude()
		{
			System.out.println("test is done");
		}
}
