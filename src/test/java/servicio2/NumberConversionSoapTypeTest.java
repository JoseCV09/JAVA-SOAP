package servicio2;

import java.math.BigDecimal;import java.math.BigInteger;
import org.junit.Test;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;


public class NumberConversionSoapTypeTest {
	NumberConversionSoapType servicio2 = new NumberConversion().getNumberConversionSoap();
	@Test
	public void testNumberToWords() {
		System.out.println("****CONVERSIONES****\n");
		String resultado=servicio2.numberToWords(new BigInteger("10"));
		System.out.println("Tu conversion a palabra es: "+resultado);
	}
	@Test
	public void testNumberToDollars() {
		String resultado=servicio2.numberToDollars(new BigDecimal(10.20));	
		System.out.println("\nLa conversión a dolar es: "+resultado);
	
		
	}
	
	

}
