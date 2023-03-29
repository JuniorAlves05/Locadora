package locadora;

public class Filme {

    String nome;
    String descricao;
    int idademin,cod,a,b,c,d;

    double valordia;

    public Filme(int cod, String nome, String descricao,  int idade, double valordia) {
        this.cod = cod;
        this.nome = nome;
        this.descricao = descricao;
        this.idademin  = idade;
        this.valordia  = valordia;

    }
    public void pedido (){

    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod= cod ;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdade() {
        return idademin;
    }

    public void setIdade(int idade) {
        this.idademin = idade;
    }

    public double getValordia() {
        return valordia;
    }

    public void setValordia(double valordia) {
        this.valordia = valordia;
    }

    @Override
    public String toString() {
        return "              " +
                " \n Cod = " + cod  +
                " \n Nome= " + nome +
                " \n Descricao  = " + descricao  +
                " \n Idademin   = " + idademin +
                " \n Valor Dia  = " + valordia;


    }
}
