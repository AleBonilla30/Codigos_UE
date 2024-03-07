package model;

public enum Puesto {
    //DATOS FIJOS

    mando("Este puesto manda sobre todo el mundo",1000), gerencia("Este puesto se encarga de controlar",5000),
    direccion("Este es el que controla la empresa",15000);
    private String descripcion;
    private int salarioAdd;

    Puesto(String descripcion, int salarioAdd) {
        this.descripcion = descripcion;
        this.salarioAdd = salarioAdd;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getSalarioAdd() {
        return salarioAdd;
    }

    public void setSalarioAdd(int salarioAdd) {
        this.salarioAdd = salarioAdd;
    }
}
