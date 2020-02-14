import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
public class FileClient
{
	private Socket s;
	public FileClient(String host,int port,String file)
	{
		try
		{
			s=new Socket(host,port);
			sendFile(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void sendFile(String file)throws IOException
	{
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		FileInputStream fis=new FileInputStream(file);
		byte[] buffer=new byte[4096];
		int read;
		while((read=fis.read(buffer))>0)
		{
			dos.write(buffer,0,read);
		}
		fis.close();
		dos.close();
	}
	public static void main(String args[])
	{
		FileClient fc=new FileClient("localhost",3456,"P-P.jpg");
	}
}