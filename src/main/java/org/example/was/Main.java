package org.example.was;

import org.example.was.CustomWebApplicationServer;

import java.io.IOException;

// GET /calculate?operand1=11&operator=*&operand2=55
public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWebApplicationServer(8080).start();
    }

}
