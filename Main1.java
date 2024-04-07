package Practica_190324;



class Bicicleta{
    Rueda ruedaD = new Rueda();
    Rueda ruedaT = new Rueda();
    Cuadro cud=new Cuadro();
}


// Definición de la clase Rueda
class Rueda {
    private int diametro;
    private String tipo;
    private String marca; // New attribute
    private boolean inflada; // New attribute
   


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
    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public boolean isInflada() {
        return inflada;
    }


    public void setInflada(boolean inflada) {
        this.inflada = inflada;
    }


}


// Definición de la clase Cuadro
class Cuadro {
   
    private String color;
    private int tamaño;
    private String material; // New attribute
    private String tipoSuspension; // New attribute
   
    // Getters y setter
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
    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    }


    public String getTipoSuspension() {
        return tipoSuspension;
    }


    public void setTipoSuspension(String tipoSuspension) {
        this.tipoSuspension = tipoSuspension;
    }
}






public class Main1 {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        bici.ruedaD.setDiametro(90);
        bici.ruedaD.setTipo("Montaña");
        bici.ruedaD.setMarca("MarcaX");
        bici.ruedaD.setInflada(true);


        bici.ruedaT.setDiametro(90);
        bici.ruedaT.setTipo("Montaña");
        bici.ruedaT.setMarca("MarcaX");
        bici.ruedaT.setInflada(true);


        bici.cud.setColor("Amarilla");
        bici.cud.setTamaño(200);
        bici.cud.setMaterial("Aluminio");
        bici.cud.setTipoSuspension("Delantera");


        // Imprimir valores de atributos
        System.out.println("\nInformacion de la Rueda Delantera:");
        System.out.println("Diametro: " + bici.ruedaD.getDiametro()+"cm");
        System.out.println("Tipo: " + bici.ruedaD.getTipo());
        System.out.println("Marca: " + bici.ruedaD.getMarca());
        System.out.println("Inflada: " + bici.ruedaD.isInflada());


        System.out.println("\nInformacion de la Rueda Trasera:");
        System.out.println("Diametro: " + bici.ruedaT.getDiametro()+"cm");
        System.out.println("Tipo: " + bici.ruedaT.getTipo());
        System.out.println("Marca: " + bici.ruedaT.getMarca());
        System.out.println("Inflada: " + bici.ruedaT.isInflada());


        System.out.println("\nInformación del Cuadro:");
        System.out.println("Color: " + bici.cud.getColor());
        System.out.println("Tamaño: " + bici.cud.getTamaño()+"cm");
        System.out.println("Material: " + bici.cud.getMaterial());
        System.out.println("Tipo de Suspensión: " + bici.cud.getTipoSuspension());
    }
}

