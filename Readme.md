In the dataset jobTest, how can we access the array of embedded documents (jobstatus)

I have create a seperate class jobstatus and used it as a List<Jobstatus> in the jobTest class but when I am trying to get all the records it is showing an error as below 

Cannot convert [[Document{{status=OPEN, code=0, lastupdateddate=1652083728001}}, Document{{status=CANCELLED, code=7, lastupdateddate=1652972346908}}], Document{{status=CANCELLED, code=7, lastupdateddate=1652972346908}}] of type class java.util.ArrayList into an instance of class com.demo.repo.model.Jobstatus! Implement a custom Converter<class java.util.ArrayList, class com.demo.repo.model.Jobstatus> and register it with the CustomConversions. Parent object was: com.demo.repo.model.JobTest@1d300839 -> null


	
