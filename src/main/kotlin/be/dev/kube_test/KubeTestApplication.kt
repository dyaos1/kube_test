package be.dev.kube_test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KubeTestApplication

fun main(args: Array<String>) {
    runApplication<KubeTestApplication>(*args)
}
