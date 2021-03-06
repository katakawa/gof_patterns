package com.gof.creational.builder.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Profession {

    private final String name;

    private final double salary;

    private final List<String> duties;

    public Profession(String name, double salary, List<String> duties) {
        this.name = name;
        this.salary = salary;
        this.duties = duties == null ? new ArrayList<>() : new ArrayList<>(duties);
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public List<String> getDuties() {
        return Collections.unmodifiableList(duties);
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(name)
                .append(",")
                .append(salary)
                .append(",")
                .append(duties)
                .toString();
    }
}