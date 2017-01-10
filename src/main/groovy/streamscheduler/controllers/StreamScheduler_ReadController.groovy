package streamscheduler.controllers

import streamscheduler.models.requests.CurrentChannelRequest
import streamscheduler.models.responses.CurrentChannelResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import streamscheduler.services.StreamSchedulerService;

@RestController
public class StreamScheduler_ReadController {

    @Autowired
    StreamSchedulerService service

    @RequestMapping(value = "/{scheduleName}", method = RequestMethod.GET)
    public CurrentChannelResponse getCurrentChannel(@PathVariable(value='scheduleName', required=true) scheduleName) {
        return service.getCurrentChannel(new CurrentChannelRequest(scheduleName))
    }

}