set -x
version=$(mvn -o org.apache.maven.plugins:maven-help-plugin:2.1.1:evaluate -Dexpression=project.version | grep -v '^\[')
cat jad.sh "target/oolong-$version-jar-with-dependencies.jar" > target/jad
chmod +x target/jad