package fr.univamu.iut.exo1;
//public class NoeudInterne extends Expression
public class NoeudInterne implements Expression
{
	private Expression premierOperande;
	private Expression deuxiemeOperande;
	
	private char operateurBinaire;
	
	public NoeudInterne(Expression 1stO, Expression 2ndO, char c)
	{
		premierOperande = 1stO;
		deuxiemeOperande = 2ndO;
		contenu = c;
	}
	
	public double evaluer()
	{
		
	}
}
