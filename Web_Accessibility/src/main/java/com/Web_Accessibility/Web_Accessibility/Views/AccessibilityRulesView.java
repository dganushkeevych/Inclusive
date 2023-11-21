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

@Route(value = "web-accessibility-rules",layout = ViewTemplate.class)
public class AccessibilityRulesView extends VerticalViewBase {
    String path= "static/PagesContent/WebAccessibilityRules/";
    public AccessibilityRulesView() {
        AnchorNav mainContent=new AnchorNav();
        mainContent.addSection("Використання тегів Alt",getParagraph1());
        mainContent.addSection("Використовуйте кращі таблиці",getParagraph2());
        mainContent.addSection("Навігація з клавіатури",getParagraph3());
        mainContent.addSection("Використовуйте теги HTML за замовчуванням",getParagraph4());
        mainContent.addSection("Субтитри для медіа",getParagraph5());
        mainContent.addSection("Використовуйте тег ARIA",getParagraph6());
        mainContent.addSection("Завжди використовуйте тег Title",getParagraph7());
        add(mainContent);
    }
    private VerticalLayout getParagraph1(){
        VerticalLayout CurrentParagraphContent=new VerticalLayout();

        CurrentParagraphContent.add(new H1("Використання тегів Alt"));

        PageResourceReader pageTextContent=new PageResourceReader(path+"Paragraph1.txt");
        VerticalLayout content =pageTextContent.getText();
        CurrentParagraphContent.add(content);

        return CurrentParagraphContent;
    }
    private VerticalLayout getParagraph2(){
        VerticalLayout CurrentParagraphContent=new VerticalLayout();

        CurrentParagraphContent.add(new H1("Використовуйте кращі таблиці"));

        PageResourceReader pageTextContent=new PageResourceReader(path+"Paragraph2.txt");
        VerticalLayout content =pageTextContent.getText();
        CurrentParagraphContent.add(content);

        return CurrentParagraphContent;
    }
    private VerticalLayout getParagraph3(){
        VerticalLayout CurrentParagraphContent=new VerticalLayout();
        HorizontalLayout PageContent = new HorizontalLayout();
        CurrentParagraphContent.add(new H1("Навігація з клавіатури"));

        PageResourceReader pageTextContent=new PageResourceReader(path+"Paragraph3.txt");
        VerticalLayout content =pageTextContent.getText();
        PageContent.add(content);
        PageResourceReader resourceImage = new PageResourceReader(path+ "typing.jpeg");
        Image image =  resourceImage.getImage("Hands typing on keyboard","typing.jpeg");
        image.setWidth(40, Unit.PERCENTAGE);
        image.setHeight(60, Unit.PERCENTAGE);
        PageContent.add(image);
        CurrentParagraphContent.add(PageContent);
        return CurrentParagraphContent;
    }
    private VerticalLayout getParagraph4(){
        VerticalLayout CurrentParagraphContent=new VerticalLayout();

        CurrentParagraphContent.add(new H1("Використовуйте теги HTML за замовчуванням"));

        PageResourceReader pageTextContent=new PageResourceReader(path+"Paragraph4.txt");
        VerticalLayout content =pageTextContent.getText();
        CurrentParagraphContent.add(content);

        return CurrentParagraphContent;
    }
    private VerticalLayout getParagraph5(){
        VerticalLayout CurrentParagraphContent=new VerticalLayout();

        CurrentParagraphContent.add(new H1("Субтитри для медіа"));

        PageResourceReader pageTextContent=new PageResourceReader(path+"Paragraph5.txt");
        VerticalLayout content =pageTextContent.getText();
        CurrentParagraphContent.add(content);
        HorizontalLayout mediaContainer = new HorizontalLayout();
        IFrame iFrame = new IFrame("https://www.youtube.com/embed/iWO5N3n1DXU");
        iFrame.setTitle("Subtitles");
        iFrame.setHeight("315px");
        iFrame.setWidth("560px");
        iFrame.setAllow("accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share");
        iFrame.getElement().setAttribute("allowfullscreen", true);
        iFrame.getElement().setAttribute("frameborder", "0");
        iFrame.getElement().setAttribute("hl", "en");
        iFrame.getElement().setAttribute("persist_hl", "1");

        mediaContainer.add(iFrame);
        mediaContainer.setWidthFull();
        mediaContainer.setHeightFull();
        mediaContainer.setJustifyContentMode(JustifyContentMode.CENTER);
        CurrentParagraphContent.add(mediaContainer);
        return CurrentParagraphContent;
    }
    private VerticalLayout getParagraph6(){
        VerticalLayout CurrentParagraphContent=new VerticalLayout();

        CurrentParagraphContent.add(new H1("Використовуйте тег ARIA"));

        PageResourceReader pageTextContent=new PageResourceReader(path+"Paragraph6.txt");
        VerticalLayout content =pageTextContent.getText();
        CurrentParagraphContent.add(content);

        return CurrentParagraphContent;
    }
    private VerticalLayout getParagraph7(){
        VerticalLayout CurrentParagraphContent=new VerticalLayout();

        CurrentParagraphContent.add(new H1("Завжди використовуйте тег Title"));

        PageResourceReader pageTextContent=new PageResourceReader(path+"Paragraph7.txt");
        VerticalLayout content =pageTextContent.getText();
        CurrentParagraphContent.add(content);

        return CurrentParagraphContent;
    }
}

