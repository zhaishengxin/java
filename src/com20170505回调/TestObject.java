package com20170505�ص�;

public   class  TestObject {  
    /**  
     * һ�����������Եķ�����������һ���ȽϺ�ʱ��ѭ��  
     */   
    public   static   void  testMethod(){  
        for ( int  i= 0 ; i< 100000000 ; i++){  
              
        }  
    }  
    /**  
     * һ���򵥵Ĳ��Է���ִ��ʱ��ķ���  
     */   
    public   void  testTime(){  
        long  begin = System.currentTimeMillis(); //������ʼʱ��   
        testMethod(); //���Է���   
        long  end = System.currentTimeMillis(); //���Խ���ʱ��   
        System.out.println("[use time]:"  + (end - begin)); //��ӡʹ��ʱ��   
    }  
      
    public   static   void  main(String[] args) {  
        TestObject test=new  TestObject();  
        test.testTime(); 
        
    }  
}  
