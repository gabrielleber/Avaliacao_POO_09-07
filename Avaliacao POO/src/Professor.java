public class Professor  extends  UsuarioBiclioteca{
    public Professor(String nome, int DiasEmAtraso) {
        super(nome, DiasEmAtraso);


    }

    @Override

    public double CalcularMulta() {
        return DiasEmAtraso * 0.25;


    }
}
