class Chick implements Animal
{
	private String myType;
	private String mySound;
	public Chick(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}
	public Chick()
	{
		myType = "Chick";
		mySound = "Cluck";
	}
	public String getSound(){return mySound;}     
    public String getType(){return myType;}
}