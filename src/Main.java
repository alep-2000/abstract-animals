
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
		
		IVolante[] volanti = {p,a};
		INuotante[]nuotanti = {c, d};
		
		for(int i=0; i<volanti.length; i++) {
			IVolante volante = volanti[i];
			faiVolare(volante);
		}
		
		for(int i=0; i<nuotanti.length; i++) {
			INuotante nuotante = nuotanti[i];
			faiNuotare(nuotante);
		}
	
	}
	
	public static void faiVolare(IVolante volante) {
		volante.vola();
	}
	
	public static void faiNuotare(INuotante nuotante) {
		nuotante.nuota();
	}
}
