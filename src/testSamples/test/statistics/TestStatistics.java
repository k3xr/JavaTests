package statistics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStatistics {

	@Test
	public void average2_3returns4(){
		
		double[] anArray = new double[2];
		anArray[0] = 3;
		anArray[1] = 5;
		// 3rd argument is precision
		assertEquals(4.0, Statistics.average(anArray),0.1);
	}
	
	@Test
	public void average5_0_10returns5(){
		
		double[] anArray = new double[3];
		anArray[0] = 5;
		anArray[1] = 0;
		anArray[2] = 10;
		assertEquals(5.0, Statistics.average(anArray),0.1);
	}
	
	@Test
	public void average10returns10(){
		
		double[] anArray = new double[1];
		anArray[0] = 10;
		assertEquals(10, Statistics.average(anArray),0.1);
	}
	
	@Test
	public void histogram10_2_10(){
		
		double[] anArray = new double[3];
		anArray[0] = 10;
		anArray[1] = 2;
		anArray[2] = 10;
		assertEquals(
				  "            *       \n"
				+ "    *       *       \n"
				+ "________________\n"
				+ "|       |       |\n"
				+ "2.0\t6.0\t10.0\n", 
				Statistics.histogram(anArray));
	}
	
	@Test
	public void histogram15Data(){
		
		double[] anArray = new double[15];
		anArray[0] = 5;
		anArray[1] = 6;
		anArray[2] = 14;
		anArray[3] = 10;
		anArray[4] = 2;
		anArray[5] = 1;
		anArray[6] = 6;
		anArray[7] = 7;
		anArray[8] = 6;
		anArray[9] = 5;
		anArray[10] = 10;
		anArray[11] = 6;
		anArray[12] = 6;
		anArray[13] = 5;
		anArray[14] = 5;
		assertEquals(
				  "            *                       \n"
				+ "            *                       \n"
				+ "            *                       \n"
				+ "            *                       \n"
				+ "            *                       \n"
				+ "            *                       \n"
				+ "            *                       \n"
				+ "            *                       \n"
				+ "    *       *       *               \n"
				+ "    *       *       *       *       \n"
				+ "________________________________\n"
				+ "|       |       |       |       |\n"
				+ "1.0\t4.25\t7.5\t10.75\t14.0\n", Statistics.histogram(anArray));
	}
	
	@Test
	public void histogram20Data(){		
		double[] anArray = new double[20];
		anArray[0] = 3;
		anArray[1] = 1;
		anArray[2] = 1;
		anArray[3] = 1;
		anArray[4] = 2;
		anArray[5] = 2;
		anArray[6] = 2;
		anArray[7] = 2;
		anArray[8] = 3;
		anArray[9] = 3;
		anArray[10] = 3;
		anArray[11] = 4;
		anArray[12] = 4;
		anArray[13] = 4;
		anArray[14] = 3;
		anArray[15] = 4;
		anArray[16] = 4;
		anArray[17] = 4;
		anArray[18] = 4;
		anArray[19] = 4;
		assertEquals(
				  "                                    *       \n"
				+ "                                    *       \n"
				+ "                                    *       \n"
				+ "                            *       *       \n"
				+ "            *               *       *       \n"
				+ "    *       *               *       *       \n"
				+ "    *       *               *       *       \n"
				+ "    *       *               *       *       \n"
				+ "________________________________________\n"
				+ "|       |       |       |       |       |\n"
				+ "1.0\t1.6\t2.2\t2.8\t3.4\t4.0\n", Statistics.histogram(anArray));
	}
	
	
}
