package com.gof.creational.builder.builders;

import com.gof.creational.builder.objects.Profession;

public interface ProfessionBuilder<SELF extends ProfessionBuilder<SELF, TTarget>,
        TTarget extends Profession> {

    SELF name(String name);

    SELF salary(double salary);

    SELF duty(String duty);

    TTarget build();
}