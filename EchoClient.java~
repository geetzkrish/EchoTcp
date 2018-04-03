import java.io.*;
import java.net.*;
public class EchoClient
{
  public static void main(String[] args) throws Exception
  {
     Socket sock = new Socket("127.0.0.1", 3000);
     BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
     OutputStream ostream = sock.getOutputStream(); 
 PrintWriter pwrite = new PrintWriter(ostream, true);
     InputStream istream = sock.getInputStream();
     BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
     System.out.println("Client ready for chatting, type 'ok' to exit");
     String receiveMessage, sendMessage;   
}}
