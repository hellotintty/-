package secondweek;
/*
 * ��Ҫ��������
 */
public class ChooseSuit {
	Task t;
	Vim v1,v2;
	ChooseSuit(Task t,Vim v1,Vim v2) {
		this.t=t;
		this.v1=v1;
		this.v2=v2;
		//�ж������1��2�е������Ƿ����
		if (t.AT>=v1.count) 	 v1.flag=true;
		else if(t.AT>=v2.count)  v2.flag=true;
	}
	/*
	 * �ж�������Ƿ����
	 * ���ж�������Ƿ���У��������������Ҫ���ܸ㣬ѡȡ���ܺĵ��������������
	 */
	
	public void completeVim() {
		if(v1.flag==true) {
			if(v2.flag==true) {
				double E1=completeIdle(t.AT, t.FT, v1.U);
				double E2=completeIdle(t.AT, t.FT, v2.U);
				if(E1>E2) {
					v2.flag=false;
					v2.U=v2.U-t.U;
					System.out.println("Task"+t.ID+"�������2��ִ��"+",�����2��ʥ��UΪ"+v2.U+"%"+",�ܺ�Ϊ"+E2);
					v2.count=t.FT;
					}
				else {
					v1.flag=false;
					v1.U=v1.U-t.U;
					System.out.println("Task"+t.ID+"�������1��ִ��"+",�����1��ʥ��UΪ"+v1.U+"%"+",�ܺ�Ϊ"+E1);
					v1.count=t.FT;
				}
			}
			else if(v1.U>=t.U) {
				v1.flag=false;
				v1.U=v1.U-t.U;
				System.out.println("Task"+t.ID+"�������1��ִ��"+",�����1��ʣ��UΪ"+v1.U+"%");
				v1.count=t.FT;
			}
			else completeOtherVim(t, v1, v2);
		}
		else completeOtherVim(t, v1, v2);
	}
	//�ж���һ̨������Ƿ�Ϊ����
	public void completeOtherVim(Task t,Vim v1,Vim v2) {
		if(v2.flag==true) {
			if(v2.U>=t.U){
				v2.flag=false;
				v2.U=v2.U-t.U;
				double E=completeIdle(t.AT,t.FT,v2.U);
				System.out.println("Task"+t.ID+"�������2��ִ��"+",�����2��ʣ��UΪ"+v2.U+"%,�ܺ�Ϊ"+E);
				v2.count=t.FT;
			}
			else {
				System.out.println("�����������ʹ���ʶ������ˣ��޷�ִ������");
			}
		}
		else {
			double E1=completeEnerage(t.AT, t.FT,v1.U);
			double E2=completeEnerage(t.AT, t.FT, v2.U);
			if(E1>E2) {
				v2.U=v2.U-t.U;
				System.out.println("Task"+t.ID+"�������2���Ŷӵȴ�ִ��"+",�����2��ʣ��UΪ"+v2.U+"%,��������Ϊ"+E2);
			}
			else {
				v1.U=v1.U-t.U;
				System.out.println("Task"+t.ID+"�������1���Ŷӵȴ�ִ��"+",�����1��ʣ��UΪ"+v1.U+"%,��������Ϊ"+E1);
			}
		}
	}
	//���������������ʱ���ܺ�
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
	//����������ǿ���ʱ���ܺ�
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
