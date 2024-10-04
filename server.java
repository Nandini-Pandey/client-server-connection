import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net;
class server{
    public static void main(String[] args) throws IOException{
        
        // server socket on port number 9090
        ServerSocket sS =new ServerSocket(9090);
        System.out.println("Server started. Listening for incoming connections...");

        // accept incoming client connection
        Socket clientsocket = sS.accept();
        System.out.println("Client connected!");

        // Set up input and output streams for communication with client
        BufferedReader input =new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
        PrintWriter output =new PrintWriter(clientsocket.getOutputStream(),true);

        // read message from client
        String msg=input.readLine();
        System.out.println("Message from client "+ msg);

        // send response to client 
        output.println("Hello! message received by server successfully!!!");

        // close client and server socket 
        clientsocket.close();
        sS.close();
    }
}