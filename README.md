# Groovy String Handling Bug

This repository demonstrates an unexpected behavior in Groovy's handling of strings containing only whitespace characters. The `toUpperCase()` method behaves unexpectedly when applied to strings with only whitespace. 

The `BuggyGroovyString.groovy` file contains the buggy code, illustrating the unexpected outcome.  `FixedGroovyString.groovy` provides the corrected solution.

## Bug Description

The Groovy code uses an `if/else if/else` block to handle null and empty strings.  It converts non-null and non-empty strings to uppercase. However, the method fails to correctly process strings containing only whitespace characters. The `length()` method returns a non-zero value, yet `toUpperCase()` produces an empty string rather than the expected uppercase whitespace string. 

## Solution

The solution utilizes the `trim()` method to remove leading and trailing whitespace before applying the `toUpperCase()` method. This ensures that strings with only whitespace are treated consistently and correctly.  