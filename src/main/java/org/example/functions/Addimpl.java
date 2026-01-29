package org.example.functions;

import jdk.internal.org.jline.terminal.TerminalBuilder;

public class Addimpl implements addservice {


    @Override
    public int add(int a, int b) {
        System.out.println("addition is being performed");
        return a + b;
    }
}
