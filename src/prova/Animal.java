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
public abstract class Animal extends Cuidador {

    private String NomeAnimal;

    public Animal() {
    }

    public Animal(String NomeAnimal) {
        this.NomeAnimal = NomeAnimal;
    }

    @Override
    public void alimentar(Animal a) {

    }

    @Override
    public void limpar(Animal a) {

    }

    public abstract String getNomeAnimal();

    @Override
    public String toString() {
        return "Animal{" + "nome=" + NomeAnimal + '}';
    }

}
