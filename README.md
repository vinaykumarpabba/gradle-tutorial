

- https://www.youtube.com/watch?v=-dtcEMLNmn0&ab_channel=TomGregory

- Even with this simple setup, if you run `./gradlew tasks` you will see the list of available tasks.

4 Components of Gradle Project:
1. **Plugins**: These are used to extend the functionality of Gradle. For example, the Java plugin adds tasks for compiling Java code, running tests, and creating JAR files.
2. **Tasks**: These are the basic units of work in Gradle. Each task represents a single action, such as compiling code or running tests.
3. **Build Script**: This is the file where you define your project configuration, including plugins, dependencies, and tasks. In Gradle, this is typically a file named `build.gradle`.
4. **Project**: This is the top-level container for your build. A project can contain multiple subprojects, each with its own build script and configuration.

[//]: # (5. **Settings File**: This file, typically named `settings.gradle`, is used to define the structure of a multi-project build. It specifies which projects are included in the build and their relationships.)

[//]: # (6. **Dependencies**: These are external libraries or modules that your project needs to function. Gradle allows you to define dependencies in your build script, and it will automatically download and manage them for you.)

[//]: # (7. **Repositories**: These are locations where Gradle can find and download dependencies. You can define repositories in your build script, such as Maven Central or JCenter.)

[//]: # (8. **Configuration**: This is the process of setting up your project, including defining tasks, dependencies, and plugins. Gradle uses a domain-specific language &#40;DSL&#41; based on Groovy or Kotlin to define configurations in the build script.)

[//]: # (9. **Gradle Wrapper**: This is a script that allows you to run Gradle without requiring it to be installed on your system. It ensures that the correct version of Gradle is used for your project, making it easier to share and collaborate with others.)

[//]: # (10. **Gradle Daemon**: This is a background process that runs Gradle builds. It improves build performance by keeping the build environment warm and reusing it for subsequent builds, reducing startup time.)

[//]: # (11. **Gradle Build Cache**: This is a feature that allows Gradle to cache build outputs and reuse them in future builds. It can significantly speed up the build process by avoiding unnecessary work.)

[//]: # (12. **Gradle Build Lifecycle**: This is the sequence of phases that Gradle goes through when executing a build. It includes initialization, configuration, and execution phases, where tasks are executed in a specific order based on their dependencies.)

[//]: # (13. **Gradle Build Scan**: This is a feature that provides insights into your build performance and helps identify bottlenecks. It generates a report with detailed information about the build, including task execution times, dependencies, and more.)

[//]: # (14. **Gradle Build Tooling API**: This is a set of APIs that allows you to interact with Gradle programmatically. It provides a way to build custom tools and integrations with Gradle, enabling advanced use cases and automation.)

[//]: # (15. **Gradle Build Tooling Model**: This is a representation of the build configuration and state in Gradle. It allows you to access information about projects, tasks, dependencies, and more programmatically, enabling advanced tooling and automation scenarios.)

[//]: # (16. **Gradle Build Tooling DSL**: This is the domain-specific language used to define build scripts in Gradle. It provides a concise and expressive way to configure projects, tasks, dependencies, and plugins, making it easier to write and maintain build scripts.)

[//]: # (17. **Gradle Build Tooling Gradle Enterprise**: This is a commercial offering from Gradle that provides advanced features for build performance analysis, collaboration, and insights. It includes features like build scans, distributed caching, and more to enhance the build experience in large teams and complex projects.)

[//]: # (18. **Gradle Build Tooling Gradle Plugin Development**: This is the process of creating custom plugins for Gradle. It allows you to extend Gradle's functionality by defining new tasks, configurations, and behaviors specific to your project's needs.)

[//]: # (19. **Gradle Build Tooling Gradle Plugin Portal**: This is a repository for sharing and discovering Gradle plugins. It allows developers to publish their custom plugins and makes it easy for others to find and use them in their projects.)

[//]: # (20. **Gradle Build Tooling Gradle Wrapper Properties**: This is a file that defines the properties of the Gradle Wrapper, such as the version of Gradle to use and the distribution URL. It ensures that the correct version of Gradle is used for your project, making it easier to share and collaborate with others.)

[//]: # (21. **Gradle Build Tooling Gradle User Guide**: This is the official documentation for Gradle, providing detailed information about its features, configuration options, and best practices. It serves as a comprehensive resource for learning and using Gradle effectively in your projects.)

[//]: # (22. **Gradle Build Tooling Gradle Build File Structure**: This refers to the organization and structure of the build script file, including how tasks, dependencies, and plugins are defined. It follows a specific syntax and conventions to ensure clarity and maintainability in your build configuration.)

[//]: # (23. **Gradle Build Tooling Gradle Build Lifecycle Phases**: This refers to the different stages of a Gradle build, including initialization, configuration, and execution. Each phase has its own set of tasks and actions that are executed in a specific order, allowing for efficient and organized builds.)

[//]: # (24. **Gradle Build Tooling Gradle Build Cache Configuration**: This refers to the settings and options available for configuring the Gradle build cache. It allows you to control how build outputs are cached, shared, and reused across builds, improving performance and reducing unnecessary work.)

[//]: # (25. **Gradle Build Tooling Gradle Build Scan Configuration**: This refers to the settings and options available for configuring build scans in Gradle. It allows you to enable, customize, and analyze build scans, providing insights into build performance, dependencies, and task execution times.)

[//]: # (26. **Gradle Build Tooling Gradle Build Tooling API Usage**: This refers to how the Gradle Build Tooling API can be used to interact with Gradle programmatically. It includes accessing project information, task execution, and build configuration, enabling advanced tooling and automation scenarios.)

[//]: # (27. **Gradle Build Tooling Gradle Build Tooling Model Usage**: This refers to how the Gradle Build Tooling Model can be used to access and manipulate the build configuration and state in Gradle. It allows for programmatic access to projects, tasks, dependencies, and more, enabling advanced tooling and automation scenarios.)

[//]: # (28. **Gradle Build Tooling Gradle Build Tooling DSL Usage**: This refers to how the Gradle Build Tooling DSL can be used to define build scripts and configurations in Gradle. It provides a concise and expressive way to configure projects, tasks, dependencies, and plugins, making it easier to write and maintain build scripts.)

[//]: # (29. **Gradle Build Tooling Gradle Enterprise Features**: This refers to the advanced features provided by Gradle Enterprise, such as build scans, distributed caching, and performance analysis. These features enhance the build experience in large teams and complex projects, providing insights and optimizations for better build performance.)

[//]: # (30. **Gradle Build Tooling Gradle Plugin Development Best Practices**: This refers to the recommended practices for developing custom plugins in Gradle. It includes guidelines for defining tasks, configurations, and behaviors, ensuring that plugins are maintainable, reusable, and compatible with Gradle's ecosystem.)

[//]: # (31. **Gradle Build Tooling Gradle Plugin Portal Usage**: This refers to how the Gradle Plugin Portal can be used to discover, publish, and manage Gradle plugins. It provides a centralized repository for sharing and using plugins, making it easier for developers to find and integrate custom functionality into their projects.)

[//]: # (32. **Gradle Build Tooling Gradle Wrapper Properties Configuration**: This refers to how the Gradle Wrapper properties file can be configured to specify the version of Gradle to use, distribution URL, and other settings. It ensures that the correct version of Gradle is used for your project, making it easier to share and collaborate with others.)

[//]: # (33. **Gradle Build Tooling Gradle User Guide Usage**: This refers to how the Gradle User Guide can be used to learn about Gradle's features, configuration options, and best practices. It serves as a comprehensive resource for understanding and effectively using Gradle in your projects.)

[//]: # (34. **Gradle Build Tooling Gradle Build File Structure Best Practices**: This refers to the recommended practices for organizing and structuring your Gradle build script files. It includes guidelines for defining tasks, dependencies, and plugins in a clear and maintainable way, ensuring that your build configuration is easy to understand and modify.)

[//]: # (35. **Gradle Build Tooling Gradle Build Lifecycle Phases Best Practices**: This refers to the recommended practices for managing the different phases of a Gradle build, including initialization, configuration, and execution. It includes guidelines for defining tasks, dependencies, and behaviors in a way that optimizes build performance and organization.)

[//]: # (36. **Gradle Build Tooling Gradle Build Cache Configuration Best Practices**: This refers to the recommended practices for configuring the Gradle build cache to optimize performance and reduce unnecessary work. It includes guidelines for caching build outputs, sharing caches across builds, and managing cache settings effectively.)

[//]: # (37. **Gradle Build Tooling Gradle Build Scan Configuration Best Practices**: This refers to the recommended practices for configuring build scans in Gradle to gain insights into build performance and identify bottlenecks. It includes guidelines for enabling, customizing, and analyzing build scans effectively.)

[//]: # (38. **Gradle Build Tooling Gradle Build Tooling API Usage Best Practices**: This refers to the recommended practices for using the Gradle Build Tooling API to interact with Gradle programmatically. It includes guidelines for accessing project information, task execution, and build configuration in a way that enhances tooling and automation scenarios.)

[//]: # (39. **Gradle Build Tooling Gradle Build Tooling Model Usage Best Practices**: This refers to the recommended practices for using the Gradle Build Tooling Model to access and manipulate the build configuration and state in Gradle. It includes guidelines for programmatic access to projects, tasks, dependencies, and more, enhancing tooling and automation scenarios.)

[//]: # (40. **Gradle Build Tooling Gradle Build Tooling DSL Usage Best Practices**: This refers to the recommended practices for using the Gradle Build Tooling DSL to define build scripts and configurations in Gradle. It includes guidelines for writing clear, maintainable, and efficient build scripts that leverage Gradle's capabilities effectively.)

[//]: # (41. **Gradle Build Tooling Gradle Enterprise Features Best Practices**: This refers to the recommended practices for leveraging the advanced features provided by Gradle Enterprise, such as build scans, distributed caching, and performance analysis. It includes guidelines for optimizing build performance and collaboration in large teams and complex projects.)

[//]: # (42. **Gradle Build Tooling Gradle Plugin Development Best Practices**: This refers to the recommended practices for developing custom plugins in Gradle. It includes guidelines for defining tasks, configurations, and behaviors that ensure plugins are maintainable, reusable, and compatible with Gradle's ecosystem.)

[//]: # (43. **Gradle Build Tooling Gradle Plugin Portal Usage Best Practices**: This refers to the recommended practices for using the Gradle Plugin Portal to discover, publish, and manage Gradle plugins. It includes guidelines for finding and integrating plugins effectively, as well as best practices for publishing your own plugins to the portal.)

[//]: # (44. **Gradle Build Tooling Gradle Wrapper Properties Configuration Best Practices**: This refers to the recommended practices for configuring the Gradle Wrapper properties file to ensure consistent and reliable builds. It includes guidelines for specifying the correct version of Gradle, distribution URL, and other settings to facilitate collaboration and project sharing.)

[//]: # (45. )


Gradle project: A container of what everything Gradle knows about the application.
Build script: Each gradle project can have a build script, which is a file that contains the configuration for the project. The build script is written in Groovy or Kotlin DSL and defines tasks, dependencies, and plugins for the project. You tell Gradle the information about the application through configuration. Gradle uses that information to build the application.
Gradle tasks: A task is a single unit of work that Gradle can execute. Tasks can be defined in the build script and can perform actions such as compiling code, running tests, or creating JAR files. Tasks can depend on other tasks, allowing you to define a sequence of actions to be executed. Individual build actions that we can run from command line.
Gradle plugins: Plugins are used to extend the functionality of Gradle. They can add new tasks, configurations, and behaviors to your project. Gradle comes with a set of built-in plugins, such as the Java plugin, which provides tasks for compiling Java code and running tests. You can also create custom plugins to encapsulate specific functionality for your project. They add tasks to our project which we can run.

#### Useful Groovy features in Gradle:
- **Closures**: Groovy closures are blocks of code that can be passed around and executed later. In Gradle, closures are often used to define tasks and configurations.
- **Dynamic Typing**: Groovy allows you to define variables without explicitly specifying their types, making the code more concise and flexible.
- **String Interpolation**: Groovy supports string interpolation, allowing you to embed variables directly within strings using the `${}` syntax.
- **Method Missing**: Groovy allows you to define a method that will be called when a method that does not exist is invoked. This can be useful for creating dynamic behavior in your build scripts.
- **Property Missing**: Similar to method missing, Groovy allows you to define a property that will be called when a property that does not exist is accessed. This can be useful for creating dynamic configurations in your build scripts.
- **Safe Navigation Operator**: Groovy provides a safe navigation operator (`?.`) that allows you to safely access properties or methods of an object that may be null, preventing NullPointerExceptions.
- **GString**: Groovy's GString allows you to create strings that can contain expressions, making it easier to build dynamic strings in your build scripts.
- **Method Chaining**: Groovy allows you to chain method calls together, making the code more concise and readable. This is often used in Gradle to configure tasks and dependencies in a fluent style.
- **Named Parameters**: Groovy allows you to define methods with named parameters, making it easier to pass configuration options to tasks and plugins in a clear and readable way.
- **Default Parameters**: Groovy allows you to define default values for method parameters, making it easier to create flexible and reusable methods in your build scripts.
- **Operator Overloading**: Groovy allows you to define custom behavior for operators, enabling you to create more expressive and readable code in your build scripts.
- **Meta-programming**: Groovy supports meta-programming, allowing you to modify classes and methods at runtime. This can be useful for creating dynamic behavior in your build scripts or plugins.
- **Annotations**: Groovy supports annotations, which can be used to provide metadata about classes, methods, or properties. This can be useful for defining custom behaviors or configurations in your build scripts.
- **Type Checking**: Groovy allows you to perform type checking at compile time, helping to catch errors early in the development process. This can be useful for ensuring that your build scripts are robust and maintainable.
- **Builder Pattern**: Groovy's builder pattern allows you to create complex objects in a more readable and concise way. This is often used in Gradle to define configurations and tasks in a fluent style.
- **AST Transformations**: Groovy allows you to define custom Abstract Syntax Tree (AST) transformations, enabling you to modify the structure of your code at compile time. This can be useful for creating custom behaviors or configurations in your build scripts.
- **Dynamic Method Invocation**: Groovy allows you to invoke methods dynamically at runtime, enabling you to create flexible and reusable code in your build scripts.
- **Dynamic Property Access**: Groovy allows you to access properties dynamically, enabling you to create flexible and reusable configurations in your build scripts.
- **MetaClass**: Groovy's MetaClass allows you to modify the behavior of classes at runtime, enabling you to create dynamic and flexible build scripts. You can add methods, properties, or behaviors to existing classes without modifying their source code.
- **Category Classes**: Groovy allows you to define category classes that can add methods to existing classes dynamically. This can be useful for extending the functionality of Gradle's built-in classes or adding custom behaviors to your build scripts.
- **ExpandoMetaClass**: Groovy's ExpandoMetaClass allows you to add methods and properties to existing classes at runtime, enabling you to create dynamic and flexible build scripts. This can be useful for extending Gradle's built-in classes or adding custom behaviors to your build scripts.
- **Dynamic Property Assignment**: Groovy allows you to assign values to properties dynamically, enabling you to create flexible and reusable configurations in your build scripts. This can be useful for defining task properties or configurations that can change based on the build environment or other factors.
- **Dynamic Method Resolution**: Groovy allows you to resolve methods dynamically at runtime, enabling you to create flexible and reusable code in your build scripts. This can be useful for defining tasks or configurations that can change based on the build environment or other factors.
- **Dynamic Class Loading**: Groovy allows you to load classes dynamically at runtime, enabling you to create flexible and reusable code in your build scripts. This can be useful for defining tasks or configurations that can change based on the build environment or other factors.
- **Dynamic Property Resolution**: Groovy allows you to resolve properties dynamically at runtime, enabling you to create flexible and reusable configurations in your build scripts. This can be useful for defining task properties or configurations that can change based on the build environment or other factors.
- **Dynamic Method Invocation with Closures**: Groovy allows you to invoke methods dynamically using closures, enabling you to create flexible and reusable code in your build scripts. This can be useful for defining tasks or configurations that can change based on the build environment or other factors.
- **Dynamic Property Access with Closures**: Groovy allows you to access properties dynamically using closures, enabling you to create flexible and reusable configurations in your build scripts. This can be useful for defining task properties or configurations that can change based on the build environment or other factors.
- 



- Gradle expects java classes to live in the `src/main/java` directory. We need to use the `java` plugin to tell Gradle that we want to compile Java code. This plugin adds tasks for compiling Java code, running tests, and creating JAR files.
- You use the `plugins` method and pass the closure.
- After adding the plugin, you can run `./gradlew tasks` to see the list of available tasks, including those added by the Java plugin.
- Running `build` will generate the JAR file, but it won't run because of the missing manifest file. We can use `jar` task to create a JAR file with the correct manifest.


- The test go into `src/test/java` directory.
- `testImplementation` dependencies will end up in compile and runtime classpath of the test task.
- The tests summary will be in `build/reports/tests/test/index.html`.


