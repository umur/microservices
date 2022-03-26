package circuitbreaker.service.impl;

import circuitbreaker.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CircuitBreakerFactory circuitBreakerFactory;

    @Override
    public String getComment() {
        RestTemplate restTemplate = new RestTemplate();

        CircuitBreaker circuitBreaker = circuitBreakerFactory.create("circuitbreaker");
        String url = "https://jsonplaceholder.typicode.com/posts/1/comments";

        return circuitBreaker.run(() -> restTemplate.getForObject(url, String.class),
                throwable -> getDefaultComment());
    }

    private String getDefaultComment() {
        return "Return default comments !!!";
    }
}
