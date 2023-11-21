package com.Web_Accessibility.Web_Accessibility.Components;

import com.Web_Accessibility.Web_Accessibility.TranslatedRule;
import com.deque.html.axecore.results.AxeResults;
import com.deque.html.axecore.results.Rule;
import com.github.dockerjava.api.model.Link;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import org.vaadin.stefan.table.Table;
import org.vaadin.stefan.table.TableCell;
import org.vaadin.stefan.table.TableRow;

import static java.lang.System.out;

public class RuleTable extends HorizontalLayout {
    public RuleTable(AxeResults rules)
    {
        this.setJustifyContentMode(JustifyContentMode.CENTER);
        Table table = new Table();
        TableRow headerRow = table.addRow();
        headerRow.addHeaderCell().setText("Правило");
        headerRow.addHeaderCell().setText("Опис");
        headerRow.addHeaderCell().setText("Вплив");
        for(Rule r: rules.getViolations())
        {
            TranslatedRule rule = new TranslatedRule(r);
            TableRow detailsRow = table.addRow();
            //Rule cell
            detailsRow.addDataCell().add(new Anchor(r.getHelpUrl(), rule.getId()));
            //Help cell
            detailsRow.addDataCell().setText(rule.getHelp());
            //Impact Cell
            String impact = rule.getImpact();
            TableCell impactCell = detailsRow.addDataCell();
            impactCell.getStyle().set("color",getImpactColor(impact));
            impactCell.setText(impact);
        }
        this.add(table);
    }
    private String getImpactColor(String impact)
    {
        return switch (impact) {
            case ("Критичний") -> "red";
            case ("Серйозний") -> "orange";
            case ("Незначний") -> "yellow";
            case ("Помірний") -> "green";
            default -> "#000000";
        };
    }
}