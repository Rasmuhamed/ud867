package com.example;

import com.udacity.example.jokes.JokeSmith;

public class JokeWizard {
    public String tellAJokeWizard() {
        JokeSmith jokeSmith = new JokeSmith();
        return "A wizard says " + jokeSmith.tellAHandCraftedJoke();
    }
}
