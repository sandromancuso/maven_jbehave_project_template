This is just a project template using Maven and JBehave. Since configuring JBehave is painful, here is a good start point.
This configuration will allow you to, when running the tests inside eclipse, to view each story as a single junit test.

Running the project:

1. From eclipse, right click on the project, click Run as >> JUnit Test
    1.1. You can also pass -Dstory=<story_name> (without .story) in the VM arguments to run a single story
2. From the command line, type: mvn test 

After downloading this project you should:

- Change the src/test/resources/org/craftedsw/acceptancetests/stories/update_items_quality.story to reflect your business story
- Change the src/test/java/org/craftedsw/acceptancetests/steps/UpdateItemsQualitySteps.java 
- Remove possible unused dependencies from pom.xml
