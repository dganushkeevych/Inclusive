package com.Web_Accessibility.Web_Accessibility.Templates;

import com.Web_Accessibility.Web_Accessibility.Components.AnalyzerComponent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;

public class VerticalViewBase extends VerticalLayout{
    public VerticalViewBase() {
        RefreshContent();
    }
    public void RefreshContent()
    {
        setSizeFull();
        FlexLayout footer=getFooter();
        footer.setAlignSelf(Alignment.END);
        add(getScrollToViewButton());
        add(footer);
        expand(footer);
    }
    private FlexLayout getFooter()
    {
        FlexLayout footerWrapper = new FlexLayout();
        footerWrapper.getStyle();
        footerWrapper.setWidthFull();
        Div footer=getFooterContent();
        footerWrapper.setAlignItems(Alignment.END);
        footerWrapper.getElement().getStyle()
                .set("order", "999")
                .set("block-size", "fit-content");
        footerWrapper.setWidthFull();
        footerWrapper.add(footer);
        footerWrapper.addClassName("footer");

        return footerWrapper;
    }
    private Div getFooterContent()
    {
        Div footer = new Div();
        footer.setText("Copyright 2023 created by Diana Hanushkevych");
        AnalyzerComponent analyzerComponent = new AnalyzerComponent();
        footer.add(analyzerComponent);
        footer.getStyle().set("padding","15px")
                .set("background","#f5f5f5");
        footer.setWidthFull();
        return footer;
    }
    private Button getScrollToViewButton()
    {
        Button scrollBack = new Button(new Icon(VaadinIcon.ARROW_UP));
        scrollBack.addClickListener(e->scrollIntoView());
        scrollBack.getStyle().set("position","fixed").
                set("bottom","20px").
                set("right", "30px").
                set("z-index", "99");
        scrollBack.setId("scrollBackButton");

        return scrollBack;
    }
}
