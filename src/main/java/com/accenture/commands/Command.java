package com.accenture.commands;

public interface Command {

    void execute();

    boolean shouldRun(String command);
}
