public class GCD {
	private static int num;
	private static int den;
	private static int gcd = 0;
	public GCD() {
		num = 0;
		den = 1;
		}
	
	public GCD(int a, int b) {
		num = a;
		den = b;
		getGCD(num, den);
		simplify();
		}	
		
	private static void getGCD(int a, int b) {
		int max = 0; 
		if (a > b) {
			max = a;
			}
		else {
			max = b;
			}	
		for (int x = 1; x < max; x++) {
			if ((a % x == 0)&&(b % x == 0)) {
				gcd = x;
				}
			}		
		}		
		
	private void simplify() {
		num /= gcd;
		den /= gcd;
		}
		
	private double getValue() {
		return num / den;
		}
	
	private String toString(int a, int b) {
		return a + "/" + b;
		}			
	
	public static void main(String[] args) {
		GCD demo = new GCD(40, 12);	
		System.out.println(demo.toString(num, den));
		}
	}
