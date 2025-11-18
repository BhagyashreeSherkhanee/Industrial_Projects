import java.io.*;
import java.net.*;

class ChatServer
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Server is waiting at port 5100");

        Socket sobj = ssobj.accept();    

        PrintStream pobj =  new PrintfStream(sobj.getOutputStream());

        BufferedReader bobj1 = new PrintReader(new InputStream(sobj.get));
        BufferedReader bobj2 = new PrintReader(new InputStream(System.in));




       

        String str = bobj1.readLine();
        System.out.println("Client says : "+str);
        System.out.println("Enter the message for client : ");
        str = bobj2.readLine();
        pobj.println(str);

    }
}