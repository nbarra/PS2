package pgkEmpty;

public class MyInteger {

	private int iValue;

	//this builds the constructor
	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}
	
	//this adds the getters
	public int getiValue() {
		return iValue;
	}
	
	//this adds the setters
	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	//this is the method for testing prime numbers
	public boolean isPrime(){
		for (int i = 2; i < getiValue();i++){
			if(getiValue() % i== 0)
				return false;
		}
		return true;
	}
	
	//this is the method for testing even numbers
	public boolean isEven(){
		if(iValue % 2 == 0){
		return true;
	}
	return false;
}

	//this is the method for testing the odd numbers
	public boolean isOdd(){
		if (iValue % 2 != 0){
			return true;
	}
	return false;
}
	
	
	//pass values to test the methods
	public boolean isPrime(int p){
		for (int i = 2; i < p; i++){
			if (p % i == 0)
				return false;
		}
		return true;
	}
	
	
	//pass value to test the isOdd() method
	public boolean isOdd(int o){
		if (o % 2 != 0){
		return true;
	}
	return false;
	}

	//pass value to test the method isEven()
	public boolean isEven(int e){
		if (e % 2 == 0){
		return true;
	}
	return false;
}
	
	
	public boolean isEven(MyInteger x){
		if (x.isEven()){
			return true;
		}
		return false;
	}
	
	public boolean isOdd(MyInteger y){
		if (y.isOdd()){
			return true;
		}
		return false;
	}
	
	public boolean isPrime(MyInteger z){
		if (z.isPrime()){
			return true;
		}
		return false;
	}


	public boolean equals(int a){
		if (a == iValue){
			return true;
		}
		return false;
	}

	public boolean equals (MyInteger num){
		return(num.getiValue() == iValue);
			
		}
	
	
	
}
