package com20170505�ص�;

public   class  Tools {  
    
    /**  
     * ���Ժ���ʹ��ʱ�䣬ͨ������CallBack�ӿڵ�execute����  
     * @param callBack  
     */   
    public   void  testTime(CallBack callBack) {  
        long  begin = System.currentTimeMillis(); //������ʼʱ��   
        callBack.execute(); ///���лص�����   
        long  end = System.currentTimeMillis(); //���Խ���ʱ��   
        System.out.println("[use time]:"  + (end - begin)); //��ӡʹ��ʱ��   
    }  
      
    public   static   void  main(String[] args) {  
    	
        Tools tool = new  Tools();  
        tool.testTime(new  CallBack(){  
            //����execute����   
            public   void  execute(){  
                //������Լӷ�һ������Ҫ��������ʱ��ķ���   
                TestObject.testMethod();  
            }  
        });  
    }  
}  

