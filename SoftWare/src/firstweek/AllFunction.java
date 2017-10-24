package firstweek;

import java.awt.Event;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
public class AllFunction {
	//将对象数组写入文件
	public void SerializeNumber(array[] array)throws FileNotFoundException,IOException{
		File file=new File("E:/array.txt");
		FileOutputStream filewriter=new FileOutputStream(file,true);
	     ObjectOutputStream oo = new ObjectOutputStream(filewriter);
	     //用foreach遍历对象数组
	     for(array sz:array) {
	    	 oo.writeObject(sz);
	         oo.flush();
	     }
	     oo.close();
	     filewriter.close();
	}
	//计算中位数
	static void Median(array[] array) {
		double[] medianCompute=new double[array.length];
		for(int i=0;i<array.length;i++) {
			medianCompute[i]=array[i].everyNum;
		}
		Arrays.sort(medianCompute);
		if((medianCompute.length)%2==0) {
			System.out.print("中位数为："+medianCompute[medianCompute.length/2]+";");
		}else {
			double num=0;
			num=medianCompute[(int)(Math.floor(medianCompute.length/2))]+medianCompute[(int)(Math.ceil(medianCompute.length/2))]/2;
			System.out.print("中位数为："+num+";");
		}
	}
	//计算中位数并返回值
	static double Median(double[] SZ) {
		Arrays.sort(SZ);
		if((SZ.length)%2==0) {
			System.out.print("中位数为："+SZ[SZ.length/2]+";");
			return SZ[SZ.length/2];
		}else {
			double num=0;
			num=SZ[(int)(Math.floor(SZ.length/2))]+SZ[(int)(Math.ceil(SZ.length/2))]/2;
			System.out.print("中位数为："+num+";");
			return num;
		}
	}
	//计算平均数
	static void Average(array[] array) {
		double[] medianCompute=new double[array.length];
		for(int i=0;i<array.length;i++) {
			medianCompute[i]=array[i].everyNum;
		}
		Arrays.sort(medianCompute);
		double Total=0;
		for(int i=0;i<medianCompute.length;i++) {
			Total+=medianCompute[i];
		}
		System.out.print("平均数为："+Total/10000+";");
	}
	//计算平均数并返回值
	static double Average(double[] SZ) {
		double Total=0;
		double m=0;
		for(int i=0;i<SZ.length;i++) {
			Total+=SZ[i];
		}
		System.out.print("平均数为："+Total/10000+";");
		return m=Total/10000;
	}
	//计算最大值
	static void maxNum(array[] array) {
		double[] medianCompute=new double[array.length];
		for(int i=0;i<array.length;i++) {
			medianCompute[i]=array[i].everyNum;
		}
		Arrays.sort(medianCompute);
		double max=0;
		for(int i=0;i<medianCompute.length;i++) {
			if(medianCompute[i]>max)  max=medianCompute[i];
		}
		System.out.print("最大值为："+max+";");
	}
	//计算最大值并返回值
	static double maxNum(double[] SZ) {
		double max=0;
		for(int i=0;i<SZ.length;i++) {
			if(SZ[i]>max)  max=SZ[i];
		}
		System.out.print("最大值为："+max+";");
		return max;
	}
	//计算最小值
	static void minNum(array[] array) {
		double[] medianCompute=new double[array.length];
		for(int i=0;i<array.length;i++) {
			medianCompute[i]=array[i].everyNum;
		}
		Arrays.sort(medianCompute);
		double min=1;
		for(int i=0;i<medianCompute.length;i++) {
			if(medianCompute[i]<min)  min=medianCompute[i];
		}
		System.out.println("最小值为："+min);
	}
	//计算最小值并返回值
	static double minNum(double[] SZ) {
		double min=1;
		for(int i=0;i<SZ.length;i++) {
			if(SZ[i]<min)  min=SZ[i];
		}
		System.out.println("最小值为："+min);
		return min;
	}

}
//数组对象父类
class array extends AllFunction implements Serializable{
//	private static final long serialVersionUID = -5809782578272943999L;
	double everyNum;
	int local1;
	int local2;
	public void setNum(double everyNum) {
		this.everyNum=everyNum;
	}
	public double getNum() {
		return everyNum;
	}
}
//将数组分成三部分，并求出每部分的中位数，平均数，最大值，最小值
class ThreePart extends AllFunction{
	int minpart=0,maxpart=0,medianpart=0;
	double a,b;
	double[] minPart=new double[minpart];
	double[] medianPart=new double[medianpart];
	double[] maxPart=new double[maxpart];
	ThreePart(array[] array,double a,double b){
		this.a=a;
		this.b=b;
		for(int i=0;i<array.length;i++) {
			if(array[i].everyNum<=a) {
				array[i].local1=1;array[i].local2=1;
				minpart++;
			}
			else if(array[i].everyNum>a&&array[i].everyNum<b) {
				array[i].local1=2;array[i].local2=2;
				medianpart++;
			}
			else {array[i].local1=3;array[i].local2=3;maxpart++;}
		}
		//根据给定的值确定三部分的数组
		double[] minPart=new double[minpart];
		double[] medianPart=new double[medianpart];
		double[] maxPart=new double[maxpart];
		int temp1=0,temp2=0,temp3=0;
		for(int i=0;i<array.length;i++) {
			if(array[i].everyNum<=a) 	{minPart[temp1]=array[i].everyNum;temp1++;}
			else if(array[i].everyNum>a&&array[i].everyNum<b){
				medianPart[temp2]=array[i].everyNum;temp2++;
			}
			else {
				maxPart[temp3]=array[i].everyNum;temp3++;
			}
		}
		this.minPart=minPart;
		this.medianPart=medianPart;
		this.maxPart=maxPart;
		showThreePart(array);
	}
	public void showThreePart(array[] array) {
		System.out.print("第一部分的");
		super.Median(minPart);
		super.Average(minPart);
		super.maxNum(minPart);
		super.minNum(minPart);
		System.out.print("第二部分的");
		super.Median(medianPart);
		super.Average(medianPart);
		super.maxNum(medianPart);
		super.minNum(medianPart);
		System.out.print("第三部分的");
		super.Median(maxPart);
		super.Average(maxPart);
		super.maxNum(maxPart);
		super.minNum(maxPart);
		Scanner in=new Scanner(System.in);
		System.out.print("请指定P1中低于中卫数的，提高百分之多少：");
		int c=in.nextInt();
		System.out.print("P2中低于中卫数的，提高百分之多少；");
		int d=in.nextInt();
		System.out.print("P3中高于中位数的，减少百分之多少；");
		int e=in.nextInt();
		ImproveReduce makeSuit=new ImproveReduce(array,minPart,medianPart,maxPart,this.a,this.b,c,d,e);
	}
}
//提升降低类
class ImproveReduce extends AllFunction{
	public ImproveReduce(array[] array,double[] a, double[] b, double[] c, double d, double e,int f,int g,int h) {
		int benefit=0;
		double Num1,Num2,Num3;
		Num1=super.Median(a);
		Num2=super.Median(b);
		Num3=super.Median(c);
		for(int i=0;i<array.length;i++) {
			if(array[i].local1==1&&array[i].everyNum<Num1) {
				array[i].everyNum=array[i].everyNum+array[i].everyNum*(f/100);
				if(array[i].everyNum>d) array[i].local2=2;
			}
			else if(array[i].local1==2&&array[i].everyNum<Num2) {
				array[i].everyNum=array[i].everyNum+array[i].everyNum*(g/100);
				if(array[i].everyNum>d) array[i].local2=3;
			}
			else {
				array[i].everyNum=array[i].everyNum-array[i].everyNum*(h/100);
				if(array[i].everyNum>d) array[i].local2=2;
			}
		}
		//计算收益
		int[][] count=new int[100][100];
		int temp=0;
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				count[i][j]=array[temp].local2-array[temp].local1;
				temp+=1;
				benefit+=count[i][j];
			}
		}
		System.out.println("总收益为："+benefit);
		}
}