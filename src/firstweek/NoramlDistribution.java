package firstweek;
import java.util.Scanner;
//��̬�ֲ�
public class NoramlDistribution extends AllFunction{
	array[] normalArray=new array[10000];		//��һ��10000��С�Ķ�������
	NoramlDistribution()throws Exception{
	for(int i=0;i<10000;i++) {					//��forѭ����ÿһ�������е��������Ը�ֵ
		Generate everyNum=new Generate(1);
		normalArray[i]=everyNum;			//��ʼ��
		System.out.println(normalArray[i].everyNum);  //��������
	}
	super.SerializeNumber(normalArray);
	SerializeNumber(normalArray);
	super.Median(normalArray);
	super.Average(normalArray);
	super.maxNum(normalArray);
	super.minNum(normalArray);
	Scanner in=new Scanner(System.in);
	System.out.print("���������");
	double a=in.nextDouble();
	System.out.print("������£�");
	double b=in.nextDouble();
	ThreePart normal=new ThreePart(normalArray, a, b);
	}
}
//���ȷֲ�
class AverageDistribution extends AllFunction{
	array[] averageArray=new array[10000];
	AverageDistribution()throws Exception{
		for(int i=0;i<10000;i++) {
			Generate everyNum=new Generate(2);
			averageArray[i]=everyNum;
			System.out.println(averageArray[i].everyNum);  //��������
			}
		super.SerializeNumber(averageArray);
		SerializeNumber(averageArray);
		super.Median(averageArray);
		super.Average(averageArray);
		super.maxNum(averageArray);
		super.minNum(averageArray);
		Scanner in=new Scanner(System.in);
		System.out.print("���������");
		double a=in.nextDouble();
		System.out.print("������£�");
		double b=in.nextDouble();
		ThreePart normal=new ThreePart(averageArray, a, b);
		}
	}
//ZIPF�ֲ������ᡭ��
class ZipfDistribution extends AllFunction{
	
}