package base;

public class MyInteger {
	private int iValue;
	MyInteger(int iValue){
		this.iValue = iValue;
	}
	
	public int getiValue(){
		return this.iValue;
	}
	
	public boolean isEven(){
		if (this.iValue % 2 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isOdd(){
		if (this.iValue % 2 != 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isPrime(){ 
		for (int i = 2; i < this.iValue; i++){
			if (this.iValue % i == 0){
				return false;
			}
		}	
		return true;
	}
	
	public static boolean isEven(int i){
		if (i % 2 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isOdd(int i){
		if (i % 2 != 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(int x){ 
		for (int i = 2; i < x; i++){
			if (x % i == 0){
				return false;
			}
		}	
		return true;
	}
	
	public static boolean isEven(MyInteger myInteger){
		if (myInteger.getiValue() % 2 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger myInteger){
		if (myInteger.getiValue() % 2 != 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger myInteger){ 
		for (int i = 2; i < myInteger.getiValue(); i++){
			if (myInteger.getiValue() % i == 0){
				return false;
			}
		}	
		return true;
	}
	
	public boolean equals(int x){
		if (this.iValue == x){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean equals(MyInteger myInteger){
		if (this.iValue == myInteger.getiValue()){
			return true;
		}
		else {
			return false;
		}
	}
	//Commit changes ......
}
	
