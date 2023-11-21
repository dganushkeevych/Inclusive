package com.Web_Accessibility.Web_Accessibility.Components;


import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;

import java.awt.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;

public class MenuButtonComponent extends Button {

    public MenuButtonComponent(String text, String route)
    {
        super(text);
        super.addThemeVariants(ButtonVariant.LUMO_PRIMARY,
                ButtonVariant.LUMO_SUCCESS);
        route=route;
        String finalRoute = route;
        this.addClickListener(e ->
                getUI().ifPresent(ui ->
                        ui.navigate(finalRoute)));
    }
}
