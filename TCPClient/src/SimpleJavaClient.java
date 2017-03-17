import java.net.*;
import java.io.*;

public class SimpleJavaClient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("10.3.6.27", 9999);
			InputStream i = s.getInputStream();
			OutputStream o = s.getOutputStream();
			String str;
			do {
				byte[] line = new byte[100];
				System.in.read(line);
				o.write(line);
				i.read(line);
				str = new String(line);
				System.out.println(str.trim());
			} while (!str.trim().equals("bye"));
			s.close();
		} catch (Exception err) {
			System.err.println(err);
		}
	}
}
