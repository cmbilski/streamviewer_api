package streamscheduler.controllers

import streamscheduler.models.requests.CurrentChannelRequest
import streamscheduler.models.responses.CurrentChannelResponse
import streamscheduler.services.StreamSchedulerService
import spock.lang.Specification

/**
 * Created by Cadorn on 11/10/2016.
 */
class StreamScheduler_ReadController_Spec extends Specification {
    StreamScheduler_ReadController controller
    StreamSchedulerService service

    def setup() {
        controller = new StreamScheduler_ReadController()
        service = Mock(StreamSchedulerService)
        controller.service = service
    }

    def 'Hitting getCurrentChannel endpoint calls service getCurrentChannel method' () {
        when:
        controller.getCurrentChannel('cadorn')

        then:
        1 * service.getCurrentChannel(_ as CurrentChannelRequest) >> new CurrentChannelResponse('cadorn_channel')
    }
}
