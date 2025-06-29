# List of commands to execute.


## Commands to compile java file:

	For Doer.java
 ```
	javac -d . com/codeswallah/security/stranger/*.java
 ```


	For Friend.java
 ```
	javac -d . com/codeswallah/security/friend/*.java
 ```

	For Stranger.java
 ```
	javac -d . com/codeswallah/security/stranger/*.java
 ```

## Creating the jar files:

	For friend.jar
 ```
	jar cvf stranger.jar com/codeswallah/security/stranger/*.class
 ```

	For stranger.jar
 ```
	jar cvf stranger.jar com/codeswallah/security/stranger/*.class
 ```

## Creating the key-pair
	
	For friend alias:
 ```
	keytool -genkey -alias friend -keypass friend4life -validity 10000 -keystore demokeys
 ```

	For stranger alias:
 ```
	keytool -genkey -alias stranger -keypass friend4life -validity 10000 -keystore demokeys
 ```

	For listing the fingerprints from the keystore file:
 ```
	keytool -list -keystore demokeys -storepass friend4life
 ```

## Signing the jar files:

	For friend.jar:
 ```
	jarsigner -keystore demokeys -storepass friend4life -keypass friend4life friend.jar friend
 ```

	For stranger.jar:
 ```
	jarsigner -keystore demokeys -storepass friend4life -keypass friend4life stranger.jar stranger
 ```


## Command for Compiling the Example file and TextFileDisplayer along with other classes.
```
	javac -d . ../jars/*.java
```

## Running the program:
```
	java -Djava.security.manager -Djava.security.policy=policyfile.txt -Dcom.codeswallah.jvm.home=/Users/abhi/dev/java_programs -cp .:friend.jar:stranger.jar Example2a
```




## Directory structure:




### Command to run the program:
```
java -Djava.security.manager -Djava.security.policy=policyfile.txt -Dcom.codeswallah.jvm.home=/Users/abhi/dev/java_programs -cp .:friend.jar:stranger.jar Example2a
```

<img width="1028" alt="Screenshot 2025-06-29 at 8 38 01 AM" src="https://github.com/user-attachments/assets/183efb27-e474-4f20-b368-3e5056e4e3be" />




# Assignment:

* Create another example named "Example2b.java" to read from answer.txt.
* Compile the program and run it.
* Share the output in the tutorial video.


