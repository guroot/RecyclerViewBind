package com.example.fletch.recyclerviewBind;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.io.Serializable;

public class Etudiant extends BaseObservable implements Serializable {

    private String nom;
    private String prenom;
    private String groupe;

    public Etudiant(String nom, String prenom, String groupe) {
        this.nom = nom;
        this.prenom = prenom;
        this.groupe = groupe;
    }

    @Bindable
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
        notifyPropertyChanged(com.example.fletch.recyclerviewBind.BR.nom);
    }

    @Bindable
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
        notifyPropertyChanged(com.example.fletch.recyclerviewBind.BR.prenom);
    }
    @Bindable
    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
        notifyPropertyChanged(com.example.fletch.recyclerviewBind.BR.groupe);
    }
}
