package com.mycompany.tableview_producto;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int talla; 

    public Producto() {
    }

    public Producto(int id, String nombre, double precio, int talla) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.talla = talla;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getTalla() { return talla; }
    public void setTalla(int talla) { this.talla = talla; }
}