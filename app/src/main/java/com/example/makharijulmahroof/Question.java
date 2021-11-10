package com.example.makharijulmahroof;

import java.io.Serializable;
import java.util.List;

public class Question implements Serializable {
    String statement;
    String[] options;
    int correctOption;
    int selectedOption;

    public boolean check(){
        return this.selectedOption == this.correctOption;
    }
}
