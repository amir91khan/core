package thread;

 class Add {
	static int x,y;
     static  void  add(int x,int y)
	 {
		//static synchronized void add(int x,int y)
		 {
		 this.x=x;
		 this.y=y;
		 try
		 {
			 Thread.sleep(1000);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 int res=/*this.x+this.y;*/x+y;
		 System.out.println("In"+Thread.currentThread().getName()+"Result:"+res);
	 }

	 }
	 }
