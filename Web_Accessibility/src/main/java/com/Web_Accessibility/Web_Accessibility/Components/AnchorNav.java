package com.Web_Accessibility.Web_Accessibility.Components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;


        import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;

@CssImport(value="./style.css", themeFor="vaadin-tab")
public class AnchorNav extends HorizontalLayout {

    Tabs leftNavigation;
    VerticalLayout contentPart;

    public AnchorNav()
    {
        setAlignItems(Alignment.STRETCH);
        setWidth("100%");
        leftNavigation= new Tabs();
        leftNavigation.setOrientation(Tabs.Orientation.VERTICAL);
        leftNavigation.addThemeVariants(TabsVariant.LUMO_CENTERED);
        add(leftNavigation);
        contentPart=new VerticalLayout();
        add(contentPart);
    }
    public void addSection(String sectionName,Component content)
    {
        contentPart.add(content);
        Tab tabToAdd=new Tab(sectionName);
        tabToAdd.getElement().addEventListener("click", e->
            UI.getCurrent().getPage().executeJs("arguments[0].scrollIntoView(true);",content ));
        leftNavigation.add(tabToAdd);
    }
}
