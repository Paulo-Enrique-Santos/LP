package sptech.school.projeto.consultoria;

public class DesenvolvedorMobile extends Desenvolvedor{
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHorasTrabalhasMobile;

    public DesenvolvedorMobile(Integer qtdHorasTrabalhadasMobile, Double valorHorasTrabalhasMobile, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHorasTrabalhasMobile = valorHorasTrabalhasMobile;
    }
    
    @Override
    public Double getSalario(){
        return super.getSalario() + (qtdHorasTrabalhadasMobile * valorHorasTrabalhasMobile);
    }
    
    @Override
    public String toString() {
        return String.format(
                "Nome do Dev: %s\n"
            +   "Horas Trabalhadas Como Dev: %d \n"
            +   "Valor por Hora: R$ %.2f \n"
            +   "Horas Trabalhadas como Dev Mobile: %d \n"
            +   "Valor por Hora Mobile: R$ %.2f\n"
            +   "Valor Total Salário: R$ %.2f",
                
        nome, qtdHorasTrabalhadas, valorHoraTrabalhada, qtdHorasTrabalhadasMobile, valorHorasTrabalhasMobile, getSalario());
    }

}
