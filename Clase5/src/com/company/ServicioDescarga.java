package com.company;

public interface ServicioDescarga {

    String[] tipoUsuario = new String[]{"free", "premium"};

    public abstract void descargar(Usuario usuario);

}
