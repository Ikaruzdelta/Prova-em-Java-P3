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
public class Prova_Main {

    public static void main(String[] args) {
        Zoologico z = new Zoologico();
        z.addjaula(new Jaula("Jaula 01", 5));
        z.addjaula(new Jaula("Jaula 02", 5));
        z.addjaula(new Jaula("Jaula 03", 5));
        z.addCuidador(new Cuidador("Seu Zé"));
        Jaula j = z.buscarjaula("Jaula 01");
        if (j != null) {
            Animal a = new Urso("Zé Colmeia");
            Animal b = new Urso("Pool");
            j.addAnimal(a);
            j.addAnimal(b);
        }

        Jaula i = z.buscarjaula("Jaula 02");
        if (i != null) {
            Animal c = new Leão("Rei");
            i.addAnimal(c);
        }
        
        Jaula k = z.buscarjaula("Jaula 03");
        if (k != null) {
            Animal d = new Macaco("Nico");
            k.addAnimal(d);
        }

        Cuidador c = z.buscarCuidador("Seu Zé");
        if (c != null) {
            ArrayList<Animal> ListaAnimais = z.buscarAnimalJaula("Jaula 03");
            for (Animal s : ListaAnimais) {
                s.alimentar(s);
                s.limpar(s);
            }
        }
        z.inventario();
        z.enterrarAnimal("Zé Colmeia");
        z.inventario();
    }
}
