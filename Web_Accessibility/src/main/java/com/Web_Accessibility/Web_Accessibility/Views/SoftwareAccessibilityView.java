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

@Route(value = "software-accessibility", layout = ViewTemplate.class)
public class SoftwareAccessibilityView extends VerticalViewBase {
    String path = "static/PagesContent/SoftwareAccessibility/";

    public SoftwareAccessibilityView() {
        AnchorNav accessibilityFundamentalsParagraphs = new AnchorNav();
        accessibilityFundamentalsParagraphs.addSection("Чому програми мають бути доступним?", getParagraph1());
        accessibilityFundamentalsParagraphs.addSection("Бізнес-переваги доступності технологій", getParagraph12());
        accessibilityFundamentalsParagraphs.addSection("Покращення досвіду роботи з користувачем", getParagraph13());
        accessibilityFundamentalsParagraphs.addSection("Хто відповідальний за доступність (у розробці ПЗ)", getParagraph2());
        accessibilityFundamentalsParagraphs.addSection("Команда керівників на проєкті", getParagraph21());
        accessibilityFundamentalsParagraphs.addSection("Команда розробників", getParagraph22());
        accessibilityFundamentalsParagraphs.addSection("Команда дизайнерів на проєкті", getParagraph23());
        accessibilityFundamentalsParagraphs.addSection("Контент-команда проєкту", getParagraph24());
        accessibilityFundamentalsParagraphs.addSection("Як робити програмне забезпечення доступним", getParagraph3());
        accessibilityFundamentalsParagraphs.addSection("Головні принципи доступності", getParagraph4());

        this.add(accessibilityFundamentalsParagraphs);
    }

    private VerticalLayout getParagraph1() {
        VerticalLayout CurrentParagraphContent = new VerticalLayout();

        CurrentParagraphContent.add(new H1("Чому програми мають бути доступним?"));
        HorizontalLayout accessibilityInWebContent = new HorizontalLayout();
        PageResourceReader pageTextContent = new PageResourceReader(path + "Paragraph1.txt");
        VerticalLayout content = pageTextContent.getText();
        accessibilityInWebContent.add(content);

        PageResourceReader accessibilityImageReader = new PageResourceReader(path + "whatIsAccessibility.png");
        Image webAccessibilityImage = accessibilityImageReader.getImage("Web Accessibility", "whatIsAccessibility.png");
        webAccessibilityImage.setHeight(40, Unit.PERCENTAGE);
        webAccessibilityImage.setWidth(40,Unit.PERCENTAGE);

        accessibilityInWebContent.add(webAccessibilityImage);
        CurrentParagraphContent.add(accessibilityInWebContent);

        return CurrentParagraphContent;
    }

    private VerticalLayout getParagraph12() {
        VerticalLayout CurrentParagraphContent = new VerticalLayout();
        CurrentParagraphContent.add(new H2("Бізнес-переваги доступності технологій"));

        PageResourceReader pageTextContent2 = new PageResourceReader(path + "Paragraph11.txt");
        VerticalLayout content2 = pageTextContent2.getText();
        CurrentParagraphContent.add(content2);
        PageResourceReader generalInfoImageReader = new PageResourceReader(path + "People.jpg");
        Image accessibilityIcons = generalInfoImageReader.getImage("People with disabilities in the office", "People.jpg");
        accessibilityIcons.setWidth(90,Unit.PERCENTAGE);
        accessibilityIcons.setHeight(75,Unit.PERCENTAGE);
        CurrentParagraphContent.add(accessibilityIcons);

        return CurrentParagraphContent;
    }

    private VerticalLayout getParagraph13() {
        VerticalLayout CurrentParagraphContent = new VerticalLayout();
        CurrentParagraphContent.add(new H2("Покращення досвіду роботи з користувачем"));

        PageResourceReader pageTextContent3 = new PageResourceReader(path + "Paragraph12.txt");
        VerticalLayout content3 = pageTextContent3.getText();
        CurrentParagraphContent.add(content3);
        PageResourceReader generalInfoImageReader = new PageResourceReader(path + "Disability-at-work.jpg");
        Image accessibilityIcons = generalInfoImageReader.getImage("People with disabilities work", "Disability-at-work.jpg");
        accessibilityIcons.setWidth(50, Unit.PERCENTAGE);
        accessibilityIcons.setHeight(30, Unit.PERCENTAGE);
        CurrentParagraphContent.add(accessibilityIcons);

        return CurrentParagraphContent;
    }


    private VerticalLayout getParagraph2() {
        VerticalLayout CurrentParagraphContent = new VerticalLayout();

        CurrentParagraphContent.add(new H1("Хто відповідальний за доступність (у розробці ПЗ)"));

        PageResourceReader pageTextContent = new PageResourceReader(path + "Paragraph2.txt");
        VerticalLayout content = pageTextContent.getText();
        CurrentParagraphContent.add(content);

        return CurrentParagraphContent;
    }

