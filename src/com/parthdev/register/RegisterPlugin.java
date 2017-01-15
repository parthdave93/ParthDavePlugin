package com.parthdev.register;

import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.components.ApplicationComponent;
import com.parthdev.actions.TextBoxes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by parth on 15/1/17.
 */
public class RegisterPlugin implements ApplicationComponent {
    @Override
    public void initComponent() {
        /*ActionManager actionManager = ActionManager.getInstance();
        TextBoxes textBoxes = new TextBoxes();
        actionManager.registerAction(getComponentName(),textBoxes);
        DefaultActionGroup actionGroup = (DefaultActionGroup) actionManager.getAction("WindowMenu");
        actionGroup.addSeparator();
        actionGroup.add(textBoxes);*/
    }

    @Override
    public void disposeComponent() {

    }

    @NotNull
    @Override
    public String getComponentName() {
        return "Parth Dev";
    }
}
