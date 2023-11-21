package com.Web_Accessibility.Web_Accessibility.Components;

import com.Web_Accessibility.Web_Accessibility.Views.WebAccessibilityAnalyzerView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class AnalyzerComponent extends HorizontalLayout {
    public AnalyzerComponent()
    {
        //Field
        TextField analyzeField = new TextField();
        analyzeField.setLabel("Проаналізувати сторінку");
        analyzeField.setPlaceholder("введіть посилання");
        analyzeField.setTooltipText("введіть посилання");
        analyzeField.setClearButtonVisible(true);
        analyzeField.setPrefixComponent(VaadinIcon.EXTERNAL_BROWSER.create());
        //Button
        Button startAnalysisButton = new Button();
        startAnalysisButton.setIcon(VaadinIcon.SEARCH.create());
        startAnalysisButton.addClickListener(e->
            {
                getUI().ifPresent(ui ->
                        ui.navigate(WebAccessibilityAnalyzerView.class,analyzeField.getValue())
                );
            });
        this.add(analyzeField);
        this.add(startAnalysisButton);
        this.setAlignItems(Alignment.CENTER);
    }
}
