package progettoVener;

public class video extends ElementoMultimediale{
	int volume;
	int luminosita;
	int durata;
	
	public video (String titolo, int luminosita, int volume, int durata) {
		//super sostituisce this. perchè lo prende dalla super classe elemento multimediale 
	        super(titolo);
	        this.volume=volume;
	        this.luminosita=luminosita;
	        this.durata=durata;}
	

	 void alzaLuminosita(int n){
	     this.luminosita = this.luminosita + n; 
	 }
	 void abbassaLuminosita(int n){
	     this.luminosita = this.luminosita - n; 
	 }
	 

	 void alzavolume(int n){
	     this.volume = this.volume + n; 
	 }
	

	 void abbassvolume(int n){
	     this.volume = this.volume - n; 
	 }
	 
	 
	 void show() {
			//in console appare il titolo 
			 System.out.println("titolo video: "+ this.getTitolo());
			 //fare ciclo per le gli asterischi in base al numero int di lumin. 
			 
			 System.out.print("luminosità: ");
			 
			 for (int i= 0; i< luminosita;i++) {
				 System.out.print("*");
			 }
			 System.out.print("volume: ");
			 
			 for (int i= 0; i< volume;i++) {
				 System.out.print("0");
			 }
			 
			 System.out.println(" ");
		 }
		 
	
	 public void play(){
	        System.out.println("inizio video: " + this.getTitolo());

	       for(int i = 0; i < this.durata; i++){
	            System.out.print("!");

	       }
	 }
}
