package q3;


public class Lutador {

    public static void main(String[] args) {
      
        Lutador Ryu = new Lutador("Ryu", "100", "10");
        Lutador Bison = new Lutador("Bison", "100", "12");
        
        int cont = 0;
        while (cont<3){
            System.out.println("Ryu Soco basico");
            ryu.aplicarGolpe(bison);
            cont++;
        }
        System.out.println("Energia de Bison: " + bison.ene+");
        while (cont < 11){
            System.out.println("Bison usou Psycho Blast");
            bison.aplicarGolpe(ryu);
            cont++;
        }
          System.out.println("Energia de Ryu: " + ryu.ene");
    }
    
}
