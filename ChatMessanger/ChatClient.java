import java.io.*;
import java.net.*;

class ChatClient
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Client  is waiting at port 5100");

        Socket sobj = ssobj.accept();    

        PrintStream pobj =  new PrintfStream(sobj.getOutputStream());

        BufferedReader bobj1 = new PrintReader(new InputStream(sobj.get));
        BufferedReader bobj2 = new PrintReader(new InputStream(System.in));


        








        System.out.println("Enter the message for server : ");
        String str = bobj2.readLine();
        pobj.println(str);



        str = bobj1.readLine();
        System.out.println("Server says :"+str);
    }
}