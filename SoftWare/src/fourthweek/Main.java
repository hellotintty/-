package fourthweek;
import java.util.ArrayList;
import java.util.Objects;
/*
 * ���ݹ�ϵ�ľ����㷨
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] arge) {
		Object A=new Object();
		CreatObjects cob=new CreatObjects();
		cob.setName();
		ArrayList<Object> objects=new ArrayList<Object>();
		objects=cob.importObjects();
		Scanner in=new Scanner(System.in);
		CreatD d=new CreatD();
		int[][] D1=d.importD();
		System.out.println("����������룬��ϵ����D����ͼ");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(D1[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.print("��������ֵ��");
		int temp=in.nextInt();
		Compclustering compclustering=new Compclustering(D1, objects, temp);
		ArrayList<ArrayList> list=new ArrayList<ArrayList>();
		list=compclustering.complete();
		System.out.print("SC:");
		System.out.print("{");
		for(int i=0;i<list.size();i++) {
			System.out.print("{ ");
			for(int j=0;j<list.get(i).size();j++) {
				System.out.print(list.get(i).get(j).toString()+" ");
			}
			System.out.print("}");
		}
		System.out.print("}");
	}
}
