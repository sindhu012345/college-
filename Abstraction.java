abstract class Animal{
   public abstract void eat();
}

class dog extends Animal{
   public void eat(){
      System.out.println("The dog is eating");
   }
}

class Abstraction{
    public static void main(String [] args){
	dog d=new dog();
	d.eat();
	}
}