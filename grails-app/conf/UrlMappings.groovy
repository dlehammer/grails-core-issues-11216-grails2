import groovy.util.logging.Log4j

@Log4j
class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(redirect: [controller: "first", action: "index"])
        "500"(view:'/error')
        "403"(controller: "second", action: "showError")

        log.info("URL-mappings loaded")
	}
}
