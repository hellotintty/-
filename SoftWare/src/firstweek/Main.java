package firstweek;
import java.util.Scanner;
//��һ��git�Ĳ���
public class Main {
	public static void main(String[] arge) throws Exception {
		Scanner in=new Scanner(System.in);
		System.out.print("��������Ҫ����ʲô�ֲ�����̬�ֲ�/ƽ���ֲ�/ZITF�ֲ���");
		String mode=in.nextLine();
		if(mode.equals("��̬�ֲ�")) {
			NoramlDistribution normal=new NoramlDistribution();
		}
		else if(mode.equals("ƽ���ֲ�")) {
			AverageDistribution average=new AverageDistribution();
		}
		else if(mode.equals("ZIPF�ֲ�")) {
			System.out.println("���ᡭ��");
		}
		else System.out.println("�������");
	}
}