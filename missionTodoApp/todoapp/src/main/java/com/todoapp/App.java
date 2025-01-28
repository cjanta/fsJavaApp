package com.todoapp;

/**
 * TodoTaskManager aka todoApp
 */
public final class App {
    private App() {
        //hide constructor
    }

    /**
     * main entry
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        AppWidget appWidget = new AppWidget();
    }
}
