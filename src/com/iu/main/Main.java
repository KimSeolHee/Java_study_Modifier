package com.iu.main;

import com.iu.himart.Client;
import com.iu.himart.Computer;
import com.iu.himart.Phon;
import com.iu.himart.Tv;

public class Main {
	
	public static void main(String[] args) {
		
		Computer com = new Computer();
		Tv tv = new Tv();
		Phon phon = new Phon();
		com.info();
		tv.info();
		phon.info();
		
		Client client = new Client();
		
		client.buy(phon);
		
	}
	
}

