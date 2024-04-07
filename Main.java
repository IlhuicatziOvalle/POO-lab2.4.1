package Practica_190324;

//Clase CuerpoHumano
class CuerpoHumano {
    Corazon cors=new Corazon();
    Pulmon pulms=new Pulmon();
    Higado higo=new Higado();;
    Apendice apd=new Apendice();
}


// Clase Corazon
class Corazon {
    private int ritmoCardiaco;
    private String tipoSangre;
    private boolean palpitacionesIrregulares;


    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }


    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }
    public String getTipoSangre() {
        return tipoSangre;
    }


    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


    public boolean hasPalpitacionesIrregulares() {
        return palpitacionesIrregulares;
    }


    public void setPalpitacionesIrregulares(boolean palpitacionesIrregulares) {
        this.palpitacionesIrregulares = palpitacionesIrregulares;
    }
}


// Clase Pulmon
class Pulmon {
    private String lado;
    private double capacidad;
    private boolean tos;


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
    public boolean hasTos() {
        return tos;
    }


    public void setTos(boolean tos) {
        this.tos = tos;
    }
}


// Clase Higado
class Higado {
    private double peso;
    private String color;
    private boolean metabolismoAcelerado;


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
    public boolean hasMetabolismoAcelerado() {
        return metabolismoAcelerado;
    }


    public void setMetabolismoAcelerado(boolean metabolismoAcelerado) {
        this.metabolismoAcelerado = metabolismoAcelerado;
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


        cuerpo.cors.setPalpitacionesIrregulares(true);
        cuerpo.cors.setRitmoCardiaco(52);
        cuerpo.cors.setTipoSangre("A");


        cuerpo.pulms.setCapacidad(10.2);
        cuerpo.pulms.setLado("Derecho");
        cuerpo.pulms.setTos(true);
   
        cuerpo.higo.setColor("Cafe");
        cuerpo.higo.setMetabolismoAcelerado(true);
        cuerpo.higo.setPeso(52.2);


        cuerpo.apd.setInflamado(true);
        cuerpo.apd.setSano(true);
        cuerpo.apd.setTamaño(22.1);
       
        // Acceder a los atributos de cada órgano y sus respectivos métodos get
        // Corazón
        System.out.println("Corazón:");
        System.out.println("Ritmo Cardiaco: " + cuerpo.cors.getRitmoCardiaco());
        System.out.println("Tipo de Sangre: " + cuerpo.cors.getTipoSangre());
        System.out.println("Palpitaciones Irregulares: " + cuerpo.cors.hasPalpitacionesIrregulares());
        System.out.println();


        // Pulmones
        System.out.println("Pulmones:");
        System.out.println("Lado: " + cuerpo.pulms.getLado());
        System.out.println("Capacidad: " + cuerpo.pulms.getCapacidad());
        System.out.println("Tos: " + cuerpo.pulms.hasTos());
        System.out.println();


        // Hígado
        System.out.println("Hígado:");
        System.out.println("Peso: " + cuerpo.higo.getPeso());
        System.out.println("Color: " + cuerpo.higo.getColor());
        System.out.println("Metabolismo Acelerado: " + cuerpo.higo.hasMetabolismoAcelerado());
        System.out.println();


        // Apendice
        System.out.println("Apendice:");
        System.out.println("Tamaño: " + cuerpo.apd.getTamaño());
        System.out.println("Inflamado: " + cuerpo.apd.isInflamado());
        System.out.println("Sano: " + cuerpo.apd.isSano());
    }
}
       
  
