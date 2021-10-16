package q4;

public class Post {
   String texto;
   String link;
   int numeroCurtidas;
   int numeroCompartilhamentos;
   
   public Post(String text, String link){
       this.texto = ext;
       this.link = lk;  
   }
   public void curta() {
       this.numeroCurtidas += 1; 
   }
   public void compartilhe(){
       this.numeroCompartilhamentos += 1;
   }
}
