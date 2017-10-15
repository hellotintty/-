package thirdweek;
/*
 * 主方法类，包括流程
 */
import java.util.Arrays;
/*
 * 婚姻匹配问题
 */
import java.util.Scanner;;
public class Main {
	public static void main(String[] arge) {
		Scanner in=new Scanner(System.in);
		System.out.print("请输入要配多少对:");
		int sum=in.nextInt();
		Men[] men=new Men[sum];
		Women[] women=new Women[sum];
		//输入每位男士的选择
		for(int i=0;i<sum;i++) {
			int[] a=new int[sum];
			for(int j=0;j<sum;j++) {
				System.out.print("请输入第"+(i+1)+"位男士的第"+(j+1)+"个选择：");
				a[j]=in.nextInt();
			}
			men[i]=new Men();
			men[i].setRank(a);
			men[i].ID=i+1;
			System.out.println(Arrays.toString(men[i].rank));
		}
		//输入每位女士的选择
		for(int i=0;i<sum;i++) {
			int[] a=new int[sum];
			for(int j=0;j<sum;j++) {
				System.out.print("请输入第"+(i+1)+"位女士的第"+(j+1)+"个选择：");
				a[j]=in.nextInt();
			}
			women[i]=new Women();
			women[i].setRank(a);
			women[i].ID=i+1;
			System.out.println(Arrays.toString(women[i].rank));
		}
		for(int i=0;i<sum;i++) {                 //匹配次数
			System.out.println("第"+(i+1)+"次匹配：");
			for(int j=0;j<sum;j++) {				//每次匹配从第一个男性开始追求，遍历一遍
				if(men[j].flag==true) {
					continue;
				}
				for(int m=0;m<sum;m++) {				//根据男性的选择遍历女性，选取合适的
					if(men[j].rank[i]==women[m].ID) {	//选取合适的女性
						if(women[m].flag==false) {		//女性空闲
							women[m].flag=true;
							women[m].currentObject=j+1;
							men[j].flag=true;
							System.out.println("男"+(j+1)+"和女"+(m+1)+"正在约会.");
						}
						else if(women[m].flag==true) {		//女性正在约会
							int currentLocal=0,manLocal = 0;			//查找现任对象和竞争对象是女性的第几人选
							for(int n=0;n<sum;n++) {
								if(women[m].rank[n]==women[m].currentObject) {
									currentLocal=n;
								}
								else if(women[m].rank[n]==(j+1)) {
									manLocal=n;
								}
							}
							if(manLocal>currentLocal) {
								System.out.println("男"+(j+1)+"追求女"+(m+1)+",女"+(m+1)+"正在和男"+women[m].currentObject+"约会，遂拒绝。");
							}
							else if(manLocal<currentLocal){
								men[currentLocal-1].flag=false;
								men[j].flag=true;
								System.out.println("虽然女"+(m+1)+"正在和男"+women[m].currentObject+"约会，但是男"+(j+1)+"在她心里更好，遂跟男"+(j+1)+"约会去了。");
								women[m].currentObject=j+1;
							}
						}
					}
				}
			}
		}
	}
}
