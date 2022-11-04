package sptech.school.projeto.consultoria;

public class Desenvolvedor {
    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Desenvolvedor(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Double getSalario() {
        return this.valorHoraTrabalhada * this.qtdHorasTrabalhadas;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Nome do Dev: %s\n"
            +   "Horas Trabalhadas Como Dev: %d \n"
            +   "Valor por Hora: R$ %.2f \n"
            +   "Valor Total Salário: R$ %.2f",
                
        nome, qtdHorasTrabalhadas, valorHoraTrabalhada, getSalario());
    }
}
