package stage1;

public class Utilisateur {

	public static void main(String[] args)
	{
		ExpertEnvironment exn = new ExpertEnvironment();
		String s1 = "lire le 1er mot sur la page1";
		String s2 = "lire le 1er mot sur la page2";
		String s3 = "lire le 1er mot sur la page3";
		exn.definirTache(s1); exn.definirTache(s2); exn.definirTache(s3);
		exn.validerTache(s1); exn.validerTache(s2);
		VueExpertEnvironment vexn = new VueExpertEnvironment(exn);
		vexn.affiche();
		
		System.out.println("");
		
		String s4 = "lire le 1er mot sur la page4";
		String s5 = "lire le 1er mot sur la page5";
		exn.definirTache(s4);
		exn.definirTache(s5);
		exn.validerTache(s5);
		VueExpertEnvironment vexn2 = new VueExpertEnvironment(exn);
		vexn2.affiche();
	}
}
