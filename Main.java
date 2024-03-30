package Practica_190324;

// Clase CuerpoHumano
class CuerpoHumano {
    Corazon cors=new Corazon();
    Pulmon pulms=new Pulmon();
    Higado higo=new Higado();;
    Apendice apd=new Apendice();
}

// Clase Corazon
class Corazon {
    private String tamaño;
    private int ritmoCardiaco;
    private boolean sano;

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }
}

// Clase Pulmon
class Pulmon {
    private String lado;
    private double capacidad;
    private boolean funcionando;

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isFuncionando() {
        return funcionando;
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }
}

// Clase Higado
class Higado {
    private double peso;
    private String color;
    private boolean funcionando;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFuncionando() {
        return funcionando;
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }
}

// Clase Apendice
class Apendice {
    private double tamaño;
    private boolean inflamado;
    private boolean sano;

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isInflamado() {
        return inflamado;
    }

    public void setInflamado(boolean inflamado) {
        this.inflamado = inflamado;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }
}

// Clase principal para probar
public class Main {
    public static void main(String[] args) {
        // Crear un cuerpo humano y sus partes
        CuerpoHumano cuerpo = new CuerpoHumano();
        cuerpo.cors.setTamaño("Grande");
        cuerpo.cors.setRitmoCardiaco(70);
        cuerpo.cors.setSano(true);

        cuerpo.pulms.setCapacidad(100);
        cuerpo.pulms.setFuncionando(true);
        cuerpo.pulms.setLado("Izquierdo");

        cuerpo.higo.setColor("cafe");
        cuerpo.higo.setFuncionando(true);
        cuerpo.higo.setPeso(80);


        cuerpo.apd.setInflamado(true);
        cuerpo.apd.setSano(true);
        cuerpo.apd.setTamaño(90);



        // Imprimir valores
        System.out.println("Información del corazón:");
        System.out.println("Tamaño: " + cuerpo.cors.getTamaño());
        System.out.println("Ritmo Cardiaco: " + cuerpo.cors.getRitmoCardiaco());
        System.out.println("¿Sano?: " + cuerpo.cors.isSano());

        System.out.println("\nInformación del Pulmon:");
        System.out.println("Capacidad: " + cuerpo.pulms.getCapacidad());
        System.out.println("¿Esta funcionando?: " + cuerpo.pulms.isFuncionando());
        System.out.println("Lado del pulmon: " + cuerpo.pulms.getLado());

        System.out.println("\nInformación del Higado:");
        System.out.println("Color: " + cuerpo.higo.getColor());
        System.out.println("¿Esta funcionando?: " + cuerpo.higo.isFuncionando());
        System.out.println("Peso: " + cuerpo.higo.getPeso());

        System.out.println("\nInformación del Apendice:");
        System.out.println("Tamaño: " + cuerpo.apd.getTamaño());
        System.out.println("¿Esta inflamado?: " + cuerpo.apd.isInflamado());
        System.out.println("¿Sano?: " + cuerpo.apd.isSano());
    }
}
        
