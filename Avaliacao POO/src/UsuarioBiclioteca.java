public abstract class UsuarioBiclioteca {
    protected String nome;
    protected int DiasEmAtraso;

    public UsuarioBiclioteca (String nome, int DiasEmAtraso) {
        this.nome = nome;
        this.DiasEmAtraso = DiasEmAtraso;
    }



    public abstract double CalcularMulta();


    public String getResumo() {
        return nome + "com" + DiasEmAtraso + " dias em atraso.";
    }

    public int getDiasEmAtraso() {
        return DiasEmAtraso;
    }
}