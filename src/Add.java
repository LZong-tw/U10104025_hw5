import java.math.BigDecimal;

public class Add {
	public static double addd(double a, double b) {
		BigDecimal b1 = new BigDecimal(Double.toString(a));
		BigDecimal b2 = new BigDecimal(Double.toString(b));
		return b1.add(b2).doubleValue();
	}
}
