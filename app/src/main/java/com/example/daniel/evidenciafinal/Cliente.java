package com.example.daniel.evidenciafinal;

import android.os.Parcel;

public class Cliente {
    public String Nombre;
    public String ApellidoPaterno;
    public String ApellidoMaterno;
    public String Nacionalidad;
    public String sexo;
    public String Estado;

    public Cliente(String nombre, String apellidopa,
                   String apellidoma,
                   String nacionalidad, String sexo,
                   String estado) {
        this.Nombre = nombre;
        this.ApellidoPaterno = apellidopa;
        this.ApellidoMaterno = apellidoma;
        this.Nacionalidad = nacionalidad;
        this.sexo = sexo;
        this.Estado = estado;
    }

    public String a() {return Nombre; }
    public String e () {return ApellidoPaterno; }
    public String i () {return ApellidoMaterno; }
    public String p   () {return Nacionalidad; }
    public String f() {return sexo; }
    public String n () {return Estado; }

    protected Cliente() {
        Nombre = in.readString();
        ApellidoPaterno = in.readString();
        ApellidoMaterno = in.readString();
        Nacionalidad = in.readString();
        sexo = in.readString();
        Estado = in.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Nombre);
        dest.writeString(ApellidoPaterno);
        dest.writeString(ApellidoMaterno);
        dest.writeString(Nacionalidad);
        dest.writeString(sexo);
        dest.writeString(Estado);
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
