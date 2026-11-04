import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleClient {

    public static void main(String[] args) {
        try {
            // 1. Connect to the server on localhost, port 1234
            Socket socket = new Socket("localhost", 1234);

            // 2. Create input and output streams
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            Scanner in = new Scanner(socket.getInputStream());

            // 3. Send a message to the server
            out.println("Hello from the Client!");
            out.flush();

            // 4. Receive the server's response
            String response = in.nextLine();
            System.out.println("Server says: " + response);

            // 5. Close connections
            out.close();
            in.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}