package com.cc.java;

public class Bird implements Flyable, IFeathers {

    @Override
    public String fly() {
        return "I'm like a bird, I only fly away!";
    }

    @Override
    public String hasFeathers() {
        return "My Feathers are my home!";
    }

    
    
    
}
