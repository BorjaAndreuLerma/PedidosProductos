package com.mycompany;

/**
 *
 * @author alumno
 */
public class PedidosProd {
    int id, idproducto, cantidad;

    public PedidosProd(int id, int idproducto, int cantidad) {
        this.id = id;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
    }    

    public PedidosProd() {
    }    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProducto() {
        return idproducto;
    }

    public void setIdProducto(int producto) {
        this.idproducto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
