package firstweek;
import java.util.Scanner;
//正态分布
public class NoramlDistribution extends AllFunction{
	array[] normalArray=new array[10000];		//建一个10000大小的对象数组
	NoramlDistribution()throws Exception{
	for(int i=0;i<10000;i++) {					//用for循环给每一个对象中的数字属性赋值
		Generate everyNum=new Generate(1);
		normalArray[i]=everyNum;			//初始化
		System.out.println(normalArray[i].everyNum);  //用作测试
	}
	super.SerializeNumber(normalArray);
	SerializeNumber(normalArray);
	super.Median(normalArray);
	super.Average(normalArray);
	super.maxNum(normalArray);
	super.minNum(normalArray);
	Scanner in=new Scanner(System.in);
	System.out.print("请输入α：");
	double a=in.nextDouble();
	System.out.print("请输入β：");
	double b=in.nextDouble();
	ThreePart normal=new ThreePart(normalArray, a, b);
	}
}
//均匀分布
class AverageDistribution extends AllFunction{
	array[] averageArray=new array[10000];
	AverageDistribution()throws Exception{
		for(int i=0;i<10000;i++) {
			Generate everyNum=new Generate(2);
			averageArray[i]=everyNum;
			System.out.println(averageArray[i].everyNum);  //用作测试
			}
		super.SerializeNumber(averageArray);
		SerializeNumber(averageArray);
		super.Median(averageArray);
		super.Average(averageArray);
		super.maxNum(averageArray);
		super.minNum(averageArray);
		Scanner in=new Scanner(System.in);
		System.out.print("请输入α：");
		double a=in.nextDouble();
		System.out.print("请输入β：");
		double b=in.nextDouble();
		ThreePart normal=new ThreePart(averageArray, a, b);
		}
	}
//ZIPF分布，不会……
class ZipfDistribution extends AllFunction{
	
}