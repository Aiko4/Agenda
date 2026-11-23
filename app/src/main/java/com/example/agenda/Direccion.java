package com.example.agenda;

public class Direccion {

    private String nomVia;
    private int numero;
    private String ciudad;
    private String codigoPostal;
    private String provincia;
    private String pais;

    public Direccion(String nomVia, int numero, String ciudad, String codigoPostal, String provincia, String pais) {
        this.nomVia = nomVia;
        this.numero = numero;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        this.pais = pais;
    }

    public String getNomVia() {
        return nomVia;
    }

    public void setNomVia(String nomVia) {
        this.nomVia = nomVia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        if (codigoPostal.length() != 5) {
            System.out.println("El formato de telefono no es correcto");
        } else {
            this.codigoPostal = codigoPostal;
        }
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
