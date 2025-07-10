public class Visitante extends UsuarioBiclioteca {
    public Visitante(String nome, int DiasEmAtraso) {
        super(nome, DiasEmAtraso);
    }

    @Override
    public double CalcularMulta(){
        return DiasEmAtraso * 1.00;

    }
}
