package homework10;

import sun.nio.cs.StandardCharsets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8080)){
            Socket socket = serverSocket.accept();
            System.out.println("New client connected!");

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
                while (!reader.ready());

                while (reader.ready()){
                    System.out.println(reader.readLine());
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
