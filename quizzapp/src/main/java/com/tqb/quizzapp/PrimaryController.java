package com.tqb.quizzapp;

import com.tql.utils.MyAlertSingleton;
import com.tql.utils.themes.ThemeTypes;
import static com.tql.utils.themes.ThemeTypes.DARK;
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
        MyAlertSingleton.getInstance().showAlert("comming soon...");
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
        switch (this.cbThemes.getSelectionModel().getSelectedItem()) {
            case DARK:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
    }
    }
}
