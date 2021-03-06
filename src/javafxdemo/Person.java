package javafxdemo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

    //Returns StringProperty object
    public StringProperty firstNameProperty() {
        return firstName;
    }

    //Returns the firstName value (ie. "Ian")
    public String getFirstName() {
        return firstName.get();
    }

    //Set the firstName value
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
}
