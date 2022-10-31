class Apple extends Fruit{
	private String Kinds;
	
	
	public Apple (String Color, int Quantity, String kinds){
		super(Color, Quantity);
		this.Kinds = kinds;
	}

	@Override
	public String Quality()
	{
		return "Fresh";
	}
	public String getKinds(){
		return Kinds;
	}
	public void setKinds(String Kinds){
		this.Kinds = Kinds;
	}
}
