package streamscheduler.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import streamscheduler.dao.PostgresDAO
import streamscheduler.dao.StreamScheduleDAO
import streamscheduler.models.StreamSchedule
import streamscheduler.models.requests.CurrentChannelRequest
import streamscheduler.models.responses.CurrentChannelResponse
import org.springframework.stereotype.Component

/**
 * Created by Cadorn on 11/10/2016.
 */
@Component
class StreamSchedulerService {

    @Autowired
    StreamScheduleDAO dao

    public CurrentChannelResponse getCurrentChannel(CurrentChannelRequest request) {
        StreamSchedule schedule = dao.getStreamSchedule(request.scheduleName)
        return new CurrentChannelResponse(request.scheduleName + '_channel')
    }

}
