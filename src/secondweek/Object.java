package secondweek;
/*
 * 定义虚拟机和任务对象
 */
public class Object {

}
//任务类
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
//虚拟机类
class Vim{
	int ID,count=0,U=100;
	boolean flag=true;
	public Vim(int ID) {
		this.ID=ID;
		System.out.println("Vim"+this.ID+",U="+U+"%");
	}
}
