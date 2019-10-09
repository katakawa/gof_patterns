package com.gof.creational.builder.builders;

import com.gof.creational.builder.objects.Engineer;

public class EngineerBuilder extends AbstractProfessionBuilder<EngineerBuilder, Engineer> {

    private String tools;

    public EngineerBuilder tools(String tools) {
        this.tools = tools;
        return this;
    }

    @Override
    protected Engineer internalBuild() {
        return new Engineer(this.name, this.salary, this.duties, this.tools);
    }
}