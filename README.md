# Spring Boot Starter Jiccup

Spring Boot integration with [Jiccup](https://github.com/creactiviti/jiccup), a Clojure inspired HTML rendering library.

Watning: This project is still in an experimental phase. 

# Install

```
<dependency>
  <groupId>com.creactiviti</groupId>
  <artifactId>spring-boot-starter-jiccup</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>

<dependency>
  <groupId>com.creactiviti</groupId>
  <artifactId>jiccup</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>

<repositories>
   <repository>
      <id>maven-snapshots</id>
      <url>http://oss.sonatype.org/content/repositories/snapshots</url>
      <layout>default</layout>
      <releases>
         <enabled>false</enabled>
      </releases>
      <snapshots>
         <enabled>true</enabled>
      </snapshots>
   </repository>
</repositories>
```

# Hello World

```
import static com.creactiviti.jiccup.Elements.*;

...

@Controller
@ResponseBody
public class Hello {
  
  @RequestMapping("/hi")
  public Html render () {
    return html (
            body(
                h1(content("Hello World"))
              )
           );
  }
  
}
```

# License

Jiccup is released under version 2.0 of the Apache License.