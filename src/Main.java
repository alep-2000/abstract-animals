
public class Main {
	public static void main(String[] args) {
		
		Cane c = new Cane();
		Passerotto p = new Passerotto();
		Acquila a = new Acquila();
		Delfino d = new Delfino();
		
		Animale[] animali = {c, p, a, d};
		
		for(int i=0; i<animali.length; i++) {
			Animale x = animali[i];
			
			x.dormi();
			x.mangia();
			x.verso();
			
			System.out.println("----------------------------------");
		}
	}
}
