#Intro
Very basic example of:

* Scala 2.9.1
* Maven
* Circumflex ORM
* MySQL

## Setup

Create a blank MySQL database and update the pom.xml properties
to match your MySQL configuration:

    <orm.connection.driver>com.mysql.jdbc.Driver</orm.connection.driver>
    <orm.connection.url>jdbc:mysql://localhost:8889/circumflex-orm-sample</orm.connection.url>
    <orm.connection.username>root</orm.connection.username>
    <orm.connection.password>root</orm.connection.password>

My development environment:

* Eclipse Helios 3.6.2
* M2Eclipse
* Scala IDE 2.0.0-beta10

## Circumflex

To make the sample work with Scala 2.9.1 I had to recompile Circumflex.
See [this post](http://codebearing.blogspot.com/2011/09/scala-291-circumflex-orm-203.html) how to compile and install Circumflex.

## Creating the database schema:

    mvn clean compile cx:schema

## Run example:

    mvn scala:run -Dlauncher=sample
