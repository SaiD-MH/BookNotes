import java.io.*;
import java.net.*;
public class Server {
 String[] adviceList = {"1" , "2" , "3"};
 public void go() {
 try {
 ServerSocket serverSock = new ServerSocket(4242);
 while(true) {
    System.out.println("Waiiiiiiiiiit");
 Socket sock = serverSock.accept();
 
 PrintWriter writer = new PrintWriter(sock.getOutputStream());
 String advice = getAdvice();
 writer.println(advice);    
 writer.close(); 
 System.out.println(advice); 
 }
 } catch(IOException ex) {
 ex.printStackTrace();
 }
 } // close go

 private String getAdvice() {
 int random = (int) (Math.random() * adviceList.length);
 return adviceList[random];
 }
 
 public static void main(String[] args) {
 Server server = new Server();
 server.go();
 }
}