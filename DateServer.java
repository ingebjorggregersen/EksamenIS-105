//import the libraries
import java.net.*;
import java.io.*;
public class DateServer {
 public static void main(String[] args) {
  try {
   ServerSocket sock = new ServerSocket(6017);
   /* now listen for connections */
   while (true) {
	/*Accept client*/
    Socket client = sock.accept();
	/*PrintWriter object for writing output.*/
    PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
    /* create string to save the Quote of the Day */
    String quoteOfDay = "My quote of the day";
	/*Write output to the socket as asked from the exercise*/
    pout.println(quoteOfDay.toString());
    /* close the socket and resume */
    /* listening for connections */
    client.close();
   }
   /*Catch block to trap errors*/
  } catch (IOException ioe) {
   System.err.println(ioe);
  }
 }
}

