public class Main {
    public static void main(String[] args) {
        UsuarioBiclioteca Aluno = new Aluno("Gabriel", 5);
        UsuarioBiclioteca Professor = new Professor("Ivens", 150);
        UsuarioBiclioteca Visitante = new Visitante("Sabrina", 20);


        System.out.println(Aluno.getResumo() + "A Multa é: R$ " + Aluno.CalcularMulta());
        System.out.println(Professor.getResumo() + "A Multa é: R$ " + Professor.CalcularMulta());
        System.out.println(Visitante.getResumo() + "A Multa é: R$ " + Visitante.CalcularMulta());




        IMensagem MensagemConsole = new MensagemConsole();
        MensagemConsole.EnviarMensagem("A Multa aplicado ao " + Aluno.getResumo() + "é : " + Aluno.CalcularMulta());



        IMensagem MensagemWhatsAppSimuado = new MensagemWhatsAppSimulado();
        MensagemWhatsAppSimuado.EnviarMensagem(" Prezado (a) " + Aluno + "Em nosso sistema, consta em aberto uma multa no valor de: R$ " + Aluno.CalcularMulta());
    }
}