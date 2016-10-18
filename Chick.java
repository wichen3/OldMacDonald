class Chick implements Animal
{
	private String myType;
	private String mySound;
	private String mySound2;
	public Chick(String type, String sound, String sound2)
	{
		myType = type;
		mySound = sound;
		mySound2 = sound2;
	}
	public Chick()
	{
		myType = "Chick";
		mySound = "Cluck";
		mySound2 = "Cheep";
	}
	public String getSound()
	{
		int grown = (int)(Math.random() * 2);
		if(grown == 1)
		{
			return mySound;
		}
		else
		{
			return mySound2;
		}
	}     
    public String getType()
    {
    	return myType;
    }
}