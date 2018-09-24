package thread;

public class Factory {
	int items;
	boolean itemsInFactory;
	synchronized void produce(int items)
	{
		if(itemsInFactory)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		this.items=items;
		itemsInFactory=true;
		System.out.println("Produced items"+items);
		notify();
		
	}
	synchronized int consume()
	{
		if(!itemsInFactory)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("items consumed:"+items);
		itemsInFactory=false;
		notifyAll();
		return items;
	}
	
		
	}


