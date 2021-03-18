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
public class Zoologico {
    
    private ArrayList<Jaula> jaulas = new ArrayList<>();
    private ArrayList<Cuidador> cuidadores = new ArrayList<>();
    
    public Zoologico() {
        
    }
    
    public ArrayList<Jaula> getJaulas() {
        return jaulas;
    }
    
    public void setJaulas(ArrayList<Jaula> jaulas) {
        this.jaulas = jaulas;
    }
    
    public Jaula buscarjaula(String buscar) {
        
        for (Jaula s : this.jaulas) {
            
            if (buscar.equalsIgnoreCase(s.getNomeJaula())) {
                
                return s;
            }
        }
        return null;
    }
    
    public void addjaula(Jaula jaula) {
        jaulas.add(jaula);
    }
    
    public void addCuidador(Cuidador Cuidador) {
        cuidadores.add(Cuidador);
    }
    
    public Cuidador buscarCuidador(String buscar) {
        for (Cuidador a : cuidadores) {
            if (buscar.equalsIgnoreCase(a.getNomeCuidador())) {
                return a;
            }
            
        }
        
        return null;
    }
    
    public ArrayList buscarAnimalJaula(String buscar) {
        
        for (Jaula s : jaulas) {
            if (buscar.equalsIgnoreCase(s.getNomeJaula())) {
                return s.getAnimais();
            }
            
        }
        return null;
    }
    
    public void inventario() {
        for (Jaula j : jaulas) {
            System.out.println(j);
        }
    }
    
    public boolean enterrarAnimal(String buscar) {
        for (Jaula s : jaulas) {
            for (Animal a : s.getAnimais()) {
                if (buscar.equalsIgnoreCase(a.getNomeAnimal())) {
                    s.getAnimais().remove(a);
                    s.setCapacidade(s.getCapacidade() + 1);
                    return true;
                }
            }
        }
        return false;
    }
}
