package com.smartbear.readyapi.client.teststeps.groovyscript;

import com.smartbear.readyapi.client.teststeps.TestStepBuilder;
import com.smartbear.readyapi.client.teststeps.TestStepTypes;
import io.swagger.client.model.GroovyScriptTestStep;

/**
 * Builder for GroovyScriptTestStep objects.
 */
public class GroovyScriptTestStepBuilder implements TestStepBuilder<GroovyScriptTestStep> {
    private final String scriptText;
    private String name;

    public GroovyScriptTestStepBuilder(String scriptText) {
        this.scriptText = scriptText;
    }

    public GroovyScriptTestStepBuilder named(String name) {
        this.name = name;
        return this;
    }


    @Override
    public GroovyScriptTestStep build() {
        GroovyScriptTestStep scriptTestStep = new GroovyScriptTestStep();
        scriptTestStep.setType(TestStepTypes.GROOVY_SCRIPT.getName());
        scriptTestStep.setScript(scriptText);
        scriptTestStep.setName(name);
        return scriptTestStep;
    }
}
