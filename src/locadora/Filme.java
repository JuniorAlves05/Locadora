package locadora;

public class Filme {

    String nome;
    String descricao;
    int idademin;

    public Filme(String nome, String descricao,  int idade) {
        this.nome = nome;
        this.descricao = descricao;
        this.idademin = idade;
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

    @Override
    public String toString() {
        return "            Catalogo : " +
                " \n Nome= " + nome +
                " \n Descricao  = " + descricao  +
                " \n Idademin   = " + idademin ;
    }
}
