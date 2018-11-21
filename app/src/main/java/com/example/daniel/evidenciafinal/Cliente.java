package com.example.daniel.evidenciafinal;

import android.os.Parcel;
import android.os.Parcelable;

public class Cliente {
    public String nombre;
    public String apellidopa;
    public String apellidoma;
    public String nacionalidad;
    public String sexo;
    public String estado;

    public Cliente(String nombre, String apellidopa,
                   String apellidoma,
                   String nacionalidad, String sexo,
                   String estado) {
        this.nombre = nombre;
        this.apellidopa = apellidopa;
        this.apellidoma = apellidoma;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
        this.estado = estado;
    }

    public String a() {return nombre; }
    public String e () {return apellidopa; }
    public String i () {return apellidoma; }
    public String p   () {return nacionalidad; }
    public String f() {return sexo; }
    public String n () {return estado; }

    protected Cliente() {
        nombre= in.readString();
        apellidopa = in.readString();
        apellidoma = in.readString();
        nacionalidad = in.readString();
        sexo = in.readString();
        estado = in.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(apellidopa);
        dest.writeString(apellidoma);
        dest.writeString(nacionalidad);
        dest.writeString(sexo);
        dest.writeString(estado);
    }

    public void nombre(String string) {

    }

    public void estado(String string) {
    }

    public void sexo(String string) {
    }

    public void nacionalidad(String string) {
    }

    public void apellidoma(String string) {
    }

    public void apellidopa(String string) {
    }
}
