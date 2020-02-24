# JDI Light project template
For run new UI test automation just download and open this project
Powered by [JDI Light](https://github.com/jdi-testing/jdi-light) and Selenium

# Instruction:
1. Download template and unpack in appropriate folder

2. Open project in IDE (for example IntelliJIdea)

3. For running demo test just use "mvn clean install" command
http://pix.my/o/fkSH1s?1547398376
or run via IDE by click on "example" folder in src/test and select "Run tests"
http://pix.my/o/SJtkya?1547398292

4. Logs: Observe test run results in Console log
http://pix.my/o/CEtiOQ?1547398216

5. Reporting: When test run finished just run **allure:serve** in maven plugins
http://pix.my/o/5KPsyr?1547398089

6. Use as template for your project: 
* just remove all content from **src/test/resources/features** folder, and add your features
* replace steps in  in **src/test/.../steps** folder with your steps
* place json page objects and data in **src/test/resources/jsom** folder
