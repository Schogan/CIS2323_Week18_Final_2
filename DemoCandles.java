import java.util.Scanner;
public class DemoCandles{
	public static void main(String[] args){
				
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("What color is the candle?: ");
		String color = inputDevice.nextLine();
		System.out.println("What is the height in inches of the candle?: ");
		int height = inputDevice.nextInt();
		System.out.println("Is the candle Scented?: ");
		char choice = inputDevice.next().charAt(0);
		inputDevice.nextLine();
		if(choice=='y'||choice=='Y'){
		System.out.println("What is the candles scent?: ");
		String scent = inputDevice.nextLine();
		ScentedCandle newSCandle = new ScentedCandle(scent,color,height);
		
		System.out.println("Your candle is "+Candle.getColor()+" is "+Candle.getHeight()+" inches tall and costs $"+Candle.getPrice()+" and smells like "+ScentedCandle.getScent());//Candle.
		
		}else{
			Candle newCandle = new Candle(color,height);
			System.out.println("Your candle is "+Candle.getColor()+" is "+Candle.getHeight()+" inches tall and costs $"+Candle.getPrice());//Candle.
		}
		
	}
}