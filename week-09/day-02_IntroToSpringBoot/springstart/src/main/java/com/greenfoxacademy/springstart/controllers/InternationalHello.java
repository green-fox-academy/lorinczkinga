package com.greenfoxacademy.springstart.controllers;

public class InternationalHello {
    private static String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    private String hello;
    private String color;
    private int fontSize;

    public InternationalHello() {
        this.hello = InternationalHello.hellos[(int) (0 + Math.random()*InternationalHello.hellos.length)];
        this.color = "(" + (int) (0 + Math.random()*256) + ", " + (int) (0 + Math.random()*256) + ", " + (int) (0 + Math.random()*256) + ")";
        this.fontSize = (int) (40 + Math.random()*101);
    }

    public String getHello() {
        return hello;
    }

    public String getColor() {
        return color;
    }

    public int getFontSize() {
        return fontSize;
    }
}
