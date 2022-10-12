package JavaOOPS;

	interface language1{
		void m1();
	}

	interface language2{
		void m2();
		}

	public class MultipleInheritance_Java  implements language1,language2{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MultipleInheritance_Java obj=new MultipleInheritance_Java();
			obj.m1();
			obj.m2();
		}
		public void m1()
		{
			System.out.println("Java");
		}
		public void m2()
		{
			System.out.println("Python");
		}

}
