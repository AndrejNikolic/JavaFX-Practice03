/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrej
 */
public class Programer extends Zaposleni{
    private String zvanje;

    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
    }

    public Programer(String zvanje, String ime, String prezime, int starost) {
        super(ime, prezime, starost);
        this.zvanje = zvanje;
    }
    
    @Override
    public String stampaj(){
        return "Ime: "+this.getIme()+" Prezime: "+this.getPrezime()+" Starost: "+this.getStarost()+" Zvanje: "+this.getZvanje();
    }
}
