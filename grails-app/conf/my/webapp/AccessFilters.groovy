package my.webapp

class AccessFilters {

    def filters = {
        all(controller: "first", action: "*") {
            before = {
                log.info("AccessFilters.before hit!")

                response.sendError(403)

                return false
            }
        }
    }

}
