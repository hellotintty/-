	package firstweek;

import java.util.Random;

public class Generate extends array{
	Random random = new Random();
	Generate(int i){
		if(i==1) {
			super.everyNum=NoramlDistribution();
		}
		if(i==2) {
			super.everyNum=AverageDistributon();
		}
	}
	Generate(array[] array,int i){
		super.everyNum=array[i].everyNum;
	}
	double NoramlDistribution() {
		double Ave1 = 0.5;
		double Var1 = 1;
		double s=0;
		while(s<=0||s>=1) {
			s = Math.sqrt(Var1) * random.nextGaussian() + Ave1;
			}
			return s;
		}
	double AverageDistributon() {
			return random.nextDouble();
		}
	}	