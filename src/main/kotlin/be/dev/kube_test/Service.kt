package be.dev.kube_test

import org.springframework.stereotype.Service

@Service
class Service {
    fun get(url: String): String {
        return "path variable you input is : $url"
    }

    fun post(request: Map<String, String>): Map<String, String> {
        return mapOf( request.values.first() to request.keys.first() )
    }
}