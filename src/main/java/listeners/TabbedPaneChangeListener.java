package main.java.listeners;

import main.java.controller.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPaneChangeListener implements ChangeListener {
    private View view;

    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }

    public void selectedTabChanged() {
    }

    @Override
    public void stateChanged(ChangeEvent e) {

        view.selectedTabChanged();

    }
}
