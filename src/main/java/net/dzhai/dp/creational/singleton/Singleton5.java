package net.dzhai.dp.creational.singleton;;

//枚举
public enum Singleton5 {

	INSTANCE{
		public String someMethod(){
			return "123";
		}	
	};	
	protected abstract String someMethod();
	
	public static void main(String[] args) {
		System.out.println(Singleton5.INSTANCE.someMethod());
	}
}
