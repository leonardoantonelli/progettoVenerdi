package progettoVener;

public class audio extends ElementoMultimediale{
	int volume;
	int durata;
	
	 public audio (String titolo, int volume, int durata) {
			//super sostituisce this. perchè lo prende dalla super classe elemento multimediale 
		        super(titolo);
		        this.durata=durata;
		        this.volume=volume;
		 }

	 void alzavolume(int n) {
		 this.volume = this.volume + n;
	 }
	 
	 void abbassavolume(int n) {
		 this.volume = this.volume - n;
	 }
	 
	 void show() {
		 //in console appare il titolo 
		 System.out.println("titolo video: "+ this.getTitolo());
		 //in console visualizzo il volume
		 System.out.println("volume dell'audio: ");
		 for (int i=0;i<volume;i++) {
			 System.out.println("!");
			 
		 }
	 }
	 
	 
	 void play() {
		 
		 System.out.println("inizio video: " + this.getTitolo());
		 
		 for(int i = 0; i < this.durata; i++){
	            System.out.print("!");

	       }
	 }

}
