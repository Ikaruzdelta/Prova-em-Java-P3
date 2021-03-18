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
public class Macaco extends Animal {

    private String nome;

    public Macaco() {
    }

    public Macaco(String nome) {
        this.nome = nome;
    }

    @Override
    public void limpar(Animal a) {
        System.out.println("Macaco fica pulando");
    }

    @Override
    public void alimentar(Animal a) {
        System.out.println("Macaco dando cambalhotas");
    }

    @Override
    public String getNomeAnimal() {
        return nome;
    }

    @Override
    public String toString() {
        return "Macaco{" + "nome=" + nome + '}';
    }

}
