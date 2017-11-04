package fifthweek;

import java.util.Scanner;

public class Computer {
	int ID;
	int p;
	int time;
	int[] cost=new int[4];
	Scanner in=new Scanner(System.in);
	public Computer(int ID,int p,int cost1,int cost2,int cost3,int cost4) {
		this.ID=ID;
		this.p=p;
		cost[0]=cost1;
		cost[1]=cost2;
		cost[2]=cost3;
		cost[3]=cost4;
		//获取在每个存储区需要的时间
		if(ID==1) {
			System.out.print("请输入任务在第1个存储区需要占用的时间为:");
			time=in.nextInt();
		}
		else if(ID==2) {
			System.out.print("请输入任务在第2个存储区需要占用的时间为:");
			time=in.nextInt();
		}
		else if(ID==3) {
			System.out.print("请输入任务在第3个存储区需要占用的时间为:");
			time=in.nextInt();
		}
		else if(ID==4) {
			System.out.print("请输入任务在第4个存储区需要占用的时间为:");
			time=in.nextInt();
		}
	}
	//根据传入的时间返回调度成本
	public int getCost(int time) {
		if(time<p) {
			return cost[0];
		}
		else if(time>=p&&time<2*p) {
			return cost[1];
		}
		else if(time>=2*p&&time<3*p) {
			return cost[2];
		}
		else return cost[3];
	}
}
