package secondweek;
public class Object {

}
//������
class Task implements Comparable<Task>{
	int ID,AT=0,ST=0,P,FT=0;
	int U;
	public Task(int ID,int AT,int ST,int P,int FT,int U) {
		this.P=P;
		this.AT=AT;
		this.ST=ST;
		this.FT=FT;
		this.U=U;
		this.ID=ID;
		System.out.println("Task"+this.ID+",AT="+this.AT+",ST="+this.ST+",P="+this.P+",ST="+this.FT+",U="+this.U+"%");
	}
	@Override
	public int compareTo(Task o) {
		if(o.AT<AT)
			return 1;
		else if(o.AT>AT)
			return -1;
		else return 0;
	}
}
//�������
class Vim{
	int ID,count=0,U=100;
	boolean flag=true;
	public Vim(int ID) {
		this.ID=ID;
		System.out.println("Vim"+this.ID+",U="+U+"%");
	}
}
//��һ����
class firstStep {
	Task t;
	Vim v1,v2;
	firstStep(Task t,Vim v1,Vim v2) {
		this.t=t;
		this.v1=v1;
		this.v2=v2;
		//�ж������1��2�е������Ƿ����
		if (t.AT>=v1.count) 	 v1.flag=true;
		else if(t.AT>=v2.count)  v2.flag=true;
	}
	public void complete() {
		if(v1.U>=t.U) {
			if(v1.flag==true) {
				v1.flag=false;
				v1.U=v1.U-t.U;
				System.out.println("Task"+t.ID+"�������1��ִ��"+",�����1��ʣ��UΪ"+v1.U+"%");
				v1.count=t.FT;
			}
			else if(v2.U>=t.U) {
				if(v2.flag==true){
					v2.flag=false;
					v2.U=v2.U-t.U;
					System.out.println("Task"+t.ID+"�������2��ִ��"+",�����2��ʣ��UΪ"+v2.U+"%");
					v2.count=t.FT;
				}
				else {
					secondStep s=new secondStep(t, v1, v2);
					s.complete();
				}
			}
			else System.out.println("�����������ʹ���ʶ������ˣ��޷�ִ������");
		}
		else if(v2.U>=t.U) {
			if(v2.flag==true){
				v2.flag=false;
				v2.U=v2.U-t.U;
				System.out.println("Task"+t.ID+"�������2��ִ��"+",�����2��ʣ��UΪ"+v2.U+"%");
				v2.count=t.FT;
			}
			else {
				secondStep s=new secondStep(t, v1, v2);
				s.complete();
			}
		}
		else System.out.println("�����������ʹ���ʶ������ˣ��޷�ִ������");
	}
}
//�ڶ�����
class secondStep{
	Task t;
	Vim v1,v2;
	double u1,u2;
	secondStep(Task t,Vim v1,Vim v2) {
		this.t=t;
		this.v1=v1;
		this.v2=v2;
	}
	public void complete() {
		completeEnerage a=new completeEnerage();
		u1=a.compLete(t.AT,t.FT,v1.U);
		u2=a.compLete(t.AT, t.FT, v2.U);
		if(u1>u2) {
			v2.U=v2.U-t.U;
			System.out.println("Task"+t.ID+"�������2��ִ��"+"�������2��ʥ��UΪ"+v2.U+"%"+",�ܺ�Ϊ"+u2);
			v2.count=t.FT;
			}
		else {
			v1.U=v1.U-t.U;
			System.out.println("Task"+t.ID+"�������1��ִ��"+"�������1��ʥ��UΪ"+v1.U+"%"+",�ܺ�Ϊ"+u1);
			v1.count=t.FT;
		}
	}
}
//�����ܺ���
class completeEnerage{
	public double compLete(int AT,int FT,int u) {
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
}
