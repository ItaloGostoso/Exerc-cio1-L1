package q5;

public class Notas {

    public static void main(String[] args) {
        
        Aluno Sofredor = new Aluno("Italo", "2819.100.22.00.24");
        Sofredor.notas[1] = 1.5;
        Sofredor.notas[2] = 10;
        Sofredor.notas[3] = 6.5;
        
        double media = Sofredor.calculaMedia();
        System.out.println(Sofredor.nome + "Media da Unidade: "+ media);
        Sofredor.notas[1] = 5;
        Sofredor.notas[2] = 2;
        Sofredor.notas[3] = 7.0;
        
        media = Sofredor.calcularMedia();
        System.out.println(Sofredor.nome + "Nova media: "+ media);
    }
    
}
