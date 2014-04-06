import java.math.BigDecimal;

public class Dev {
	public static double dev(double a, double b) {
		BigDecimal b1 = new BigDecimal(Double.toString(a));
		BigDecimal b2 = new BigDecimal(Double.toString(b));
		return b1.divide(b2).doubleValue();
	}
}
