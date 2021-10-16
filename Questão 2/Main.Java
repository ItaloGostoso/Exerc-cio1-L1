package q2;

public class Main {
  public static void main (String [] args) {
    Endereco casa = new Endereco ("Casa dos sofredores", "23", "Casa", "Jegue morto", "BA", "72378-900")
    Medico valder = new Medico ("1", "Valder", "Masculino", "Angiologista", casa);
    
    show_Medico(Valder);
    show_Endereco(casa);
    
    casa.rua = "Casa de Jurema";
    casa.numero = "69";
    casa.complemento= "Atras da casa de Judas";
    casa.bairro = "S.O.D.E.N";
    casa.cidade = "Pindamonhagaba";
    casa.uf = "Bahia";
    casa.CEP = "43536-000";
    
    Medico.cod = "12358443567";
    Medico.nome = "João Do Diabo";
    Medico.sx = "Masc";
    Medico.Esp = "Nenhuma";
    Medico.End = casa;
    
    show_Medico(Valder);
    show_Endereco(casa);
  }
  
  public static void show_Endereco(Endereco End1);
  System.out.println("---Endereço---");
  System.out.println("Rua: " + End1.rua);
  System.out.println("Numero" + End1.numero);
  System.out.println("Complemento: " +  End1.complemento); 
  System.out.println("Bairro" + End1.bairro);
  System.out.println("Cidade" + End1.cidade);
  System.out.println("UF: " + End1.uf);
  System.out.println("CEP: " +  End1.CEP):
  
 public static void show_medico(Medico M1)
        System.out.println("Medico: " + M1.cod);
        System.out.println("Nome: " + M1.nome);
        System.out.println("Sexo: " + M1.sx);
        System.out.println("Especialidade: " + M1.esp);
        System.out.println("endereço: " + M1.End);
    }
    
}
