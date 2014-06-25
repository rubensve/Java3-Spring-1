package com.rubens.model;

public class Usuario {
    private String nombre;
    private String paterno;
    private String usuario;
    private String password;
    private char rol_admin;

    public Usuario(String nombre, String paterno, String usuario, String password, char rol_admin) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.usuario = usuario;
        this.password = password;
        this.rol_admin = rol_admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getRol_admin() {
        return rol_admin;
    }

    public void setRol_admin(char rol_admin) {
        this.rol_admin = rol_admin;
    }
    
    
 
}
