package Practica_190324;

// Clase CuerpoHumano
class CuerpoHumano {
    private Corazon corazon;
    private Pulmon[] pulmones;
    private Higado higado;
    private Apendice apendice;

    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Pulmon[] getPulmones() {
        return pulmones;
    }

    public void setPulmones(Pulmon[] pulmones) {
        this.pulmones = pulmones;
    }

    public Higado getHigado() {
        return higado;
    }

    public void setHigado(Higado higado) {
        this.higado = higado;
    }

    public Apendice getApendice() {
        return apendice;
    }

    public void setApendice(Apendice apendice) {
        this.apendice = apendice;
    }
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
        cuerpo.setCorazon(new Corazon());
        cuerpo.setPulmones(new Pulmon[]{new Pulmon(), new Pulmon()});
        cuerpo.setHigado(new Higado());
        cuerpo.setApendice(new Apendice());

        // Establecer valores de ejemplo
        cuerpo.getCorazon().setTamaño("Normal");
        cuerpo.getPulmones()[0].setCapacidad(2.5);
        cuerpo.getHigado().setPeso(1.5);
        cuerpo.getApendice().setTamaño(0.1);

        // Imprimir valores
        System.out.println("Tamaño del corazón: " + cuerpo.getCorazon().getTamaño());
        System.out.println("Capacidad del primer pulmón: " + cuerpo.getPulmones()[0].getCapacidad() + " litros");
        System.out.println("Peso del hígado: " + cuerpo.getHigado().getPeso() + " kg");
        System.out.println("Tamaño del apéndice: " + cuerpo.getApendice().getTamaño() + " cm");
    }
}