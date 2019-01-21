package org.hnpwa

import com.hazelcast.config.*
import com.hazelcast.core.*

/**
 * Hello world!
 */
class App {
    companion object {



    }
}

fun main(args: Array<String>) {
    val hz: HazelcastInstance  = Hazelcast.getOrCreateHazelcastInstance(Config( "default" ))
    System.out.println("Hello World!")
    System.err.println( hz.toString())
}