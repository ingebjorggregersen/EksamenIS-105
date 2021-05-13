import java.net.*;
import java.io.*;
public class DateClient {
 public static void main(String[] args) {
  try {
   /* make connection to server socket */
   Socket sock = new Socket("127.0.0.1", 6017);
   /*Calling input stream receaver object*/
   InputStream in = sock.getInputStream();
   /*calling buffer reader object*/
   BufferedReader bin = new BufferedReader(new InputStreamReader( in ));
   /* creating string to read the quote from the socket*/
   String line;
   /*doing the actual reading until we reach the end*/
   while ((line = bin.readLine()) != null)
    System.out.println(line);
   /*close the socket connection*/
   sock.close();
   /*catch block to get error*/
  } catch (IOException ioe) {
   System.err.println(ioe);
  }
 }
}


