package net.rwhps.server.plugin.beta.httpapi.handlers.get

import net.rwhps.server.net.http.AcceptWeb
import net.rwhps.server.net.http.SendWeb
import net.rwhps.server.plugin.beta.httpapi.handlers.BaseGetHandler
import net.rwhps.server.plugin.beta.httpapi.responses.AboutResp
import net.rwhps.server.plugin.beta.httpapi.responses.BaseResp
import net.rwhps.server.util.inline.toPrettyPrintingJson

class AboutHandler : BaseGetHandler() {
    override fun get(accept: AcceptWeb, send: SendWeb) {
        super.get(accept, send)
        send(send,BaseResp(data = AboutResp()).toPrettyPrintingJson())
    }
}