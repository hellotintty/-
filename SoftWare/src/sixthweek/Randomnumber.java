package sixthweek;
/*
 * 生成随机数
 */
import java.util.Random;

public class Randomnumber {
	int num;
	int[] number=new int[9];
	int[] MGnumber=new int[6];
	Random random=new Random();
	Randomnumber(int num){
		this.num=num;
	}
	public void generateNum() {
		int temp=0;
		for (int i = 0; i < 8; i++) {
			temp=random.nextInt(num);
			num=num-temp;
			number[i]=temp;
		}
		number[8]=num;
		MGnumber[0]=number[0]+number[1]+number[2];
		MGnumber[1]=number[3]+number[4]+number[5];
		MGnumber[2]=number[6]+number[7]+number[8];
		MGnumber[3]=number[0]+number[3]+number[6];
		MGnumber[4]=number[1]+number[4]+number[7];
		MGnumber[5]=number[2]+number[5]+number[8];
	}
}
