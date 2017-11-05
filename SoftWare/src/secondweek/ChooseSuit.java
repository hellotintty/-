package secondweek;
/*
 * 主要操作步骤
 */
public class ChooseSuit {
	Task t;
	Vim v1,v2;
	ChooseSuit(Task t,Vim v1,Vim v2) {
		this.t=t;
		this.v1=v1;
		this.v2=v2;
		//判断虚拟机1和2中的任务是否完成
		if (t.AT>=v1.count) 	 v1.flag=true;
		else if(t.AT>=v2.count)  v2.flag=true;
	}
	/*
	 * 判断虚拟机是否空闲
	 * 先判断虚拟机是否空闲，若空闲则计算需要的能搞，选取低能耗的虚拟机运行任务
	 */
	
	public void completeVim() {
		if(v1.flag==true) {
			if(v2.flag==true) {
				double E1=completeIdle(t.AT, t.FT, v1.U);
				double E2=completeIdle(t.AT, t.FT, v2.U);
				if(E1>E2) {
					v2.flag=false;
					v2.U=v2.U-t.U;
					System.out.println("Task"+t.ID+"在虚拟机2中执行"+",虚拟机2中圣墟U为"+v2.U+"%"+",能耗为"+E2);
					v2.count=t.FT;
					}
				else {
					v1.flag=false;
					v1.U=v1.U-t.U;
					System.out.println("Task"+t.ID+"在虚拟机1中执行"+",虚拟机1中圣墟U为"+v1.U+"%"+",能耗为"+E1);
					v1.count=t.FT;
				}
			}
			else if(v1.U>=t.U) {
				v1.flag=false;
				v1.U=v1.U-t.U;
				System.out.println("Task"+t.ID+"在虚拟机1中执行"+",虚拟机1中剩余U为"+v1.U+"%");
				v1.count=t.FT;
			}
			else completeOtherVim(t, v1, v2);
		}
		else completeOtherVim(t, v1, v2);
	}
	//判断另一台虚拟机是否为空闲
	public void completeOtherVim(Task t,Vim v1,Vim v2) {
		if(v2.flag==true) {
			if(v2.U>=t.U){
				v2.flag=false;
				v2.U=v2.U-t.U;
				double E=completeIdle(t.AT,t.FT,v2.U);
				System.out.println("Task"+t.ID+"在虚拟机2中执行"+",虚拟机2中剩余U为"+v2.U+"%,能耗为"+E);
				v2.count=t.FT;
			}
			else {
				System.out.println("现有虚拟机的使用率都不够了，无法执行任务。");
			}
		}
		else {
			double E1=completeEnerage(t.AT, t.FT,v1.U);
			double E2=completeEnerage(t.AT, t.FT, v2.U);
			if(E1>E2) {
				v2.U=v2.U-t.U;
				System.out.println("Task"+t.ID+"在虚拟机2中排队等待执行"+",虚拟机2中剩余U为"+v2.U+"%,能量消耗为"+E2);
			}
			else {
				v1.U=v1.U-t.U;
				System.out.println("Task"+t.ID+"在虚拟机1中排队等待执行"+",虚拟机1中剩余U为"+v1.U+"%,能量消耗为"+E1);
			}
		}
	}
	//计算虚拟机都空闲时的能耗
	public double completeIdle(int AT,int FT,int u) {
		double e = 0;
		double p=0;
		if(u<=20) p=78.5;
		else if(u>20&&u<=30) p=83;
		else if(u>30&&u<=40)  p=85;
		else if(u>40&&u<=50)  p=88;
		else if(u>50&&u<=60)  p=93;
		else if(u>60&&u<=70)  p=102;
		else if(u>70&&u<=80)  p=109;
		else if(u>80&&u<=90)  p=122;
		else 				  p=136;
		e=p*(FT-AT);
		return e;
	}
	//计算虚拟机非空闲时的能耗
	public double completeEnerage(int AT,int FT,int u) {
		double e,p;
		int t=FT-AT;
		if(u<=20) 	{
			e=(78.5/10)*u*t;
		}
		else if(u>20&&u<=30) {
			e=78.5*t+(83/10)*(u%20)*t;
		}
		else if(u>30&&u<=40) {
			e=78.5*t+83*t+(85/10)*(u%30)*t;
		}
		else if(u>40&&u<=50) {
			e=78.5*t+83*t+85*t+(88/10)*(u%40)*t;
		}
		else if(u>50&&u<=60) {
			e=78.5*t+83*t+85*t+88*t+(93/10)*(u%50)*t;
		}
		else if(u>60&&u<=70) {
			e=78.5*t+83*t+85*t+88*t+93*t+(102/10)*(u%60)*t;
		}
		else if(u>70&&u<=80) {
			e=78.5*t+83*t+85*t+88*t+93*t+102*t+(109/10)*(u%70)*t;
		}
		else if(u>80&&u<=90) {
			e=78.5*t+83*t+85*t+88*t+93*t+102*t+109*t+(122/10)*(u%80)*t;
		}
		else 	{
			e=78.5*t+83*t+85*t+88*t+93*t+102*t+109*t+122*t+(136/10)*(u%90)*t;
		}
		return e;
	}
}
