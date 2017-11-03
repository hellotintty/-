package fifthweek;

public class Result implements Comparable{
	String order;
	int cost;
	int time;
	public Result(String order,int cost,int time) {
		this.order=order;
		this.cost=cost;
		this.time=time;
	}
	@Override
	public int compareTo(Object o) {
        Result s = (Result) o;  
        if (this.cost > s.cost) {  
            return 1;  
        }  
        else if (this.cost < s.cost) {  
            return -1;  
        }  
        else {  
            if (this.time >= s.time) {  
                return 1;  
            }  
            else {  
                return -1;  
            }  
        } 
	}
	
}
