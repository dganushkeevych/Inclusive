package com.Web_Accessibility.Web_Accessibility.Templates;

import com.vaadin.flow.component.applayout.AppLayout;
import com.Web_Accessibility.Web_Accessibility.Components.TopNavBarView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.theme.lumo.LumoUtility;

@CssImport("./style.css")
public class ViewTemplate extends AppLayout
{
    private ViewTemplate(){
        TopNavBarView navBar=new TopNavBarView();
        addToNavbar(navBar);
    }

}
