# Gradle构建的一个多模块Java脚手架

- java:      1.8.0_251"
- Gradle:    6.5.1
- Kotlin:    1.3.72
- Groovy:    2.5.11

### 查看项目结构
```$xslt
➜  gradle_demo git:(main) ✗ gradle projects

> Task :projects

------------------------------------------------------------
Root project
------------------------------------------------------------

Root project 'gradle_demo'
+--- Project ':app'
+--- Project ':list'
\--- Project ':web'
....
```
### 查看该项目任务列表
```$xslt
➜  gradle_demo git:(main) ✗ gradle -q tasks --all

------------------------------------------------------------
Tasks runnable from root project
------------------------------------------------------------

Application tasks
-----------------
app:run - Runs this project as a JVM application

Build tasks
-----------
app:assemble - Assembles the outputs of this project.
list:assemble - Assembles the outputs of this project.
web:assemble - Assembles the outputs of this project.
app:build - Assembles and tests this project.
list:build - Assembles and tests this project.
web:build - Assembles and tests this project.
app:buildDependents - Assembles and tests this project and all projects that depend on it.
list:buildDependents - Assembles and tests this project and all projects that depend on it.
web:buildDependents - Assembles and tests this project and all projects that depend on it.
app:buildNeeded - Assembles and tests this project and all projects it depends on.
list:buildNeeded - Assembles and tests this project and all projects it depends on.
web:buildNeeded - Assembles and tests this project and all projects it depends on.
app:classes - Assembles main classes.
list:classes - Assembles main classes.
web:classes - Assembles main classes.
app:clean - Deletes the build directory.
list:clean - Deletes the build directory.
web:clean - Deletes the build directory.
app:jar - Assembles a jar archive containing the main classes.
list:jar - Assembles a jar archive containing the main classes.
web:jar - Assembles a jar archive containing the main classes.
app:testClasses - Assembles test classes.
list:testClasses - Assembles test classes.
web:testClasses - Assembles test classes.

Build Setup tasks
-----------------
init - Initializes a new Gradle build.
wrapper - Generates Gradle wrapper files.

Distribution tasks
------------------
app:assembleDist - Assembles the main distributions
app:distTar - Bundles the project as a distribution.
app:distZip - Bundles the project as a distribution.
app:installDist - Installs the project as a distribution as-is.

Documentation tasks
-------------------
app:javadoc - Generates Javadoc API documentation for the main source code.
list:javadoc - Generates Javadoc API documentation for the main source code.
web:javadoc - Generates Javadoc API documentation for the main source code.
...
```
### 构建项目
```$xslt
➜  gradle_demo git:(main) ✗ gradle app:build     

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.5.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 1s
9 actionable tasks: 9 up-to-date

```

### 运行项目
```$xslt
➜  gradle_demo git:(main) ✗ gradle app:run  

> Task :app:run
web init
list init
com.example.App run ---->

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.5.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 956ms
6 actionable tasks: 1 executed, 5 up-to-date

```

> 参考

- https://docs.gradle.org/current/userguide/declaring_dependencies_between_subprojects.html
- https://docs.gradle.org/current/userguide/sharing_build_logic_between_subprojects.html
- https://docs.gradle.org/current/samples/sample_convention_plugins.html
