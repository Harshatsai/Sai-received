package propertiesPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("source1/PropertiesProps.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String personName = prop.getProperty("person");
		String personContact = prop.getProperty("contact");
		String personAge = prop.getProperty("age");
		String personAddress = prop.getProperty("address");
		
		System.out.println(personName+" "+personContact+" "+personAge+" "+personAddress);
		
		
	}

}
