public class pacienteeps extends paciente {

    private String nombreEps;


    public pacienteeps(double costoConsulta, int documento, String nombre, String nombreEps) {
        super(costoConsulta, documento, nombre);
        this.nombreEps = nombreEps;
    }

    public String getNombreEps() {
        return nombreEps;
    }

    public void setNombreEps(String nombreEps) {
        this.nombreEps = nombreEps;
    }

    @Override
    public double calcularCostoFinal() {
        double porcentaje;
        if (costoConsulta>=  300000) {
            porcentaje = 0.25;
        }else if (costoConsulta>=80000){
            porcentaje = 0.20;
        }else
            porcentaje = 0.30;

        double coPago = costoConsulta * porcentaje;

        if (esConsultaCostosa()){
            coPago = coPago - (coPago * 0.05);

        }
        return coPago;
    }
}
