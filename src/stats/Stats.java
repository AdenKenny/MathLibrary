package stats;

import java.util.List;
import java.util.Random;

public class Stats {

	public boolean monteCarloTest(float num) {//No N value, uses default of 1000.

		final int N = 1000;
		int a = 0;
		int b = 0;

		Random rn = new Random();

		for (int i = 0; i < N; i++) {

			double max = 100000;
			double min = -100000;

			Double f = min + (rn.nextDouble() * (max - min));

			if (f < num) {
				a++;
			}

			else {
				b++;
			}
		}
		return a < b ? true : false;
	}
	
	public boolean monteCarloTest(float num, int N) { //Passed N value. 

		int a = 0;
		int b = 0;

		Random rn = new Random();

		for (int i = 0; i < N; i++) {

			double max = 100000;
			double min = -100000;

			Double f = min + (rn.nextDouble() * (max - min));

			if (f < num) {
				a++;
			}

			else {
				b++;
			}
		}
		return a < b ? true : false;
	}
	
	   public double pearsons(List<? extends Double> x, List<? extends Double> y){
	       
		   	double sumX = 0;
	        double sumY = 0;
	        double sumX2 = 0;
	        double sumY2 = 0;

	        double sumXY = 0;

	        double topHalf = 0;
	        double bottomHalf = 0;

	       

	        for(double xi: x){
	            sumX = sumX + xi;
	            sumX2 = sumX2 + Math.pow(xi, 2);
	        }

	        for(double yi: y){
	            sumY = sumY + yi;
	            sumY2 = sumY2 + Math.pow(yi, 2);
	        }

	        int n = x.size();
	        
	        for(int i = 0; i < n; i++){
	            sumXY = sumXY + (x.get(i) * y.get(i));
	        }

	        topHalf = sumXY - (((sumX)*(sumY)) / n);
	        bottomHalf = Math.sqrt(((sumX2 - ((Math.pow(sumX, 2)) / n)) * (sumY2 - ((Math.pow(sumY, 2)) / n))));

	        return (topHalf / bottomHalf);

	        
	    }
	   
	   

}
