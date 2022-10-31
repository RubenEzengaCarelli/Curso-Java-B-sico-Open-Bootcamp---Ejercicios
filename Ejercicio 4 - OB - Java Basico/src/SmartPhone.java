public class SmartPhone extends SmartDevice {

    String microSD;
    Double tamañoPantalla;

    public SmartPhone() {

    }

    public SmartPhone(String microSD, Double tamañoPantalla) {
        this.microSD = microSD;
        this.tamañoPantalla = tamañoPantalla;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "microSD='" + microSD + '\'' +
                ", tamañoPantalla=" + tamañoPantalla +
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

