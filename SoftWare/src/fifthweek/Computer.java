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
		//��ȡ��ÿ���洢����Ҫ��ʱ��
		if(ID==1) {
			System.out.print("�����������ڵ�1���洢����Ҫռ�õ�ʱ��Ϊ:");
			time=in.nextInt();
		}
		else if(ID==2) {
			System.out.print("�����������ڵ�2���洢����Ҫռ�õ�ʱ��Ϊ:");
			time=in.nextInt();
		}
		else if(ID==3) {
			System.out.print("�����������ڵ�3���洢����Ҫռ�õ�ʱ��Ϊ:");
			time=in.nextInt();
		}
		else if(ID==4) {
			System.out.print("�����������ڵ�4���洢����Ҫռ�õ�ʱ��Ϊ:");
			time=in.nextInt();
		}
	}
	//���ݴ����ʱ�䷵�ص��ȳɱ�
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
