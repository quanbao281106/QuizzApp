package com.tqb.quizzapp;

import com.tqb.utils.MyAlertSingleton;
import com.tqb.utils.MyStageSingleton;
import com.tqb.utils.themes.ThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeTypes> cbThemes;
    public void QuanLyCauHoi (ActionEvent e){
        MyStageSingleton.getInstance().showStage("question");
    }
    
    public void LuyenTap (ActionEvent e){
        MyAlertSingleton.getInstance().showAlert("comming soon...");
    }
    
    public void LuyenThi (ActionEvent e){
        MyAlertSingleton.getInstance().showAlert("comming soon...");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    
    public void changeTheme(ActionEvent e) {
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }
}
