package Practica_190324;

class Bicicleta{
    Rueda rue=new Rueda();
    Cuadro cud=new Cuadro();
}

// Definición de la clase Rueda
class Rueda {
    private int diametro;
    private String tipo;
    private String material;

    // Getters y setters
    public int getDiametro() {
        return diametro;
    }
    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

// Definición de la clase Cuadro
class Cuadro {
    private String material;
    private String color;
    private int tamaño;
    
    // Getters y setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}



public class Main1 {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        bici.rue.setDiametro(90);;
        bici.rue.setMaterial("Hierro");
        bici.rue.setTipo("Montaña");

        bici.cud.setMaterial("Hierro");
        bici.cud.setColor("Amarilla");
        bici.cud.setTamaño(200);


        // Imprimir valores de atributos
        System.out.println("\nInformacion de la Rueda:");
        System.out.println("Diametro: " + bici.rue.getDiametro());
        System.out.println("Material: " + bici.rue.getMaterial());
        System.out.println("Tipo: " + bici.rue.getTipo());

        System.out.println("\nInformación del Cuadro:");
        System.out.println("Material: " + bici.cud.getMaterial());
        System.out.println("Color: " + bici.cud.getColor());
        System.out.println("Tamaño: " + bici.cud.getTamaño());

        


    }
}
