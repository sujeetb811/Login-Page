import java.awt.*;

class Test {
    public static void main(String[] args) {
        // Create a new frame
        Frame F1 = new Frame();

        // Set size, background color, title, and layout
        F1.setSize(300, 400);
        F1.setBackground(Color.GREEN);
        F1.setTitle("Login Page");
        F1.setLayout(new FlowLayout());

        // Create Labels and TextFields
        Label a1 = new Label("Username:");
        TextField t1 = new TextField(20);

        Label a2 = new Label("Password:");
        TextField t2 = new TextField(20);
        t2.setEchoChar('*'); // Masking password input

        // Create login button
        Button b = new Button("Login");

        // Add components to frame in logical order
        F1.add(a1);
        F1.add(t1);
        F1.add(a2);
        F1.add(t2);
        F1.add(b);

        // Make the frame visible
        F1.setVisible(true);
    }
}
