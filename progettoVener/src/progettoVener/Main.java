package progettoVener;

import java.util.Scanner;

public class Main {
	//creo array di elementimultmediali con 5
 
	static Scanner scanner= new Scanner(System.in);
 static ElementoMultimediale[] elementimultimediali = new ElementoMultimediale[2];	
 
  public static void main (String [] args) {
	
	creaElemento();
	play();

}
	
private static void creaElemento() {
		
	// Creazione degli elementi multimediale letti da tastiera da console
	for (int i=0; i<elementimultimediali.length;i++) {
		System.out.println("Scrivi 1 per Immagine, 2 per Video, 3 per Registrazione Audio): ");
	
	 int scelta = scanner.nextInt();
	scanner.nextLine();
            
            switch (scelta) {
            //caso1 immagine
            case 1:
            	System.out.println("inserisci titolo Immagine");
            	String titoloelemento = scanner.nextLine();
            	System.out.println("inserisci luminosita Immagine");
            	int luminosita= scanner.nextInt();
            	 scanner.nextLine();
            //ora che ho tutti i dati mi creo elemento 
            	elementimultimediali[i]= new immagine(titoloelemento, luminosita);
            	
            	break;
           	
           
            	//creo video
            case 2:
                System.out.println("Inserisci il titolo video:");
                String titolovideo = scanner.nextLine();
               System.out.println("Inserisci la luminosità:");
                int luminositavideo = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Inserisci il volume:");
                int volumevideo = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Inserisci la durata:");
                int duratavideo = scanner.nextInt();
                scanner.nextLine();
                            
                elementimultimediali[i] = new video(titolovideo,luminositavideo, duratavideo, volumevideo);
                break;
            	   //creo audio   
            case 3:
            	System.out.println("inserisci titolo audio");
            	String titoloAudio = scanner.nextLine();
            	
            	System.out.println("Inserisci la durata:");
            	int durataAudio=scanner.nextInt();
            	scanner.nextLine();
            	System.out.println("volume dell'audio");
            	int volumeAudio = scanner.nextInt();
            	scanner.nextLine();
            
            //ora che ho tutti i dati mi creo elemento 
            	elementimultimediali[i]= new audio(titoloAudio, volumeAudio,durataAudio);
            	break;
            	   
            default:
                i--;
                System.out.println("Scelta inesistente riprova");
                break;
          
	}
	}
}

public static void play() {
    
    System.out.println("se vuoi sapere quali sono i file che hai salvato premi 1\nse vuoi fare play premi 2");
    int e = scanner.nextInt();
    scanner.nextLine();
    switch (e) {
        case 1:
            for (int i = 0; i < elementimultimediali.length; i++) {
                System.out.println(elementimultimediali[i].getTitolo());
            }
            break;
        
        case 2:
        	for (int i = 0; i < elementimultimediali.length; i++) {
                System.out.println(elementimultimediali[i]);
            break;
    }
}
        
}
	
	
        







