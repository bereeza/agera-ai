package org.agera.ai.api;

import org.agera.ai.model.UserRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

@RequestMapping(path = "/api/v1/chat")
public interface AgentAPI {

    @PostMapping(produces = MediaType.APPLICATION_NDJSON_VALUE)
    Flux<String> chat(@RequestBody UserRequest req);
}
