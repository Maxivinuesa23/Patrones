package org.example;

public class MacOSFactory implements GUIFactory{
    @Override
    public Boton crearBoton() {
        return new BotonMacOS();
    }

    @Override
    public Checkbox crearCheckbox() {
        return new CheckboxMacOS();
    }
}
