package com.Web_Accessibility.Web_Accessibility.Views;

import com.Web_Accessibility.Web_Accessibility.Components.AnchorNav;
import com.Web_Accessibility.Web_Accessibility.PageResourceReader;
import com.Web_Accessibility.Web_Accessibility.Templates.VerticalViewBase;
import com.Web_Accessibility.Web_Accessibility.Templates.ViewTemplate;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.io.IOException;

@Route(value = "fundamentals",layout = ViewTemplate.class)
public class AccessibilityFundamentalsView extends VerticalViewBase {
    String path="static/PagesContent/AccessibilityFundamentals/";
    public AccessibilityFundamentalsView() throws IOException {
        AnchorNav accessibilityFundamentalsParagraphs=new AnchorNav();
        accessibilityFundamentalsParagraphs.addSection("Що таке доступність?",getParagraph1());
        accessibilityFundamentalsParagraphs.addSection("Інклюзивний дизайн",getParagraph2());
        accessibilityFundamentalsParagraphs.addSection("Світові норми",getParagraph3());
        accessibilityFundamentalsParagraphs.addSection("Групи людей з обмеженими можливостями",getParagraph4());

        this.add(accessibilityFundamentalsParagraphs);
    }

    private VerticalLayout getParagraph1(){
        VerticalLayout CurrentParagraphContent=new VerticalLayout();

        CurrentParagraphContent.add(new H1("Що таке доступність?"));
        HorizontalLayout horizontalSubscript= new HorizontalLayout();
        PageResourceReader pageTextContent=new PageResourceReader(path+"Paragraph1.txt");
        VerticalLayout content =pageTextContent.getText();
        horizontalSubscript.add(content);
        horizontalSubscript.setJustifyContentMode(JustifyContentMode.CENTER);
        PageResourceReader generalInfoImageReader=new PageResourceReader(path+"AccessibilityTypes.png");
        Image DigitalAccessibility = generalInfoImageReader.getImage("Accessibility types","AccessibilityTypes.png");
        DigitalAccessibility.setWidth(50,Unit.PERCENTAGE);
        DigitalAccessibility.setHeight(70,Unit.PERCENTAGE);
        DigitalAccessibility.getStyle().set("overflow-x","hidden");
        horizontalSubscript.add(DigitalAccessibility);

        CurrentParagraphContent.add(horizontalSubscript);
        return CurrentParagraphContent;
    }
    private VerticalLayout getParagraph2(){
        VerticalLayout currentParagraphContent =new VerticalLayout();

        currentParagraphContent.add(new H1("Інклюзивний дизайн"));

        PageResourceReader pageTextContent=new PageResourceReader(path+"Paragraph2.txt");
        VerticalLayout content =pageTextContent.getText();
        currentParagraphContent.add(content);

        currentParagraphContent.setJustifyContentMode(JustifyContentMode.CENTER);
        PageResourceReader generalInfoImageReader=new PageResourceReader(path+"Inkluziya.jpg");
        Image DigitalAccessibility = generalInfoImageReader.getImage("Inkuzyvnist","Inkluziya.jpg");
        DigitalAccessibility.setWidth(90,Unit.PERCENTAGE);
        DigitalAccessibility.setHeight(40,Unit.PERCENTAGE);
        currentParagraphContent.add(DigitalAccessibility);

        return currentParagraphContent;
    }
    private VerticalLayout getParagraph3() throws IOException {
        VerticalLayout CurrentParagraphContent=new VerticalLayout();

        CurrentParagraphContent.add(new H1("Світові норми"));
        CurrentParagraphContent.add(new H2("ЄС"));


        PageResourceReader pageTextContent=new PageResourceReader(path+"Paragraph3.txt");
        VerticalLayout content =pageTextContent.getText();
        CurrentParagraphContent.add(content);


        PageResourceReader generalInfoImageReader=new PageResourceReader(path+"accessibilityList.jpg");
        Image accessibilityIcons = generalInfoImageReader.getImage("List of accessibility icons","accessibilityList.jpg");
        accessibilityIcons.setHeight(30, Unit.PERCENTAGE);
        accessibilityIcons.setWidth(90,Unit.PERCENTAGE);
        CurrentParagraphContent.add(accessibilityIcons);

        CurrentParagraphContent.add(new H2("Сполучені Штати Америки"));
        PageResourceReader pageTextContent2=new PageResourceReader(path+"Paragraph31.txt");
        VerticalLayout content2 =pageTextContent2.getText();
        CurrentParagraphContent.add(content2);

        return CurrentParagraphContent;
    }
    private VerticalLayout getParagraph4(){
        VerticalLayout CurrentParagraphContent=new VerticalLayout();

        CurrentParagraphContent.add(new H1("Групи людей з обмеженими можливостями"));

        PageResourceReader pageTextContent=new PageResourceReader(path+"Paragraph4.txt");
        VerticalLayout content =pageTextContent.getText();
        CurrentParagraphContent.add(content);

        return CurrentParagraphContent;
    }
}
