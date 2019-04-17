import java.lang.reflect.*;

public class Reflection02 {
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String args[]) {
		try {
			Class cls = Class.forName("Reflection02");
			Class partypes[] = new Class[2];
			partypes[0] = Integer.TYPE;
			partypes[1] = Integer.TYPE;
			Method meth = cls.getMethod("add", partypes);
			Reflection02 methobj = new Reflection02();
			
			// 인자 2개 담기
			Object arglist[] = new Object[2];
			arglist[0] = new Integer(37);
			arglist[1] = new Integer(47);
			
			// 메서드 실행
			Object retobj = meth.invoke(methobj, arglist);
			Integer retval = (Integer) retobj;
			System.out.println(retval.intValue());

		} catch (Throwable e) {
			System.err.println(e);
		}

	}
}

