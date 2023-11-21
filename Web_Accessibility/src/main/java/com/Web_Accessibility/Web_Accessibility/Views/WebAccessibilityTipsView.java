package com.Web_Accessibility.Web_Accessibility.Views;

import com.Web_Accessibility.Web_Accessibility.Components.AnchorNav;
import com.Web_Accessibility.Web_Accessibility.PageResourceReader;
import com.Web_Accessibility.Web_Accessibility.Templates.VerticalViewBase;
import com.Web_Accessibility.Web_Accessibility.Templates.ViewTemplate;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "tips-for-accessibility",layout = ViewTemplate.class)
public class WebAccessibilityTipsView extends VerticalViewBase {
    String path= "static/PagesContent/AccessibilityTips/";
    public WebAccessibilityTipsView() {
        AnchorNav accessibilityFundamentalsParagraphs=new AnchorNav();
        accessibilityFundamentalsParagraphs.addSection("Кожному",getParagraph1());
        accessibilityFundamentalsParagraphs.addSection("Розробникам",getParagraph2());

        this.add(accessibilityFundamentalsParagraphs);
    }

    private VerticalLayout getParagraph1(){
        VerticalLayout currentParagraphContent =new VerticalLayout();

        currentParagraphContent.add(new H1("Кожному"));

        PageResourceReader pageTextContent=new PageResourceReader(path+"Paragraph1.txt");
        VerticalLayout content =pageTextContent.getText();
        currentParagraphContent.add(content);

        PageResourceReader resourceImage = new PageResourceReader(path+ "principles_inclusive.jpg");
        Image image =  resourceImage.getImage("People are doing their business","principles_inclusive.jpg");
        image.setWidth(40, Unit.PERCENTAGE);
        image.setHeight(70, Unit.PERCENTAGE);

        currentParagraphContent.add(image);

        return currentParagraphContent;
    }
    private VerticalLayout getParagraph2(){
        VerticalLayout currentParagraphContent =new VerticalLayout();

        currentParagraphContent.add(new H1("Розробникам"));

        PageResourceReader pageTextContent=new PageResourceReader(path+"Paragraph2.txt");
        VerticalLayout content =pageTextContent.getText();
        currentParagraphContent.add(content);

        Paragraph p = new Paragraph( "На цьому сайті ви можете знайти значно скорочений вміст основного документа WСAG, а якщо вас цікавить повна його версія, " +
                "то відвідайте, будь ласка, офіційну сторінку за наступною адресою: ");
        Anchor gitLink = new Anchor("https://www.w3.org/Translations/WCAG21-ua/","https://www.w3.org/Translations/WCAG21-ua/.");
        p.add(gitLink);
        VerticalLayout linkPart = new VerticalLayout(p);
        currentParagraphContent.add(linkPart);


        return currentParagraphContent;
    }

}
