package ec.edu.uce.pa2_u1_e_s_jc;

public class Pedido {

    private String codigo;
    private String producto;
    private double precio;
    public Pedido(String codigo, String producto, double precio) {
        this.codigo = codigo;
        this.producto = producto;
        this.precio = precio;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }



    
}
