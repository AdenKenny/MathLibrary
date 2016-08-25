package stats;

import java.util.List;
import java.util.Random;

public class Stats<V extends Number> {

	public boolean isNegative(V num) {//No N value, uses default of 1000.

		final int N = 1000;
		int a = 0;
		int b = 0;

		double ngNum = num.doubleValue();
		
		Random rn = new Random();

		for (int i = 0; i < N; i++) {

			double max = 100000;
			double min = -100000;

			Double f = min + (rn.nextDouble() * (max - min));

			if (f < ngNum) {
				a++;
			}

			else {
				b++;
			}
		}
		return a < b ? true : false;
	}
	
	public boolean isNegative(V num, int N) { //Passed N value. 

		int a = 0;
		int b = 0;

		double ngNum = num.doubleValue();
		
		Random rn = new Random();

		for (int i = 0; i < N; i++) {

			double max = 100000;
			double min = -100000;

			Double f = min + (rn.nextDouble() * (max - min));

			if (f < ngNum) {
				a++;
			}

			else {
				b++;
			}
		}
		return a < b ? true : false;
	}
	
	   public static double pearsons(List<? extends Number> x, List<? extends Number> y){
	       
		   	double sumX = 0;
	        double sumY = 0;
	        double sumX2 = 0;
	        double sumY2 = 0;

	        for(Number xi: x) { 
	        	double temp = xi.doubleValue();
	        	sumX+= temp;
	        	sumX2+= Math.pow(temp, 2);
	        }
	        
	        for(Number yi: y) { 
	        	double temp = yi.doubleValue();
	        	sumY+= temp;
	        	sumX2+=Math.pow(temp, 2);
	        }
	        
	        double sumXY = 0;
	        int n = x.size();
	        for(int i = 0; i < n; i++) {
	        	double temp1 = x.get(i).doubleValue();
	        	double temp2 = y.get(i).doubleValue();
	        	sumXY+= (temp1 * temp2);
	        }
	        
	        return (sumXY - (((sumX) * (sumY)) / n)) / (Math.sqrt(((sumX2 - ((Math.pow(sumX, 2)) / n))
	        * (sumY2 - ((Math.pow(sumY, 2)) / n)))));
	    }
	   
	   

}
