package q5;

public class Aluno {
    String nome;
    String cpf;
    double notas[] = new double[3];
    
    public Aluno(String nome, String cpf){
        this.nome = nome;
        this.cpf = CPF;
        this.notas[1] = 4;
        this.notas[2] = 9;
        this.notas[3] = 10;
        
        
    }
    public double calcularMedia(){
        double media = (this.notas[1] + this.notas[2] + this.notas[3])/3;
        return media;
    }
}
