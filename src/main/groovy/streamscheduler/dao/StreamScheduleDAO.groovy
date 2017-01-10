package streamscheduler.dao

import org.springframework.stereotype.Component
import streamscheduler.models.StreamSchedule

/**
 * Created by Cadorn on 11/14/2016.
 */
@Component
interface StreamScheduleDAO {

    StreamSchedule getStreamSchedule(String channelName);

}