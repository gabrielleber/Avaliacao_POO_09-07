public class MensagemWhatsAppSimulado implements IMensagem {



    @Override
    public void EnviarMensagem (String mensagem) {
        System.out.println("WhatsApp Simulado" + mensagem);
    }
}
