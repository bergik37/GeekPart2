package lessons6.server;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class EchoServer {

    String text;


    public static void main(String[] args) {


        Socket socket = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (ServerSocket serverSocket = new ServerSocket(8164)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());


            new Thread(() -> {
                while (true) {
                    String str = null;
                    try {
                        str = in.readUTF();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (str.equals("/end")) {
                        break;
                    }
                    try {
                        out.writeUTF("Эхо: " + str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(str);
                }
            }).start();

            new Thread(() -> {
                while (true) {
                    try {
                        String text = reader.readLine();
                        out.writeUTF("server: " + text);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
