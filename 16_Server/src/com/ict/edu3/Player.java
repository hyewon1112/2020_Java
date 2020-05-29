package com.ict.edu3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Player implements Runnable{
	Socket s;
	Server server;
	InputStream in;
	InputStreamReader isr;
	BufferedReader br;
	
	OutputStream out;
	OutputStreamWriter osw;
	BufferedWriter bw;
	String ip;
	
	public Player () {}
	public Player(Socket s, Server server) {
		this.s = s;
		this.server = server;
		
		// 입출력 준비를 끝낸다.
		try {
			in = s.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			
			out = s.getOutputStream();
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);
			
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
		}
	}
		
	@Override
	public void run() {
		try {
			while (true) {
				String msg = br.readLine();
				if (msg.equalsIgnoreCase("exit")) {
					break;
				}else {
					server.sendMsg(ip+":"+msg);
				}
			}
		} catch (Exception e) {

		}
		
	}
	
}
