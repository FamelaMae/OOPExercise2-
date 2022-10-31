public abstract class Fruit{
	protected String Color;
	protected int Quantity;
	
	public Fruit (String color, int quantity){
		Color = color;
		Quantity = quantity;
	}
	public abstract String Quality();
	
	public String getColor(){
		return Color;
	}
	public void setColor(String color){
		Color = color;
	}
	public int getQuantity(){
		return Quantity;
	}
	public void setQuantity(int Quantity){
		this.Quantity = Quantity;
	}
}
