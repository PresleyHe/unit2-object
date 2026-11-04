import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleServer {

    public static void main(String[] args) {
        try {
            // 1. Open a ServerSocket on port 1234
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Waiting for client...");

            // 2. Wait for an incoming client
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            // 3. Create input and output streams
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream());

            // 4. Receive the client's message
            String message = in.nextLine();
            System.out.println("Client says: " + message);

            // 5. Send a response to the client
            out.println("Hello from the Server!");
            out.flush();

            // 6. Close connections
            in.close();
            out.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}