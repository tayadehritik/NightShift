import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;
/*<applet code=ultimate1 height=800 width=800 ></applet>*/

public class ultimate1 extends Applet 
{
	Button server;
	Button frame;
	Button layouts;
	Button database;
	Button events;
	Button swing;
	public void init(Graphics g)
	{
		
	}
	public void paint(Graphics g)
	{
		server = new Button("server");
		add(server);
		frame = new Button("frame");
		add(frame);
		layouts = new Button("layouts");
		add(layouts);
		database = new Button("database");
		add(database);
		events = new Button("events");
		add(events);
		swing = new Button("swing");
		add(swing);
		ButtonHandler bh = new ButtonHandler(this);
		server.addActionListener(bh);
		frame.addActionListener(bh);
		layouts.addActionListener(bh);
		database.addActionListener(bh);
		events.addActionListener(bh);
		swing.addActionListener(bh);
		TextField tf = new TextField(20);
		TextArea ta = new TextArea(10,20);
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox c1 = new Checkbox("hi",cbg,true);
		Checkbox c2 = new Checkbox("hello",cbg,false);
		add(tf);
		add(ta);
		add(c1);
		add(c2);

	}
	

}

class ButtonHandler implements ActionListener
{
	ultimate1 app;
	ButtonHandler(ultimate1 app)
	{
		this.app = app;
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		String com = ae.getActionCommand();
		app.showStatus(com);
		if(com == "server")
		{
			server();
		}
		else if(com == "frame")
		{}
		else if(com == "swing")
		{}
		else if(com == "events")
		{}
		else if(com == "database")
		{}
		else if(com == "server1")
		{}
		else if(com == "client")
		{}
		else if(com == "url")
		{
			try
			{
				url();
			}
			catch(MalformedURLException me)
			{
			}
			
		}
	}
	public void server()
	{
		Frame fr = new Frame("networking");
		fr.setVisible(true);
		fr.setBounds(100,100,100,100);
		fr.setLayout(new FlowLayout());
		Button url = new Button("url");
		Button server1 = new Button("server1");
		Button client = new Button("client");
		url.addActionListener(this);
		server1.addActionListener(this);
		client.addActionListener(this);
		fr.add(url);
		fr.add(server1);
		fr.add(client);
		
	
	}
	public void frame()
	{}
	public void swing()
	{}
	public void events()
	{}
	public void database()
	{}
	public void client()
	{}
	public void server1()
	{}
	public void url() throws MalformedURLException
	{
		URL ur = new URL("www.google.com");
		app.showStatus(ur.getPort()+" "+ur.getHost());
	
	}

}

