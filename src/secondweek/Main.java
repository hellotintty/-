package secondweek;
/*
 * 主方法
 */
import java.util.Arrays;

public class Main {
	public static void main(String[] arge) {
		//定义三个任务对象
		Task t1=new Task(1,0,2,50,52,25);
		Task t2=new Task(2,4,7,40,47,35);
		Task t3=new Task(3,10,15,54,69,30);
		//根据任务到达时间排序
		Task[] tasks= {t1,t2,t3};
		Arrays.sort(tasks);
		//定义两个虚拟机对象
		Vim v1=new Vim(1);
		Vim v2=new Vim(2);
		//按照排好序的任务分别取出进行任务执行
		ChooseSuit f1=new ChooseSuit(tasks[0], v1, v2);
		f1.completeVim();
		ChooseSuit f2=new ChooseSuit(tasks[1], v1, v2);
		f2.completeVim();
		ChooseSuit f3=new ChooseSuit(tasks[2], v1, v2);
		f3.completeVim();
	}
}
