package example

abstract class VeryLongTypeThatWillTriggerScalafmtToDoALinebreak[A]

given (x: VeryLongTypeThatWillTriggerScalafmtToDoALinebreak[Any]) => VeryLongTypeThatWillTriggerScalafmtToDoALinebreak[Any] = x
