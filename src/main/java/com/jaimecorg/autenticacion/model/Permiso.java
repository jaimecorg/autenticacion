package com.jaimecorg.autenticacion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Permiso {
    @Id
    @GeneratedValue
    private int codigo;
    private String nombre;

    //@ManyToMany(mappedBy = "permisos")
    //private List<Usuario> usuarios;

    public Permiso() {
    }

    public Permiso(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Permiso other = (Permiso) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

}