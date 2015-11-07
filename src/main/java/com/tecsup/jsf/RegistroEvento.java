package com.tecsup.jsf;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean
@RequestScoped
public class RegistroEvento {

    private String nombres;
    
    private String sexo;
    private String[] sisop;
    private String[] claveMensaje;

    public String[] getSisop() {
        return sisop;
    }

    public void setSisop(String[] sisop) {
        this.sisop = sisop;
    }

    public void registrar() {
        System.out.println("Sexo: " + sexo);
        System.out.println("Total Sistemas: " + sisop.length);
        //System.out.println("Respuesta más información: " + claveMensaje.length);
        
    }

    public String[] getClaveMensaje() {
        return claveMensaje;
    }

    public void setClaveMensaje(String[] claveMensaje) {
        this.claveMensaje = claveMensaje;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
