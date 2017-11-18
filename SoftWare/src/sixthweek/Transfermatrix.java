package sixthweek;
/*
 * 求发展效率
 */
public class Transfermatrix {
	int[] number;
	int[] MGnumber;
	public Transfermatrix(int[] number,int[] MGnumber) {
		this.number=number;
		this.MGnumber=MGnumber;
	}
	public void completeE() {
		double E = 0;
		double D12=(-1)*(double)number[1]/(double)MGnumber[0];
		double D13=(-8)*(double)number[2]/(double)MGnumber[0];
		double D21=(double)number[3]/(double)MGnumber[1];
		double D23=(-1)*(double)number[5]/(double)MGnumber[1];
		double D31=8*(double)number[6]/(double)MGnumber[2];
		double D32=(double)number[7]/(double)MGnumber[2];
		E=D12+D13+D21+D23+D31+D32;
		String result=String.format("%.4f", E);
		System.out.println("E="+result);
	}
}
