public class MensagemConsole implements IMensagem{

    @Override
    public void EnviarMensagem (String mensagem) {
        System.out.println("Mensagem no console: " + mensagem);
    }
}
