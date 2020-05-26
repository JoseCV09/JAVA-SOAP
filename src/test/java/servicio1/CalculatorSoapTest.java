package servicio1;
import org.junit.Test;
import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;
public class CalculatorSoapTest {
	CalculatorSoap servicio1 = new Calculator().getCalculatorSoap();
	@Test
	public void testAdd() {		
		int resultado = servicio1.add(20, 10);
		System.out.println("La suma es: "+ resultado);
	}
	@Test
	public void testSubtract() {
		int resultado = servicio1.subtract(20, 10);
		System.out.println("La resta es: "+ resultado);
	}
	@Test
	public void testMultiply() {
		int resultado = servicio1.multiply(20, 10);
		System.out.println("La multiplicación es: "+ resultado);
	}
	@Test
	public void testDivide() {
		int resultado = servicio1.divide(20, 10);
		System.out.println("La división es: "+ resultado);
	}
}
