mvn install site javadoc:javadoc -Dshow=private javadoc:jar
cp -r target/site/* docs/