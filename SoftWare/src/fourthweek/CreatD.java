package fourthweek;
/*
 * ������ϵ������
 */

import java.util.Scanner;

public class CreatD {
	public int[][] importD() {
		int[][] D=new int[4][4];
		Scanner in=new Scanner(System.in);
		System.out.print("������A��B������ȣ�");
		D[1][0]=D[0][1]=in.nextInt();
		System.out.print("������A��C������ȣ�");
		D[0][2]=D[2][0]=in.nextInt();
		System.out.print("������A��D������ȣ�");
		D[0][3]=D[3][0]=in.nextInt();
		System.out.print("������B��C������ȣ�");
		D[1][2]=D[2][1]=in.nextInt();
		System.out.print("������B��D������ȣ�");
		D[1][3]=D[3][1]=in.nextInt();
		System.out.print("������C��D������ȣ�");
		D[2][3]=D[3][2]=in.nextInt();
		D[0][0]=D[1][1]=D[2][2]=D[3][3]=0;
		return D;
	}
}
