package firstweek;
import java.util.Scanner;
//做一次git的测试
public class Main {
	public static void main(String[] arge) throws Exception {
		Scanner in=new Scanner(System.in);
		System.out.print("请输入想要生成什么分布，正态分布/平均分布/ZITF分布？");
		String mode=in.nextLine();
		if(mode.equals("正态分布")) {
			NoramlDistribution normal=new NoramlDistribution();
		}
		else if(mode.equals("平均分布")) {
			AverageDistribution average=new AverageDistribution();
		}
		else if(mode.equals("ZIPF分布")) {
			System.out.println("不会……");
		}
		else System.out.println("输入错误");
	}
}