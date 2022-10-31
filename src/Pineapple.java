class Pineapple extends Fruit{
	
	private String Type;
	
	public Pineapple(String Color, int Quantity, String Type){
		super(Color, Quantity);
		this.Type = Type;
	}

	@Override
	public String Quality()
	{
		return "Not Fresh";
	}
	public String getType(){
		return Type;
	}
	public void setType(String Type){
		this.Type = Type;
	}
}
