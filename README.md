# Scala Generics Type Inference Issue with Numeric Types

This example demonstrates a subtle type inference issue in Scala when using generics with numeric types.  The `MyClass` is designed to hold a value of any type `T`.  Type inference usually works seamlessly, however,  attempting to instantiate `MyClass` with a `Double` when the expected type is an `Int` results in a type mismatch error.