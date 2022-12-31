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

