package thirdweek;
/*
 * �������࣬��������
 */
import java.util.Arrays;
/*
 * ����ƥ������
 */
import java.util.Scanner;;
public class Main {
	public static void main(String[] arge) {
		Scanner in=new Scanner(System.in);
		System.out.print("������Ҫ����ٶ�:");
		int sum=in.nextInt();
		Men[] men=new Men[sum];
		Women[] women=new Women[sum];
		//����ÿλ��ʿ��ѡ��
		for(int i=0;i<sum;i++) {
			int[] a=new int[sum];
			for(int j=0;j<sum;j++) {
				System.out.print("�������"+(i+1)+"λ��ʿ�ĵ�"+(j+1)+"��ѡ��");
				a[j]=in.nextInt();
			}
			men[i]=new Men();
			men[i].setRank(a);
			men[i].ID=i+1;
			System.out.println(Arrays.toString(men[i].rank));
		}
		//����ÿλŮʿ��ѡ��
		for(int i=0;i<sum;i++) {
			int[] a=new int[sum];
			for(int j=0;j<sum;j++) {
				System.out.print("�������"+(i+1)+"λŮʿ�ĵ�"+(j+1)+"��ѡ��");
				a[j]=in.nextInt();
			}
			women[i]=new Women();
			women[i].setRank(a);
			women[i].ID=i+1;
			System.out.println(Arrays.toString(women[i].rank));
		}
		for(int i=0;i<sum;i++) {                 //ƥ�����
			System.out.println("��"+(i+1)+"��ƥ�䣺");
			for(int j=0;j<sum;j++) {				//ÿ��ƥ��ӵ�һ�����Կ�ʼ׷�󣬱���һ��
				if(men[j].flag==true) {
					continue;
				}
				for(int m=0;m<sum;m++) {				//�������Ե�ѡ�����Ů�ԣ�ѡȡ���ʵ�
					if(men[j].rank[i]==women[m].ID) {	//ѡȡ���ʵ�Ů��
						if(women[m].flag==false) {		//Ů�Կ���
							women[m].flag=true;
							women[m].currentObject=j+1;
							men[j].flag=true;
							System.out.println("��"+(j+1)+"��Ů"+(m+1)+"����Լ��.");
						}
						else if(women[m].flag==true) {		//Ů������Լ��
							int currentLocal=0,manLocal = 0;			//�������ζ���;���������Ů�Եĵڼ���ѡ
							for(int n=0;n<sum;n++) {
								if(women[m].rank[n]==women[m].currentObject) {
									currentLocal=n;
								}
								else if(women[m].rank[n]==(j+1)) {
									manLocal=n;
								}
							}
							if(manLocal>currentLocal) {
								System.out.println("��"+(j+1)+"׷��Ů"+(m+1)+",Ů"+(m+1)+"���ں���"+women[m].currentObject+"Լ�ᣬ��ܾ���");
							}
							else if(manLocal<currentLocal){
								men[currentLocal-1].flag=false;
								men[j].flag=true;
								System.out.println("��ȻŮ"+(m+1)+"���ں���"+women[m].currentObject+"Լ�ᣬ������"+(j+1)+"����������ã������"+(j+1)+"Լ��ȥ�ˡ�");
								women[m].currentObject=j+1;
							}
						}
					}
				}
			}
		}
	}
}
