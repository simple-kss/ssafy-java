import java.lang.reflect.*;

public class reflect_field {
	public double num;

	public static void main(String args[]) {
		try {
			Class cls = Class.forName("reflect_field");
			Field fld = cls.getField("num");
			
			reflect_field fobj = new reflect_field();
			System.out.println("num = " + fobj.num);
			fld.setDouble(fobj, 20.30);
			System.out.println("num = " + fobj.num);
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}