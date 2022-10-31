public class SmartWatch extends SmartDevice {

    String sensorMovimiento;

    public SmartWatch(){

    }

    public SmartWatch(String sensorMovimiento) {
        this.sensorMovimiento = sensorMovimiento;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "sensorMovimiento=" + sensorMovimiento +
                ", color='" + color + '\'' +
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

