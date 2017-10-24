package thirdweek;
/*
 * 定义人的属性，方法
 */
public class Person {
	int ID;
	int[] rank;
	boolean flag=false;
	int currentObject;
	public void setRank(int[] rank) {
		this.rank=rank;
	}
	public int[] getRank() {
		return this.rank;
	}
/*	public void setID(int ID) {
		this.ID=ID;
	}
	public int getID() {
		return this.ID;
	}
	public void setFlag(boolean flag) {
		this.flag=flag;
	}
	public boolean getFlag() {
		return this.flag;
	}
	public void setCurrentObject(int currentObject) {
		this.currentObject=currentObject;
	}
	public int getCurrentObject() {
		return this.currentObject;
	}*/
}
class Men extends Person{
	
}
class Women extends Person{
	
}
