package co.edu.unipiloto.starbuzz;

public class Drink {
    private String nombre;
    private String descripcion;
    private int imagenResourceId;

    public static final Drink[] bebidas = {
            new Drink("Latte", "Un café con espresso y leche vaporizada, cubierto con una pequeña capa de espuma.", R.drawable.latte),
            new Drink("Cappuccino", "Un café hecho con partes iguales de espresso, leche vaporizada y espuma espesa.", R.drawable.cappuccino),
            new Drink("Filter", "Un café preparado al verter agua caliente sobre café molido, utilizando un filtro.", R.drawable.filter)
    };

    public Drink(String nombre, String descripcion, int imagenResourceId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenResourceId = imagenResourceId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagenResourceId() {
        return imagenResourceId;
    }

    public void setImagenResourceId(int imagenResourceId) {
        this.imagenResourceId = imagenResourceId;
    }
}
