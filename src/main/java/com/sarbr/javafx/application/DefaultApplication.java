package com.sarbr.javafx.application;

import javafx.scene.Parent;

import java.util.List;


public class DefaultApplication implements IApplication{
    @Override
    public List<String> stylesheets(Parent parent) {
        return List.of();
    }
}
