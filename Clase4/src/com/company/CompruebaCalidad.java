package com.company;

public abstract class CompruebaCalidad {

    private CompruebaCalidad siguienteControl;

    public void setSiguienteControl(CompruebaCalidad control){
        this.siguienteControl = control;
    }

    public CompruebaCalidad getSiguienteControl() {
        return this.siguienteControl;
    }

    public abstract void procesarPeticion(Articulo articulo);

}
