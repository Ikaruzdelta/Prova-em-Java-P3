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
public class Leão extends Animal {

    private String nome;

    public Leão() {
    }

    public Leão(String nome) {
        this.nome = nome;
    }

    @Override
    public void limpar(Animal a) {
        System.out.println("Leão fica com frio");
    }

    @Override
    public void alimentar(Animal a) {
        System.out.println("Leão ruge");
    }

    @Override
    public String getNomeAnimal() {
        return nome;
    }

    @Override
    public String toString() {
        return "Le\u00e3o{" + "nome=" + nome + '}';
    }

}
