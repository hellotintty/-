package fifthweek;
/*
 * ѡȡ�ɱ���͵ĵ��Ȳ��ԣ��ɱ��䶯���Ʊ�۸�
 */
import java.util.ArrayList;
import java.util.Collections;

public class Application {
	public static void main(String[] arge) {
		ArrayList<Result> costs=new ArrayList<>();		//�洢ÿһ�ֽ�ĳɱ������бȽ�
		Computer c1=new Computer(1, 10, 50, 100, 150, 230);
		Computer c2=new Computer(2, 13, 47, 52, 180, 201);
		Computer c3=new Computer(3, 5, 59, 102, 147, 190);
		Computer c4=new Computer(4, 11, 39, 71, 128, 260);
		Computer[] computers=new Computer[4];
		computers[0]=c1;
		computers[1]=c2;
		computers[2]=c3;
		computers[3]=c4;
		//������п��ܽ�
		for(Computer computer:computers) {
			for(Computer computer1:computers) {
				for(Computer computer2:computers) {
					for(Computer computer3:computers) {
						String order=computer.ID+"-"+computer1.ID+"-"+computer2.ID+"-"+computer3.ID;
						int cost=computer.getCost(0)+computer1.getCost(computer.time)+computer2.getCost(computer.time+computer1.time)+computer3.getCost(computer.time+computer1.time+computer2.time);
						int time=computer.time+computer1.time+computer2.time+computer3.time;
						System.out.print(order+"..........."+cost+"............");
						System.out.println(time);
						Result result=new Result(order, cost, time);
						costs.add(result);
					}
				}
			}
		}
		System.out.println("______________________________________________");
		//�Ա����������ݰ������ȳɱ�����֮ʱ��Ĺ�������
		Collections.sort(costs);
		System.out.print("�ɱ���͵Ľ�Ϊ:");
		System.out.print(costs.get(0).order+".........");
		System.out.println("�ɱ�Ϊ"+costs.get(0).cost);
	}
}
