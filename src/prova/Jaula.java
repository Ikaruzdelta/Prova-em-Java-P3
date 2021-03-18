/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.ArrayList;

/**
 *
 * @author Ikaruz
 */

public class Jaula extends Zoologico {

    private String NomeJaula;
    private int capacidade;
    private ArrayList<Animal> Animais = new ArrayList<>();

    public Jaula() {
    }

    public Jaula(String jaula, int capacidade) {
        this.NomeJaula = jaula;
        this.capacidade = capacidade;
    }

    public String getNomeJaula() {
        return NomeJaula;
    }

    public String getJaula() {
        return NomeJaula;
    }

    public void setJaula(String NomeJaula) {
        this.NomeJaula = NomeJaula;
    }

    public void setNomeJaula(String NomeJaula) {
        this.NomeJaula = NomeJaula;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public ArrayList<Animal> getAnimais() {
        return Animais;
    }

    public void setAnimais(ArrayList<Animal> Animais) {
        this.Animais = Animais;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void addAnimal(Animal a) {
        if (capacidade != 0) {
            Animais.add(a);
            capacidade = capacidade - 1;
        } else {
            System.out.println("Sem capacidade!");
        }
    }

    @Override
    public String toString() {
        return "Jaula{" + "NomeJaula=" + NomeJaula + ", capacidade=" + capacidade + ", Animais=" + Animais + '}';
    }

}
