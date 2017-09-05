How to use springtest-enhancer?

Prerequisites:

1. JDK(1.5+) 
2. Maven(2.x+)
3. Git 


Instructions:

1.  git clone https://github.com/hzdavid/springtest-enhancer.git

2.  cd springtest-enhancer
    mvn install  or mvn install deploy (if you have your own maven repository)

3.  import https://github.com/hzdavid/springtest-enhancer-demo.git into your ide Eclipe/IDEA .

and run test program  HelloWorldTest.java

4.  if you add property loader to  ContextConfiguration

@ContextConfiguration(locations = { "./applicationContext.xml" }, loader = SpringTestEnhancerContextLoader.class)

the test program is successful to run .

5.  Otherwise, if your remove property loader of  ContextConfiguration
@ContextConfiguration(locations = { "./applicationContext.xml" })

the test program is failed to run.

So,  you will see springtest-enhancer make spring test better to use and make your test program much more rubust. 

If you have some problems or suggestions, you can send mail to me at hzdavid2009@gmail.com. My name is david!

 
-----------------------------In Chinese:------------------------------------------------------------------------------------


如何使用springtest-enhancer?

先决条件:

1. JDK(1.5+) 
2. Maven(2.x+)
3. Git 


使用步骤:

1.  git clone https://github.com/hzdavid/springtest-enhancer.git

2.  mvn install

3.  把demo工程 https://github.com/hzdavid/springtest-enhancer-demo.git 导入到你的开发工具，如  Eclipe/IDEA .

运行测试程序  HelloWorldTest.java

4.  如果你给ContextConfiguration添加了属性 loader = SpringTestEnhancerContextLoader.class

@ContextConfiguration(locations = { "./applicationContext.xml" }, loader = SpringTestEnhancerContextLoader.class)

你的测试程序就会跑得通。

5. 否则，如果你没有给ContextConfiguration添加了属性 loader = SpringTestEnhancerContextLoader.class
@ContextConfiguration(locations = { "./applicationContext.xml" })

你的测试程序就会跑不通。

所以，你会看到springtest-enhance 让spring test更好用。让你的测试程序更加健壮。 

如果你什么问题或建议，可以写邮件给我。hzdavid2009@gmail.com。 我叫大伟。











 