    private VerticalLayout getParagraph21() {
        VerticalLayout CurrentParagraphContent = new VerticalLayout();
        CurrentParagraphContent.add(new H2("Команда керівників на проєкті"));

        PageResourceReader pageTextContent2 = new PageResourceReader(path + "Paragraph21.txt");
        VerticalLayout content2 = pageTextContent2.getText();
        CurrentParagraphContent.add(content2);
        PageResourceReader generalInfoImageReader = new PageResourceReader(path + "boss.jpg");
        Image accessibilityIcons = generalInfoImageReader.getImage("Main people on the project", "boss.jpg");
        accessibilityIcons.setWidth(60, Unit.PERCENTAGE);
        accessibilityIcons.setHeight(60, Unit.PERCENTAGE);
        CurrentParagraphContent.add(accessibilityIcons);

        return CurrentParagraphContent;
    }


    private VerticalLayout getParagraph23() {
        VerticalLayout CurrentParagraphContent = new VerticalLayout();
        CurrentParagraphContent.add(new H2(" Команда дизайнерів на проєкті"));

        PageResourceReader pageTextContent4 = new PageResourceReader(path + "Paragraph23.txt");
        VerticalLayout content4 = pageTextContent4.getText();
        CurrentParagraphContent.add(content4);
        PageResourceReader generalInfoImageReader = new PageResourceReader(path + "designers.jpg");
        Image accessibilityIcons = generalInfoImageReader.getImage("Designers", "designers.jpg");
        accessibilityIcons.setWidth(60, Unit.PERCENTAGE);
        accessibilityIcons.setHeight(60, Unit.PERCENTAGE);
        CurrentParagraphContent.add(accessibilityIcons);

        return CurrentParagraphContent;
    }


    private VerticalLayout getParagraph22() {
        VerticalLayout CurrentParagraphContent = new VerticalLayout();
        CurrentParagraphContent.add(new H2("Команда розробників"));

        PageResourceReader pageTextContent3 = new PageResourceReader(path + "Paragraph22.txt");
        VerticalLayout content3 = pageTextContent3.getText();
        CurrentParagraphContent.add(content3);

        return CurrentParagraphContent;
    }

    private VerticalLayout getParagraph24() {
        VerticalLayout CurrentParagraphContent = new VerticalLayout();
        CurrentParagraphContent.add(new H2("Контент-команда проєкту"));

        PageResourceReader pageTextContent5 = new PageResourceReader(path + "Paragraph24.txt");
        VerticalLayout content5 = pageTextContent5.getText();
        CurrentParagraphContent.add(content5);

        return CurrentParagraphContent;
    }


    private VerticalLayout getParagraph3() {
        VerticalLayout CurrentParagraphContent = new VerticalLayout();

        CurrentParagraphContent.add(new H1("Як робити програмне забезпечення доступним"));

        PageResourceReader pageTextContent = new PageResourceReader(path + "Paragraph3.txt");
        VerticalLayout content = pageTextContent.getText();
        CurrentParagraphContent.add(content);

        Paragraph p = new Paragraph( "Прочитати про усі принципи детальніше можна за посиланням: ");
        Anchor gitLink = new Anchor("https://github.com/dganushkeevych/INCLUSIVITY/blob/main/INCLUSIVITY_RULES.pdf","https://github.com/dganushkeevych/INCLUSIVITY/blob/main/INCLUSIVITY_RULES.pdf");
        p.add(gitLink);
        p.add(". Там є короткий опис усіх з загальновизначених правил доступності.");
        VerticalLayout linkPart = new VerticalLayout(p);
        CurrentParagraphContent.add(linkPart);

        return CurrentParagraphContent;
    }

    private VerticalLayout getParagraph4() {
        VerticalLayout CurrentParagraphContent = new VerticalLayout();

        CurrentParagraphContent.add(new H1("Головні принципи доступності"));

        PageResourceReader pageTextContent = new PageResourceReader(path + "Paragraph4.txt");
        VerticalLayout content = pageTextContent.getText();
        CurrentParagraphContent.add(content);

        return CurrentParagraphContent;
    }

//    private VerticalLayout getParagraph5() {
//        VerticalLayout CurrentParagraphContent = new VerticalLayout();
//
//        CurrentParagraphContent.add(new H1("Висновки"));
//
//        PageResourceReader pageTextContent = new PageResourceReader(path + "Paragraph5.txt");
//        Text content = new Text(pageTextContent.getText());
//        CurrentParagraphContent.add(content);
//
//        return CurrentParagraphContent;
//    }
}
