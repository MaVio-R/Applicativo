import Gui.HomeWindow;
import Model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
     /*  // Create User objects
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        // Create Client objects
        Client client1 = new Client("client1", "password1", "John", "Doe", "01/01/1990", "123-45-6789", "john.doe@example.com", "123-456-7890");
        Client client2 = new Client("client2", "password2", "Jane", "Smith", "02/02/1992", "987-65-4321", "jane.smith@example.com", "098-765-4321");

        // Create Admin objects
        Admin admin1 = new Admin("admin1", "adminpass1", "OPCODE1");
        Admin admin2 = new Admin("admin2", "adminpass2", "OPCODE2");

        // Create Booking objects
        Booking booking1 = new Booking("BK001", "TKT001", "12A", BookingStatus.CONFIRMED);
        Booking booking2 = new Booking("BK002", "TKT002", "14C", BookingStatus.PENDING);

        // Create Gate objects
        Gate gate1 = new Gate("G1", "T1");
        Gate gate2 = new Gate("G2", "T2");

        // Create Flight objects
        Flight flight1 = new Flight("FL001", "Airline1", "2023-12-01", "10:00 AM", FlightStatus.SCHEDULED, 0, "JFK", "LAX");
        Flight flight2 = new Flight("FL002", "Airline2", "2023-12-02", "12:00 PM", FlightStatus.BOARDING, 15, "SFO", "ORD");

        // Create Luggage objects
        Luggage luggage1 = new Luggage("LUG001", LuggageStatus.LOST);
        Luggage luggage2 = new Luggage("LUG002", LuggageStatus.FOUND);*/

        HomeWindow homeWindow = new HomeWindow();
        homeWindow.setVisible(true);   }
}