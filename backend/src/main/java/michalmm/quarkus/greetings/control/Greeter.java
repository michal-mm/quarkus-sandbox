package  michalmm.quarkus.greetings.control;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Greeter {

    public String greetings() {
        // TODO
        return "Hello World!";
    }

    public void greetings(String userMessage) {
        // TODO
    }
}