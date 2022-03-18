package ma.education.tp1.introduction;

public class AccesSamePackage {
	
	public static void main (String[] args) {
		ma.education.tp1.introduction.Salle s1;
		s1 = new ma.education.tp1.introduction.Salle("Salle A");
		System.out.println(s1.id );
		System.out.println(s1.nom );

	}

}
