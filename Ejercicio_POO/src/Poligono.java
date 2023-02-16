public abstract class Poligono {

    protected int numerolados;

    public   Poligono(int numerolados) {
        this.numerolados = numerolados;
    }

    public int getNumerolados() {
        return numerolados;
    }

    @Override
    public String toString() {
        return "numero de lados=" + numerolados ;


    }
    public abstract double area();

}
