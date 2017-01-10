package streamscheduler.models.requests
/**
 * Created by Cadorn on 11/10/2016.
 */
class CurrentChannelRequest {
    String scheduleName

    public CurrentChannelRequest(String scheduleName) {
        this.scheduleName = scheduleName
    }
}
