package RevisãoPOO;

public class professor {

    private String nomeCompleto;
    private int idade;
    private String CPF;
    private String CEP;
    private double salario;
    private String discilpina;


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDiscilpina() {
        return discilpina;
    }

    public void setDiscilpina(String discilpina) {
        this.discilpina = discilpina;
    }
}
