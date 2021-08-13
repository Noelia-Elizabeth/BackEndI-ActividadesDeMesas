package com.company;

public abstract class CompruebaCalidad {

    private CompruebaCalidad siguienteControl;

    public CompruebaCalidad setSiguienteControl(CompruebaCalidad control){
        this.siguienteControl = control;
        return control;
    }

    public CompruebaCalidad getSiguienteControl() {
        return this.siguienteControl;
    }

    public abstract void procesarPeticion(Articulo articulo);

}
