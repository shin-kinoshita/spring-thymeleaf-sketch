package com.example.sketch.request.binding.input.text;

/**
 * @author subaru
 */
public class TextForm {
    private String name;
    private String text;

    public TextForm() {

    }

    public TextForm(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }
}
