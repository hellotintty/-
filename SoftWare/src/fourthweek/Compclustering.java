package fourthweek;
/*
 * 相容关系的聚类算法
 */
import java.util.ArrayList;

public class Compclustering {
	int[][] D;
	ArrayList<Object> S;
	int temp;
	Object x;
	ArrayList<ArrayList> list=new ArrayList<ArrayList>();
	ArrayList<Object> Cnew=new ArrayList<Object>();
	ArrayList<Object> Sx=new ArrayList<Object>();   //记得每走过一次算法就清空一次Sc
	ArrayList<Object> Sxx=new ArrayList<Object>();
	public Compclustering(int[][] D,ArrayList<Object> objects,int temp) {
		this.D=D;
		this.S=objects;
		this.temp=temp;
	}
	//SC（list)：相容簇，Cnew：每一次生成的相容集 ，D：关系度量，S：对象集，&（temp）：阈值
	public ArrayList<ArrayList> complete() {
		//当S不为空集时，对任意x属于S，都有x传入Cnew,S中减去x这个值
		while(S.size()!=0) {			//while S!=null do 对任意x属于S；x传入Cnew，S=S-x
			if(S.get(0)!=null) {
				Cnew.add(S.get(0));
				System.out.println("Cnew中新增对象"+S.get(0).name);
				this.x=S.get(0);
				S.remove(0);
			}
			//为Sx填入除过x之外S中剩余的所有符合阈值要求的对象
			for(int i=0;i<S.size();i++) {		//Ｓ（ｘ）＝｛ｙ｜ Ｄ（ｙ，ｘ）≤δａｎｄＤ（ｘ，ｙ）≤δ，ｙ∈Ｓ｝； 
				if(D[x.numberD][S.get(i).numberD]<=temp) {
					Sx.add(S.get(i));
					System.out.println("Sx中新增"+S.get(i).name);
				}
				else System.out.println(x.name+"与"+S.get(i).name+"不合适");
			}
			//ｗｈｉｌｅＳ（ｘ）≠null ｄｏ 　对任意ｚ∈Ｓ（ｘ）；Ｃｎｅｗ←ｚ；Ｓ（ｘ）＝Ｓ（ｘ）－｛ｚ｝； 　Ｓ′＝Ｓ－Ｃｎｅｗ；
			while(Sx.size()!=0) {		
				Cnew.add(Sx.get(0));
				System.out.println("Cnew中新增"+Sx.get(0).name);
				Sx.remove(0);
				Sxx.addAll(S);
				Sxx.removeAll(Cnew);
				for(int i=0;i<Sxx.size();i++) {
					int n=0;
					for(int j=0;j<Cnew.size();j++) {
						if(D[Sxx.get(i).numberD][Cnew.get(j).numberD]<=temp&&D[Sxx.get(i).numberD][Cnew.get(j).numberD]>0) {
							n++;
						}
					}
					if(n==Cnew.size()) {
						Cnew.add(Sxx.get(i));
						System.out.println("Cnew中新增"+Sxx.get(i).name);
						Sx.remove(Sxx.get(i));  				//如果有添加要删除Sx中的此对象，避免重复
					}
				}
			}
			//判断List是否为空，若为空，直接将Cnew添加
			if(list.size()==0) {		
				ArrayList<Object> copyCnew=new ArrayList<>();
				copyCnew.addAll(Cnew);
				list.add(copyCnew);
				Cnew.clear();
			}
			//否则说明List中有其他链表，故而将Cnew与List中每个小List做比较看是否为子集
			else {						
				int count=0;
				for(int i=0;i<list.size();i++) {
					ArrayList<Object> templist=new ArrayList<Object>();
					templist.addAll(list.get(i));
					templist.retainAll(Cnew);
					if(!templist.equals(Cnew)) {
						count++;
					}
					else Cnew.clear();
					}
				if(count==list.size()) {
					ArrayList<Object> copyCnew=new ArrayList<>();
					copyCnew.addAll(Cnew);
					list.add(copyCnew);
					Cnew.clear();
				}
			}
			System.out.println("————————————————————————————————");
		}
		return list;
	}
}
