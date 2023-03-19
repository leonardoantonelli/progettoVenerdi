package progettoVener;

public class immagine extends ElementoMultimediale {

	 int luminosita;
	 
	 
	 
	 //invoco immagine
	 
	 public immagine (String titolo, int luminosità) {
		//super sostituisce this. perchè lo prende dalla super classe elemento multimediale 
	        super(titolo);
	        this.luminosita=luminosità;
	 }
	 
	 
	 void alzaLuminosita(int n){ 
	     this.luminosita = this.luminosita + n; 
	 }
	
	 void abbassaLuminosità(int n){
	     this.luminosita = this.luminosita - n; 
	 }
	 
	 void show() {
		//in console appare il titolo 
		 System.out.println("titolo Immagine: "+ this.getTitolo());
		 //fare ciclo per le gli asterischi in base al numero int di lumin. 
		 
		 System.out.print("luminosità: ");
		 
		 for (int i= 0; i< luminosita;i++) {
			 System.out.print("*");
		 }
		 System.out.println(" ");
	 }
	 
	 
	 public void play(){
	     System.out.println("questa Immagine non è riproducibile");
	 }
}
