import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

public class PersonTest6 {
	
	@Test//(expected=EmployeeException.class)
	public void getTestException()// throws EmployeeException
	{
		System.out.println("from emp : ");
		//fail("hello");
		Employee e1 = new Employee();
		e1.setSalary(2500);
		
		assertEquals(2500,e1.getSalary()) ;
		
	}
}
