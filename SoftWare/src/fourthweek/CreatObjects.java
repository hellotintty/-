package fourthweek;
/*
 * 创建对象集类
 */
import java.util.ArrayList;

public class CreatObjects {
	Object A=new Object();
	Object B=new Object();
	Object C=new Object();
	Object D=new Object();
	public void setName() {
		Object A=new Object();
		A.name="A";
		A.numberD=0;
		this.A=A;
		Object B=new Object();
		B.name="B";
		B.numberD=1;
		this.B=B;
		Object C=new Object();
		C.name="C";
		C.numberD=2;
		this.C=C;
		Object D=new Object();
		D.name="D";
		D.numberD=3;
		this.D=D;
	}
	ArrayList<Object> importObjects(){
		ArrayList<Object> objects=new ArrayList<Object>();
		objects.add(A);
		objects.add(B);
		objects.add(C);
		objects.add(D);
		return objects;
	}
}
