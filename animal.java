import java.util.*;
class Animal implements Comparable<Animal>{
	 String name;
	 int legs;
	 
	 Animal(String name, int legs){
		 this.name = name;
		 this.legs = legs;
	 }
	 
	 public String getName(){
		 return name;
	 }
	 
	 public int getLegs(){
		 return legs;
	 }
	@Override
         public int compareTo(Animal a){
                 return this.getLegs()-a.getLegs();
	}
}
