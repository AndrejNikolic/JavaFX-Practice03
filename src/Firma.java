/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrej
 */
class Firma<T extends Zaposleni> implements Comparable<Firma> {
    private T obj;

    public Firma(T obj) {
        this.obj = obj;
    }
    
    public String getIzvestaj(Class imeKlase){
        
        if(imeKlase.getName()==this.obj.getClass().getName()){
           return this.obj.stampaj(); 
        }
        else {
            return null;
        }
    }
    
    @Override
    public int compareTo(Firma o) {
        return this.obj.getIme().compareTo(o.obj.getIme());
    }
}
