public class Aluno extends UsuarioBiclioteca {
    public Aluno(String nome, int DiasEmAtaso) {
        super(nome, DiasEmAtaso);

    }

    @Override
    public double CalcularMulta() {
        return DiasEmAtraso * 0.50;



    }
}
