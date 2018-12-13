public class ScentedCandle extends Candle{
	private static String scent = "placeholder";
	
	
	ScentedCandle(String s, String c, int h){
		setScent(s);
		setColor(c);
		setHeight(h);
	}
		
	public void setScent(String s){
		scent = s;
	}
	public static String getScent(){
		return scent;
	}
	@Override
	public void setHeight(int h){
		height = h;
		price = (h*3);
	}
}