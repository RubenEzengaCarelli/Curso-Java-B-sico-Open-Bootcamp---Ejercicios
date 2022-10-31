public class SmartDevice {

    // Atributos (características que varian de un smartdevice a otro)

    String color;
    String fabricante;
    String modelo;
    String origen;
    String pantallaTactil;
    String resolucion;
    String bluetooth;


    Double peso;
    Double largo;
    Double ancho;

    Integer memoriaExtraibleGb = 32;


    public SmartDevice(){

    }

    public SmartDevice(String color, String fabricante, String modelo,String bluetooth, String origen, String pantallaTactil, String resolucion, Double peso, Double largo, Double ancho, Double pulgadas) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.origen = origen;
        this.pantallaTactil = pantallaTactil;
        this.resolucion = resolucion;
        this.peso = peso;
        this.ancho = ancho;
        this.bluetooth = bluetooth;
        this.largo = largo;
    }

    public void aumentoMemoriaExtraibleGb(Integer canteidadMemoria) {
        if (canteidadMemoria >= 0) {
            this.memoriaExtraibleGb += canteidadMemoria;
        }
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", origen='" + origen + '\'' +
                ", pantallaTactil='" + pantallaTactil + '\'' +
                ", resolucion='" + resolucion + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", memoriaExtraibleGb=" + memoriaExtraibleGb +
                '}';
    }
}
