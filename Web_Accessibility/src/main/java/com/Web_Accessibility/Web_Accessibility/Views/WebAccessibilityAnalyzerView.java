package com.Web_Accessibility.Web_Accessibility.Views;

import com.Web_Accessibility.Web_Accessibility.AccessibilityLevelAnalyzer;
import com.Web_Accessibility.Web_Accessibility.Components.AnalyzerComponent;
import com.Web_Accessibility.Web_Accessibility.Components.RuleTable;
import com.Web_Accessibility.Web_Accessibility.Templates.VerticalViewBase;
import com.Web_Accessibility.Web_Accessibility.Templates.ViewTemplate;
import com.deque.html.axecore.results.AxeResults;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.data.renderer.LitRenderer;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import org.vaadin.stefan.table.Table;
import org.vaadin.stefan.table.TableCell;
import org.vaadin.stefan.table.TableRow;

import static java.lang.System.out;

@Route(value = "analyzer",layout = ViewTemplate.class)
public class WebAccessibilityAnalyzerView extends VerticalViewBase implements HasUrlParameter<String> {
    public WebAccessibilityAnalyzerView()
    {
        this.setMinHeight("90%");
    }
    @Override
    public void setParameter(BeforeEvent beforeEvent,@WildcardParameter String parameter) {
        this.removeAll();
        this.RefreshContent();
        if (parameter.isEmpty()) {
            this.add(new H1("Оберіть сторінку для аналізу"));
            this.add(new AnalyzerComponent());
        } else {
            try {
                analizeUrl(parameter);
            }
            catch (Exception e)
            {
                out.println(e.getMessage());
                H2 errorMessage = (new H2("Не вдалось проаналізувати даний сайт," +
                        " перевірте чи правильно введене посилання та спробуйте ще раз"));
                errorMessage.setWidth("50%");
                this.add(errorMessage);
                this.add(new AnalyzerComponent());
            }
        }
    }
    private void analizeUrl(String url)
    {
        AxeResults analysisResults = AccessibilityLevelAnalyzer.Analyze(url);
        RuleTable ruleTable= new RuleTable(analysisResults);
        ruleTable.setWidth("100%");
        add(ruleTable);
    }
}
