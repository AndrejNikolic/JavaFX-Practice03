/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrej
 */
public class Menadzer extends Zaposleni {
    private String fakultet;

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public Menadzer(String fakultet, String ime, String prezime, int starost) {
        super(ime, prezime, starost);
        this.fakultet = fakultet;
    }
    
    @Override
    public String stampaj(){
        return "Ime: "+this.getIme()+" Prezime: "+this.getPrezime()+" Starost: "+this.getStarost()+" Fakultet: "+this.getFakultet();
    }
}
