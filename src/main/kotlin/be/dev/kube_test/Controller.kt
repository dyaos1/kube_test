package be.dev.kube_test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    private val service: Service
) {
    @GetMapping("/{url}")
    fun home(@PathVariable("url") url: String): String {
        return service.get(url)
    }

    @PostMapping("/")
    fun post(@RequestBody request: Map<String, String>): Map<String, String> {
        return service.post(request)
    }
}