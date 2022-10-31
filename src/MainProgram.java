
import org.apache.http.util.*;public class MainProgram
{
	public static void main(String[] Args){
		Fruit Juice;
		Apple apple = new Apple ("Red", 3, "Fresh");
		Pineapple Pineapple = new Pineapple ("Yellowgreen", 5, "Not Fresh");
		
		Juice = apple;
		System.out.println(Juice.getColor() + " is the color of the fruit" + "and its" + Juice.Quality());
		
		Juice = Pineapple;
		System.out.println(Juice.getColor() + " is also the color of the fruit" + "and its" + Juice.Quality());
	}
}
