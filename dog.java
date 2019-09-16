import java.util.*;
class Dog extends Animal{
	
	Dog(String name , int legs){
		super(name, legs);
	}
	
	@Override
	public String toString(){
		return this.getName() + " " + this.getLegs();
	}
}
