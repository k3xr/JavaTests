import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StatisticsparameterizedTest {
	
	private double result;
	private double [] values;
	
	public StatisticsparameterizedTest(double result, double[] values){
		this.result = result;
		this.values = values;
	}
	
	@Parameters
	public static Collection<Object[]> myData() {
		
		return Arrays.asList(new Object[][]{{2, new double[]{2.0,2.0}},
											{5, new double[]{2.0,8.0}}
											});
	}
	
	@Test
	public void checkAverage(){
		assertEquals(result, Statistics.average(values),0.01);
	}
}
