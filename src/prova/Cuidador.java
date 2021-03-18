/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author Ikaruz
 */
public class Cuidador extends Zoologico {

    private String nomeCuidador;

    public Cuidador() {
    }

    public Cuidador(String nomeCuidador) {
        this.nomeCuidador = nomeCuidador;
    }

    public String getNomeCuidador() {
        return nomeCuidador;
    }

    public void setNomeCuidador(String nomeCuidador) {
        this.nomeCuidador = nomeCuidador;
    }

    public void limpar(Animal a) {

    }

    public void alimentar(Animal a) {

    }

}
