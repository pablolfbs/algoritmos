import java.io.*;
import java.net.*;

public class SimpleJavaServer {

	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(9999);
			String str;
			while (true) {
				Socket c = s.accept();
				InputStream i = c.getInputStream();
				OutputStream o = c.getOutputStream();
				do {
					byte[] line = new byte[100];
					i.read(line);
					o.write(line);
					str = new String(line);
				} while (!str.trim().equals("bye"));
				c.close();
			}
		} catch (Exception err) {
			System.err.println(err);
		}
	}
}