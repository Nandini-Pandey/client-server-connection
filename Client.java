import java.io.*;
import java.net.*;

public class Client{
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost", 9090);

        // output stream to send data to server 
        PrintWriter output=new PrintWriter(socket.getOutputStream(),true);

        // input stream to receive data from server
        BufferedReader input =new BufferedReader(new InputStreamReader(socket.getInputStream()));


        // message to server
        output.println("hello! from client!!");

        // response from server
        String response = input.readLine();
        System.out.println("Response from server: "+response);
        socket.close();

    }

}