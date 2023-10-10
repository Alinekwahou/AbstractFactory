package module;

public class Client {

	public static void main(String[] args) {
		
			IProduitFactory produitfactory1 = new Produitfactory1();
			IProduitFactory produitfactory2 = new Produitfactory2();
			IProduitFactory produitfactory3 = new Produitfactory3();
			
			ProduitA produitA = null;
			ProduitB produitB = null;
			ProduitC produitC = null;
			
			System.out.println("Utilisation de la premiere fabrique");
			produitA = produitfactory1.getProduitA();
			produitB = produitfactory1.getProduitB();
			produitC = produitfactory1.getProduitC();
			
			produitA.methodeA();
			produitB.methodeB();
			produitC.methodeC();
			
		
	
		
			System.out.println("Utilisation de la deuxieme fabrique");
			produitA = produitfactory2.getProduitA();
			produitB = produitfactory2.getProduitB();
			produitC = produitfactory2.getProduitC();
			
			produitA.methodeA();
			produitB.methodeB();
			produitC.methodeC();

	       
	   	   System.out.println("Utilisation de la troisieme fabrique");
	        produitA = produitfactory3.getProduitA();
	        produitB = produitfactory3.getProduitB();
	        produitC = produitfactory3.getProduitC();
	        
	        produitA.methodeA();
			produitB.methodeB();
			produitC.methodeC();

}

}
