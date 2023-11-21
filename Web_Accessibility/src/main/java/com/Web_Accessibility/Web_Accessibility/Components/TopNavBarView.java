package com.Web_Accessibility.Web_Accessibility.Components;

import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class TopNavBarView extends FlexLayout {

    public TopNavBarView()
    {
        this.setSizeFull();
        this.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        this.setAlignItems(FlexComponent.Alignment.CENTER);

        HorizontalLayout NavBarItems=new HorizontalLayout();
        NavBarItems.add(new MenuButtonComponent("Головна","/"));
        NavBarItems.add(new MenuButtonComponent("Основи доступності","fundamentals"));
        NavBarItems.add(new MenuButtonComponent("Доступність ПЗ","software-accessibility"));
        NavBarItems.add(new MenuButtonComponent("Правила веб доступності","web-accessibility-rules"));
        NavBarItems.add(new MenuButtonComponent("Поради щодо веб доступності","tips-for-accessibility"));
        add(NavBarItems);
    }
}

