#build steps
echo "Compiling ...."
javac Helloworld.java
echo "Execution ..."
java Helloworld
jar cvfs HelloWorld.jar Helloworld *.class
echo "======================================="
#Execution
java -jar HelloWorld.jar
echo "========================================"
