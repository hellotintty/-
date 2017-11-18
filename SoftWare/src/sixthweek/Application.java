package sixthweek;
/*
 * 数据分析
 */
import java.util.Scanner;

public class Application {
	public static void main(String[] arge) {
		Scanner in=new Scanner(System.in);
		System.out.print("请输入学生总人数:");
		int num=in.nextInt();
		//根据总人数生成随机数
		Randomnumber randomnumber=new Randomnumber(num);
		randomnumber.generateNum();
		int[] number=randomnumber.number;
		int[] MGnumber=randomnumber.MGnumber;
		//第一步
		Showmatrix showmatrix1=new Showmatrix(number, MGnumber, num);
		showmatrix1.showJTable();
		//第二部
		Transfermatrix transfermatrix=new Transfermatrix(number, MGnumber);
		transfermatrix.completeE();
		//第三步
		Relevance relevance=new Relevance(number, MGnumber, num);
		relevance.completeRelevance();
	}
}
