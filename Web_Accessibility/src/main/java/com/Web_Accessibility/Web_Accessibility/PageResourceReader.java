package com.Web_Accessibility.Web_Accessibility;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class PageResourceReader {
    InputStream is;

    public PageResourceReader(String path) {
        is = getClass().getClassLoader().
                getResourceAsStream(path);
    }

    public VerticalLayout getText() {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
        try {
            VerticalLayout paragraphs=new VerticalLayout();
            String line;
            while ((line = buffer.readLine()) != null) {
                paragraphs.add(new Span(line));
            }
            return paragraphs;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public Image getImage(String alt, String name) {
        StreamResource res = new StreamResource(name, () -> {
            return is;
        });
        Image imageFromStream = new Image(res, alt);
        return imageFromStream;
    }
}
