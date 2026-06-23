package com.tqb.utils.themes;

import javafx.scene.Scene;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bao
 */
public class ThemeManager {
    private static ThemesAbstractFactory theme = new DefaultFactory();
    
    public static void setTheme(ThemesAbstractFactory aTheme) {
        theme = aTheme;
    }
    
    public static void applyTheme(Scene scene) {
        scene.getRoot().getStylesheets().clear();
        scene.getRoot().getStylesheets().add(theme.getStyleSheet());
    }
}
