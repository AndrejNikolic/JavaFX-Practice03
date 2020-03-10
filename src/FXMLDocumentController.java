/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author Andrej
 */
public class FXMLDocumentController implements Initializable {
    
    List<Firma> firma = new ArrayList<>(); 
    
    @FXML
    public Button print, dodajProgrameraBtn, dodajMenadzeraBtn;
    public TextField field_ime, field_prezime, field_starost, menadzer_fax;
    public ChoiceBox<String> programer_choice, izvestaj_choice;
    public Label izvestaj;
    public ListView<String> listaView;
    String programer[]= {"Junior","Senior","Intermitiet"};
    String izvs[]= {"Programeri","Menadžeri"};
    
    @FXML
    public void dodajProgramera(ActionEvent event) {
        firma.add(new Firma<Programer>(new Programer(programer_choice.getValue(), field_ime.getText(), field_prezime.getText(), Integer.parseInt(field_starost.getText()))));
        field_ime.clear();
        field_prezime.clear();
        field_starost.clear();
    }
    
    public void dodajMenadzera(ActionEvent event) {
        firma.add(new Firma<Menadzer>(new Menadzer(menadzer_fax.getText(), field_ime.getText(), field_prezime.getText(), Integer.parseInt(field_starost.getText()))));
        menadzer_fax.clear();
        field_ime.clear();
        field_prezime.clear();
        field_starost.clear();
    }
    
    public void printIzvestaj(ActionEvent event) {
        Collections.sort(firma);
        listaView.getItems().clear();
        
        
        if(izvestaj_choice.getValue() == "Programeri"){
           izvestaj.setText("Izveštaj programera:");
            
            for(Firma el : firma){
                if(el.getIzvestaj(Programer.class)!=null){
                    listaView.getItems().add(el.getIzvestaj(Programer.class));
                }
            };
            
        }
        else if (izvestaj_choice.getValue() == "Menadžeri"){
            izvestaj.setText("Izveštaj menadžera:");
            
            for(Firma el : firma){
                if(el.getIzvestaj(Menadzer.class)!=null){
                    listaView.getItems().add(el.getIzvestaj(Menadzer.class));
                }
            };
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        programer_choice.getItems().addAll(programer);
        izvestaj_choice.getItems().addAll(izvs);
        programer_choice.setValue("Junior");
        izvestaj_choice.setValue("Programeri");
    }
    
}
