package iniciandopoo.encapsulamento;

public class Estudante {
//    String nome;

    String primeiroNome;

    String ultimoNome;

    String telefone;

    String getNome() {
        return primeiroNome + " " + ultimoNome;
    }

    void setNome(String nome) {
        String[] nomeCompleto = nome.split(" ");
        primeiroNome = nomeCompleto[0];
        ultimoNome = nomeCompleto[1];
    }

    String getTelefone() {
        return telefone;
    }

    void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
}
