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
public class Urso extends Animal{
    
    private String nome;

    public Urso() {
    }

    public Urso(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNomeAnimal() {
        return nome;
    }
    
    @Override
    public void limpar(Animal a) {
        System.out.println("Urso se deita");
    }
    
    @Override
    public void alimentar(Animal a) {
        System.out.println("Urso come em silêncio");
    }

    @Override
    public String toString() {
        return "Urso{" + "nome=" + nome + '}';
    }
    
    
}
