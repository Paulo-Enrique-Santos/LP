package sptech.school.projeto.consultoria;

public class App {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Paulo", 20, 30.0);
        DesenvolvedorMobile devMobile = new DesenvolvedorMobile(10, 15.0, "João", 20, 30.0);
        Desenvolvedor dev1 = new Desenvolvedor("Gustavo", 20, 30.0);
        Desenvolvedor dev2 = new Desenvolvedor("Marcos", 20, 30.0);
        
        Consultoria consultoria = new Consultoria("Tech Consult", 3);
        
        consultoria.contratar(dev);
        
        System.out.println("Total Devs: " + consultoria.getQuantidadeDevs());
        
        consultoria.contratar(devMobile);
        
        consultoria.contratar(dev1);
        
        consultoria.contratar(dev2);
        
        System.out.println("Total Devs: " + consultoria.getQuantidadeDevs());
        
        System.out.println("-".repeat(40));
        
        System.out.println("Retorna Dev com nome Paulo: \n" + consultoria.getDevPorNome("Paulo"));
        System.out.println("-".repeat(40));
        System.out.println("Retorna Dev com nome Marcos: \n" + consultoria.getDevPorNome("Marcos"));
        System.out.println("-".repeat(40));
        
        System.out.println("Exite Dev com nome Paulo ? " + consultoria.exitePorNome("Paulo"));
        System.out.println("-".repeat(40));
        System.out.println("Exite Dev com nome Carlos ? " + consultoria.exitePorNome("Carlos"));
        System.out.println("-".repeat(40));
        
        System.out.println("Total de Devs Mobile: " + consultoria.getQuantidadeDevsMobile());
        System.out.println("-".repeat(40));
        
        System.out.println("Salario do dev Paulo: " + dev.getSalario());
        System.out.println("-".repeat(40));
        System.out.println("Salario do dev João: " + devMobile.getSalario());
        System.out.println("-".repeat(40));
        
        System.out.println("Total Salarios Consultoria: " + consultoria.getTotalSalarios());
        System.out.println("-".repeat(40));
        
        System.out.println(dev.toString());
        System.out.println("-".repeat(40));
        System.out.println(devMobile.toString());
        System.out.println("-".repeat(40));
    }
}
