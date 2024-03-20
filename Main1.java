package Practica_190324;

// Definición de la clase Rueda
class Rueda {
    private int diametro;
    private String tipo;
    private String material;

    // Constructor
    public Rueda(int diametro, String tipo, String material) {
        this.diametro = diametro;
        this.tipo = tipo;
        this.material = material;
    }

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

    // Constructor
    public Cuadro(String material, String color, int tamaño) {
        this.material = material;
        this.color = color;
        this.tamaño = tamaño;
    }

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

// Definición de la clase Bicicleta
class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    // Constructor
    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.cuadro = cuadro;
    }

    // Método para obtener el material del cuadro de la bicicleta
    public String obtenerMaterialCuadro() {
        return cuadro.getMaterial();
    }

    // Método para obtener el diámetro de la rueda delantera
    public int obtenerDiametroRuedaDelantera() {
        return ruedaDelantera.getDiametro();
    }

    // Método para obtener el color del cuadro
    public String obtenerColorCuadro() {
        return cuadro.getColor();
    }
    public int obtenerDiametroRuedaTrasera() {
        return ruedaTrasera.getDiametro();
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Crear instancias de Rueda
        Rueda ruedaDelantera = new Rueda(26, "MTB", "Aluminio");
        Rueda ruedaTrasera = new Rueda(26, "MTB", "Aluminio");

        // Crear instancia de Cuadro
        Cuadro cuadro = new Cuadro("Aluminio", "Rojo", 18);

        // Crear instancia de Bicicleta
        Bicicleta bicicleta = new Bicicleta(ruedaDelantera, ruedaTrasera, cuadro);

        // Imprimir valores de atributos
        System.out.println("Material del cuadro: " + bicicleta.obtenerMaterialCuadro());
        System.out.println("Diámetro de la rueda delantera: " + bicicleta.obtenerDiametroRuedaDelantera());
        System.out.println("Color del cuadro: " + bicicleta.obtenerColorCuadro());
    }
}