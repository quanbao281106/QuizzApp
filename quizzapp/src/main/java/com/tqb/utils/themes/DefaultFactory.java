package com.tqb.utils.themes;

import com.tqb.quizzapp.App;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bao
 */
public class DefaultFactory extends ThemesAbstractFactory {
    @Override
    public String getStyleSheet() {
        return App.class.getResource("defaut.css").toExternalForm();
    }
}
