package JavaOOPS;
class Retail{  
  void eat()
  {
	  System.out.println("Food");
	  }  
}  
class Cloth extends Retail{  
  void wear1()
  {
	  System.out.println("Clothing and textiles");
	  }  
}  
class Foot extends Cloth{  
  void wear2()
  {
	  System.out.println("Footwear");
	  }  
}  
public class MultilevelInheritance_Java {  
public static void main(String args[]){  
      Foot d=new Foot();  
      System.out.println("List types of retail sector");
      d.wear1();  
      d.wear2();  
      d.eat();  
}
}  

