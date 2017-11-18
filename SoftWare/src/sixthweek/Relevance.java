package sixthweek;
/*
 * 根据皮尔逊分析法求相关性
 */
public class Relevance {
	int[] number;
	int[] MGnumber;
	int num;
	public Relevance(int[] number,int[] MGnumber,int num) {
		this.number=number;
		this.MGnumber=MGnumber;
		this.num=num;
	}
	public void completeRelevance() {
		double[] totalNumX=new double[3];
		double[] totalNumY=new double[3];
		//求分子
		for (int i=0;i<3;i++) {
			totalNumX[i]=(double)MGnumber[i];
		}
		for (int j=0;j<3;j++) {
			totalNumY[j]=(double)MGnumber[j+3];
		}
		double moleculeSum=0;
		for(int i=0;i<3;i++) {
			moleculeSum=moleculeSum+(totalNumX[i]-totalNumX[i]/3)*(totalNumY[i]-totalNumY[i]/3);
		}
		double molecule=moleculeSum/3;
		//求坟墓
		double denominatorXNum=0;
		for(int i=0;i<totalNumX.length;i++) {
			denominatorXNum=denominatorXNum+Math.pow(totalNumX[i]-totalNumX[i]/3, 2);
		}
		double denominatorX=Math.sqrt(denominatorXNum/3);
		double denominatorYNum=0;
		for(int i=0;i<totalNumX.length;i++) {
			denominatorYNum=denominatorYNum+Math.pow(totalNumY[i]-totalNumY[i]/3, 2);
		}
		double denominatorY=Math.sqrt(denominatorYNum/3);
		double denominator=denominatorX*denominatorY;
		double r=molecule/denominator;
		String result=String.format("%.4f", r);
		System.out.println("r="+result);
	}
}
