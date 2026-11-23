package com.example.agenda;

import java.time.LocalDate;
import java.util.Date;

public class Contacto {

    private String nom;
    private String cognom;
    private Direccion direccion;
    private int telefono;
    private String email;
    private String fechaNacimiento;

    public Contacto(String nom, String cognom, Direccion direccion, int telefono, String email, String fechaNacimiento) {
        this.nom = nom;
        this.cognom = cognom;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        String comprobarTelefono = String.valueOf(telefono);
        if (comprobarTelefono.length() != 9) {
            System.out.println("El formato de telefono no es correcto");
        } else {
            this.telefono = telefono;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
