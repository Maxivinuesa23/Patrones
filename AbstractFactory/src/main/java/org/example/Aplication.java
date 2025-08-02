package org.example;

public class Aplication {
    private Boton boton;
    private Checkbox checkbox;

    public Aplication(GUIFactory factory) {
        this.boton = factory.crearBoton();
        this.checkbox = factory.crearCheckbox();
    }

    public void pintarUI(){
        boton.pintar();
        checkbox.pintar();
    }
}
