package membershipt.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import membershipt.config.kafka.KafkaProcessor;
import membershipt.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PointUseHistoryViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private PointUseHistoryRepository pointUseHistoryRepository;
    //>>> DDD / CQRS
}
