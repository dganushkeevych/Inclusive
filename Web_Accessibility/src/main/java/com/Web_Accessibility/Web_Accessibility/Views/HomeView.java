package com.Web_Accessibility.Web_Accessibility.Views;

import com.Web_Accessibility.Web_Accessibility.PageResourceReader;
import com.Web_Accessibility.Web_Accessibility.Templates.VerticalViewBase;
import com.Web_Accessibility.Web_Accessibility.Templates.ViewTemplate;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route(value = "", layout = ViewTemplate.class)
public class HomeView extends VerticalViewBase {
    String path = "static/PagesContent/Home/";

    public HomeView() {

        this.setAlignItems(Alignment.CENTER);
        //add(new H1("WELCOME"));
        PageResourceReader resourceImage = new PageResourceReader(path + "main.jpg");
        Image image = resourceImage.getImage("All people are equal", "main.jpg");
        image.setWidth(75, Unit.PERCENTAGE);
        image.setHeight(75, Unit.PERCENTAGE);
        add(image);

        VerticalLayout goalContent = new VerticalLayout();
        goalContent.add(new H1("Мета цього сайту"));
        PageResourceReader goalDescriptionResource = new PageResourceReader(path + "goal.txt");
        VerticalLayout goalDescription = goalDescriptionResource.getText();
        goalContent.add(new Paragraph(goalDescription));
        add(goalContent);

        VerticalLayout needContent = new VerticalLayout();
        needContent.add(new H1("Кому стане у нагоді цей сайт"));

        HorizontalLayout mediaContainer = new HorizontalLayout();
        PageResourceReader needDescriptionResource = new PageResourceReader(path + "need.txt");
        VerticalLayout needDescription = needDescriptionResource.getText();
        System.out.println(needDescription);
        mediaContainer.add(needDescription);
        add(mediaContainer);

        PageResourceReader equalImage = new PageResourceReader(path + "equal.jpg");
        Image img = equalImage.getImage("We are equal", "equal.jpg");
        img.getStyle().set("overflow", "hidden");
        img.setWidth(40, Unit.PERCENTAGE);
        img.setHeight(80, Unit.PERCENTAGE);
        mediaContainer.add(img);

        needContent.add(mediaContainer);
        add(needContent);

    }
}
