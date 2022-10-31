Plugin and versions
The kotlin-maven-plugin compiles Kotlin sources and modules. Currently, only Maven v3 is supported.

Define the version of Kotlin you want to use via a kotlin.version property:

```
<properties>
        <maven.compiler.source>18</maven.compiler.source>
        <maven.compiler.target>18</maven.compiler.target>
        <kotlin.version>1.6.10-RC</kotlin.version>
    </properties>
```

Dependencies

```
   <dependencies>
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-stdlib-jdk8</artifactId>
            <version>${kotlin.version}</version>
        </dependency>
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-test</artifactId>
            <version>${kotlin.version}</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```x
To compile source code, specify the source directories in the <build> tag:

```
<build>
    <sourceDirectory>${project.basedir}/src/main/java</sourceDirectory>
        <testSourceDirectory>${project.basedir}/src/test/java</testSourceDirectory>
</build>
```

The Kotlin Maven Plugin needs to be referenced to compile the sources:

```
<build>
  <plugins>
            <plugin>
                <groupId>org.jetbrains.kotlin</groupId>
                <artifactId>kotlin-maven-plugin</artifactId>
                <version>${kotlin.version}</version>
                <executions>
                    <execution>
                        <id>compile</id>
                        <phase>compile</phase>
                        <goals>
                            <goal>compile</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>test-compile</id>
                        <phase>test-compile</phase>
                        <goals> <goal>test-compile</goal></goals>
                    </execution>
                </executions>
            </plugin>
    </plugins>
</build>
```

##Compile Kotlin and Java sources
To compile projects that include Kotlin and Java source code, invoke the Kotlin compiler before the Java compiler. In maven terms that means that kotlin-maven-plugin should be run before maven-compiler-plugin using the following method, making sure that the kotlin plugin comes before the maven-compiler-plugin in your pom.xml file:

```
<build>
    <plugins>
       <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.5.1</version>
                <executions>
                    <!-- Replacing default-compile as it is treated specially by maven -->
                    <execution>
                        <id>default-compile</id>
                        <phase>none</phase>
                    </execution>
                    <!-- Replacing default-testCompile as it is treated specially by maven -->
                    <execution>
                        <id>default-testCompile</id>
                        <phase>none</phase>
                    </execution>
                    <execution>
                        <id>java-compile</id>
                        <phase>compile</phase>
                        <goals>
                            <goal>compile</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>java-test-compile</id>
                        <phase>test-compile</phase>
                        <goals>
                            <goal>testCompile</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
    </plugins>
</build>
```

Create a kotlin file under execrise1 as below and add following code

test.kt
```
fun main(args: Array<String>) {
    println("Hello World from Kotlin")
}

```
You should be able to run the main function and product output

