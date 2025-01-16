# scalafmt + Scala 3.6 given invalid code generation reproducer

## Usage

1. Run `sbt compile` to see that the project is working
2. Run `sbt scalafmt` which will insert a linebreak into the source file
3. Successive invocactions of `sbt compile` will fail because the source file is no longer valid