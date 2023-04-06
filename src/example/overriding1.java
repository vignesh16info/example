package example;

class sruthi
{
public void displayInfo() {
    System.out.println("My Name is sruthi");
 }
}
class vinoth extends sruthi
{
	public void displayInfo1() {
	      System.out.println("My Name is vinoth");
	   }
	}
class vignesh extends vinoth
{
	public void displayInfo2() {
	      System.out.println("My Name is vignesh");
	   }
	}
 class dinesh extends vignesh
 {
	 public void displayInfo3() {
		 System.out.println("My Name is dinesh");
		 
	 }
 }

 class karunya extends dinesh
 {
	 public void displayInfo4 () {
		 System.out.println("My Name is karunya");
		 
	 }
 }

public class overriding1 {
public static void main(String[] args) {
	
	//step1 d1 = new step1();
    karunya e1 = new karunya();
  // step3 f1 = new step3();
    e1.displayInfo();
    e1.displayInfo1();
    e1.displayInfo2();
    e1.displayInfo3();
    e1.displayInfo4();
    
}
}

