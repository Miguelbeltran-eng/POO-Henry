public class Operations {

    public double sumar(Values value) {
        double resultado = value.getA() + value.getB();
        value.setR(resultado);
        return resultado;
    }

    public double restar(Values value) {
        double resultado = value.getA() - value.getB();
        value.setR(resultado);
        return resultado;
    }

    public double multiplicar(Values value) {
        double resultado = value.getA() * value.getB();
        value.setR(resultado);
        return resultado;
    }
}