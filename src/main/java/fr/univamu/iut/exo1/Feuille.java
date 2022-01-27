package fr.univamu.iut.exo1;

//public class Feuille extends Expression
public class Feuille implements Expression
{
	private double contenu;
	
	public Feuille(double c)
	{
		contenu = c;
	}
	
	public double evaluer()
	{
		return contenu;
	}
}
