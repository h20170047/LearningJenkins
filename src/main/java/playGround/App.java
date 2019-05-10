package playGround;
public class  App {
	public static void main(String[] args) {
		System.out.println("Hello world");
	}
	class A{
		private String TEST= "";
		A(){
			
		}
		
		public void dummy(int number) {
			number=10;
			if(number==0) {
				System.out.println("Number is zero");
			}
		}
	}
	public void show() {
		System.out.println("Hey from show()");
	}
}
