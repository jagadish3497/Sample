package dom.jai.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void Additiontest(float FirstNumber, float SecondNumber) {
		Caluclator calc=new Caluclator();
		float result =calc.addition(FirstNumber, SecondNumber);
		assertEquals(FirstNumber,SecondNumber,result);		
	}

}
