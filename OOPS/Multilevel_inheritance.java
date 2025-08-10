package OOPS;

	class Animal1// parent
	{
		void eat(String eats)
		{
			System.out.println("Eats="+eats);
		}
		void sound(String sd)
		{
			System.out.println("Sound="+sd);
		}
	}
	class Dog extends Animal1//child
	{
		void lives(String lives)
		{
			System.out.println("Lives in the "+lives);
		}
	}
	class Puppy extends Dog//subchild
	{
		void breed(String bd)
		{
			System.out.println("Breed of Dog is "+bd);
		}
	}
	 
	public class Multilevel_inheritance {
	 
		public static void main(String[] args) {
			Puppy max=new Puppy();
			max.eat("Royal canin");
			max.sound("barking");
			max.lives("city");
			max.breed("Lab");
	 
		}
	 
	}

