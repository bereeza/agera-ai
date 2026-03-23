package org.agera.ai.api;

import lombok.RequiredArgsConstructor;
import org.agera.ai.model.UserRequest;
import org.agera.ai.service.AgentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class AgentController implements AgentAPI {

    private final AgentService agent;

    @Override
    public Flux<String> chat(@RequestBody UserRequest req) {
        return agent.chat(req.getRequest());
    }
}
