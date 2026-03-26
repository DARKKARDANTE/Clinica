public class pacienteparticular extends paciente {

    public pacienteparticular(double costoConsulta, int documento, String nombre) {
        super(costoConsulta, documento, nombre);
    }

    @Override
    public double calcularCostoFinal() {
        double total;
        if (costoConsulta>= 400000) {
            total = aplicarRecargo(0.15);
        }else if (costoConsulta>=200000){
                total = aplicarRecargo(0.10);
        }else if (costoConsulta>=50000) {
            total = aplicarRecargo(0.05);
        }else {
            total = costoConsulta;
        }

        return total;
    }
}
