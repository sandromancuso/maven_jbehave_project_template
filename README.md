This is just a project template using Maven and JBehave. Since configuring JBehave is painful, here is a good start point.

Running the project:

1. From eclipse, right click on the project, click Run as >> JUnit Test
2. From the command line, type: mvn clean integration-test

After downloading this project you should:

- Change the src/main/stories/update_items_quality.story to reflect your business story
- Change the src/main/java/org/craftedsw/jbehave/steps/UpdateItemsQualitySteps.java 
- Remove unused dependencies from pom.xml
