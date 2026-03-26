public class pacienteVip extends paciente{

    private int aniosDeFidelidad;

    public pacienteVip(double costoConsulta, int documento, String nombre, int aniosDeFidelidad) {
        super(costoConsulta, documento, nombre);
        this.aniosDeFidelidad = aniosDeFidelidad;
    }

    public int getAniosDeFidelidad() {
        return aniosDeFidelidad;
    }

    public void setAniosDeFidelidad(int aniosDeFidelidad) {
        this.aniosDeFidelidad = aniosDeFidelidad;
    }

    @Override
    public double calcularCostoFinal() {
        double porcentaje;
        if (aniosDeFidelidad >= 10) {
            porcentaje = 0.4;
        } else if (aniosDeFidelidad >= 5) {
            porcentaje = 0.30;
        } else
            porcentaje = 0.20;


        double total = aplicarDescuento(porcentaje);

        if (total > 300000){
            total = 300000;
        }

        return total;
    }
}
