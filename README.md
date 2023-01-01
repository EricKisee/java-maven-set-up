# java-maven-set-up
Setting up a java project to run with maven on MacOs Ventura

## Install Java

Download and Install the latest JAVA version from the following link

https://www.java.com/en/download/

## Install Maven

Download the latest maven binaries from the official site

https://maven.apache.org/download.cgi

Once downloaded, extract the contents of the achieve to a folder of your choice and copy the path to the bin folder so that you can add it to the Path Environment Variable. 

## Change/Update Path Environment Variable

We need to add maven dev tools to the path environment variable so that we can be able to use it from the terminal.

### Print Current Path Settings from the Terminal 

To be able to veiw the current path settings, we use the print command or the echo command 

> echo "$PATH"

or

> printf "%s\n" $PATH

### Change your PATH Ennvironmennt Variable from the Terminal

Type the following command to open the current set path environment variable in edit mode

> nano ~/.zshrc

Append the following export command 

> export PATH=$PATH:path/to/mavin/bin/folder

Save changes on nano

> Control + o

Exit nano

> Control + x

Apply the changes immediately  using the following command on the terminal 

> source ~/.zshrc

Confirm that maven has been added to path environment variable

> echo $PATH

Check maven version installed

> mvn -v

## Create Java Application

Create a project directory of your choice. In that directory, create a subdirectory with the  following structure:

>  src/main/java/hello

In the hello directory, create the following class

```java

package main.java.hello;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World from Maven");
    }
}

```

##  Define a Maven build

Create a pom.xml file in the  root project directory i.e. next to src  folder and paste  the following

```xml

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.erickisee</groupId>
    <artifactId>java-maven-set-up</artifactId>
    <packaging>jar</packaging>
    <version>0.1.0</version>

    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-shade-plugin</artifactId>
                <version>3.2.4</version>
                <executions>
                    <execution>
                        <phase>package</phase>
                        <goals>
                            <goal>shade</goal>
                        </goals>
                        <configuration>
                            <transformers>
                                <transformer
                                    implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                                    <mainClass>main.java.hello.Hello</mainClass>
                                </transformer>
                            </transformers>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>

```
## Build Java Code

To compile the java code, execute the following on the terminal in the root  project directory

> mvn compile

The result  is a compiled .class file in the target/class folder

To package the code into a JAR file, execute the following

> mvn package

To execute the JAR file, run 

>java -jar target/java-maven-set-up-0.1.0.jar

