package com.unidev.templatewebapp;


import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


public class TestVaadinUI extends UI {

    @Override
    protected void init(VaadinRequest request) {

        final VerticalLayout layout = new VerticalLayout();

        layout.setMargin(true);
        setContent(layout);

        Button button = new Button("Click Me");
        button.addClickListener(new Button.ClickListener() {
            public void buttonClick(Button.ClickEvent event) {
                layout.addComponent(new Label("Thanks"));
            }
        });
        layout.addComponent(button);
    }

}
