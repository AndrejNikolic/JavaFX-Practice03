/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrej
 */
public class Zaposleni {
    
    private String ime;
    private String prezime;
    private int starost;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public Zaposleni(String ime, String prezime, int starost) {
        this.ime = ime;
        this.prezime = prezime;
        this.starost = starost;
    }
    
    public String stampaj(){
        return null;
    };
    
//    @Override
//    public int compareTo(Zaposleni o) {
//        return this.getIme().compareTo(o.getIme());
//    }
}
