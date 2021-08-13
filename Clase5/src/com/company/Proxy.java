package com.company;

public class Proxy implements ServicioDescarga{

    private Descarga descarga;

    public Boolean comprobarSuscripcion(Usuario usuario) {
        return usuario.getTipoSuscripcion().equals("premium");
    }

    @Override
    public void descargar(Usuario usuario) {
        if (comprobarSuscripcion(usuario)) {
            this.descarga.descargar(usuario);
        } else {
            System.out.println("Oh, no pagaste... No podés descargarla.");
        }
    }



}
