import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AirthematicTest {
	private int firstNumber;
	private int secondNumber;
	private int expectResult;
	private Airthematic airthematic;
	

	public AirthematicTest(int firstNumber, int secondNumber, int expectResult) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.expectResult = expectResult;
	}
	
	@Before
	public void init() {
		this.airthematic = new Airthematic();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {
			 {1,2,3}
			,{11,22,33}
			,{111,222,333}
			,{10,9,19}
			,{100,9,109}
		});
	}



	@Test
	public void test() {
		System.out.println("Sum of Number = :"+expectResult);
		assertEquals(expectResult, airthematic.sum(firstNumber, secondNumber));
	}

}
