public abstract class paciente {

    protected String nombre;
    protected int documento;
    protected double costoConsulta;


    public paciente() {
    }

    public paciente(double costoConsulta, int documento, String nombre) {
        this.costoConsulta = costoConsulta;
        this.documento = documento;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }


    @Override
    public String toString() {
        return "paciente{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", costoConsulta=" + costoConsulta +
                '}';
    }


    public abstract double calcularCostoFinal();

    public double aplicarDescuento(double porcentaje){
        return costoConsulta - (costoConsulta * porcentaje);

    }

    public double aplicarRecargo(double porcentaje){
        return  costoConsulta+(costoConsulta*porcentaje);
    }

    public boolean esConsultaCostosa(){
        return costoConsulta > 300000;
    }

    public void mostrarDatos(double costofinal){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Documento: "+ documento);
        System.out.println("Costo consulta: "+ costoConsulta);
        System.out.println("Costo final: "+ costofinal);
    }
}
