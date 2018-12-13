public class Candle{
	
	static String color = "placeholder";
	static int height = 0;
	static double price = 0;
	Candle(){
		
	}
	Candle(String c, int h){
		setColor(c);
		setHeight(h);
	}
	public void setColor(String c){
		color = c;
	}
	public void setHeight(int h){
		height = h;
		price = (h*2);
	}
	public static double getPrice(){
		return price;
	}
	public static String getColor(){
		return color;
	}
	public static int getHeight(){
		return height;
	}
}