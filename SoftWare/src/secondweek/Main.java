package secondweek;
/*
 * ������
 */
import java.util.Arrays;

public class Main {
	public static void main(String[] arge) {
		int AT1,AT2,AT3;
		AT1=(int)P_rand(5);
		AT2=(int)P_rand(5);
		AT3=(int)P_rand(5);
		//���������������
		Task t1=new Task(1,AT1,AT1+2,50,AT1+52,25);
		Task t2=new Task(2,AT2,AT2+3,40,AT2+43,35);
		Task t3=new Task(3,AT3,AT3+2,54,AT3+57,30);
		//�������񵽴�ʱ������
		Task[] tasks= {t1,t2,t3};
		Arrays.sort(tasks);
		//�����������������
		Vim v1=new Vim(1);
		Vim v2=new Vim(2);
		//�����ź��������ֱ�ȡ����������ִ��
		ChooseSuit f1=new ChooseSuit(tasks[0], v1, v2);
		f1.completeVim();
		ChooseSuit f2=new ChooseSuit(tasks[1], v1, v2);
		f2.completeVim();
		ChooseSuit f3=new ChooseSuit(tasks[2], v1, v2);
		f3.completeVim();
	}
	//�������㲴�ɷֲ��������
	public static double P_rand(double Lamda){ 
		   double x=0,b=1,c=Math.exp(-Lamda),u; 
		   do {
		     u=Math.random();
		     b *=u;
		     if(b>=c)
		       x++;
		   }while(b>=c);
		   return x;
		 }
}
