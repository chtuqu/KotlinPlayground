package com.chtuqu

fun main(args: Array<String>) {
    // assign-once (read-only) variables
    val a: Int = 1  // immediate assignment
    val b = 2       // 'Int' type is inferred
    val c: Int      // type required when no initializer is provided
    c = 3           // deferred assignment

    // mutable variables
    var x = 5       // 'Int' type is inferred
    x += 1
}

