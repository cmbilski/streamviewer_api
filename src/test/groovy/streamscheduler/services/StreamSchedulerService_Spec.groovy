package streamscheduler.services

import streamscheduler.dao.StreamScheduleDAO
import streamscheduler.models.requests.CurrentChannelRequest
import streamscheduler.models.responses.CurrentChannelResponse
import streamscheduler.models.StreamSchedule
import spock.lang.*

/**
 * Created by Cadorn on 11/10/2016.
 */
class StreamSchedulerService_Spec extends Specification {
    StreamSchedulerService service
    StreamScheduleDAO dao

    def setup() {
        service = new StreamSchedulerService()
        dao = Mock(StreamScheduleDAO)
        service.dao = dao
    }

    def "Service returns schedule name with channel appended" () {
        when:
        CurrentChannelRequest req = new CurrentChannelRequest('cadorn')
        CurrentChannelResponse response = service.getCurrentChannel(req)
        then:
        1 * dao.getStreamSchedule('cadorn') >> new StreamSchedule()
        assert response.channelName.equals('cadorn_channel')
    }
}
