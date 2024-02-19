package com.accenture.commands;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Byee");
        System.exit(0);
    }

    @Override
    public boolean shouldRun(String command) {
        return "exit".equals(command);
    }
}