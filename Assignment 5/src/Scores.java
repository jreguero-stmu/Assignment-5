
public class Scores {
	
	int arry[];
	
	public Scores(int arry[]){
		this.setArry(arry);
	}
	
	
	public int[] getArry() {
		return arry;
	}
	public void setArry(int[] arry) {
		this.arry = arry;
	}
	
	public int getAverage(){
		int sum = 0;
		int x = 1;
		for(int i = 0; i < arry.length; i++){
			if(arry[i] < 0 || arry[i] > 100){
				x = i + 1;
				throw new IllegalArgumentException("Array item number " + x + " is out of range (must be" + 
				"between 0 and 100)");
			}
			else{
				sum = sum + arry[i];
			}
		}
		
		return sum / arry.length;
	}

}
