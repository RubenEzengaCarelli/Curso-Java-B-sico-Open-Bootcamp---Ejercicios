import java.awt.*;

public class SmartDeviceMain {

    public static void main(String[] args) {

        SmartPhone SmartPhone1 = new SmartPhone();

        SmartPhone1.color = "azul";
        SmartPhone1.ancho = 0.84;
        SmartPhone1.bluetooth = "Si";
        SmartPhone1.fabricante = "Motorola";
        SmartPhone1.largo = 16.48;
        SmartPhone1.microSD = "Si";
        SmartPhone1.modelo = "Moto e20";
        SmartPhone1.origen = "Argentina";
        SmartPhone1.pantallaTactil = "Si";
        SmartPhone1.peso = 200.00;
        SmartPhone1.tamañoPantalla = 6.5;

        SmartWatch SmartWatch1 = new SmartWatch();

        SmartWatch1.color = "Negro";
        SmartWatch1.ancho = 1.8;
        SmartWatch1.bluetooth = "Si";
        SmartWatch1.fabricante = "Samsung";
        SmartWatch1.largo = 1.1;
        SmartWatch1.modelo = "SRM-220";
        SmartWatch1.origen = "Argentina";
        SmartWatch1.pantallaTactil = "Si";
        SmartWatch1.peso = 24.00;
        SmartWatch1.sensorMovimiento = "Si";

        System.out.println(SmartPhone1);
        System.out.println(SmartWatch1);




    }
}