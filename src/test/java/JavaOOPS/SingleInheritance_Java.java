package JavaOOPS;
class abc{  
  void v1()
  {
	  System.out.println("Hello world");
	  }  
}  
class def extends abc{  
  void v2()
  {
	  System.out.println("Welcome to java programming");
	  }  
}  
public class SingleInheritance_Java {
 
public static void main(String args[]){  
             def d=new def();  
             d.v1();  
             d.v2();  

	
	}

}
