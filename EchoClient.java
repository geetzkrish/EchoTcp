import java.io.*;
import java.net.*;
public class EchoClient
{
  public static void main(String[] args) throws Exception
  {
     Socket sock = new Socket("127.0.0.1", 3000);
     BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
     OutputStream ostream = sock.getOutputStream(); 
