package streamscheduler.dao

import org.springframework.stereotype.Component
import groovy.sql.Sql
import streamscheduler.models.StreamSchedule
import streamscheduler.config.Environment

/**
 * Created by Cadorn on 11/14/2016.
 */
@Component
class PostgresDAO implements StreamScheduleDAO {

    String postgresURL

    public PostgresDAO() {
        postgresURL = "jdbc:postgresql://$Environment.POSTGRES_HOST:$Environment.POSTGRES_PORT/$Environment.POSTGRES_TABLE"
        def sql = Sql.newInstance(postgresURL, Environment.POSTGRES_USER, Environment.POSTGRES_PASS, "org.postgresql.Driver")

        sql.execute("create table if not exists entries(scheduleName text, streamName text, startTime time, endTime time, primary key(scheduleName, streamName));")
    }

    @Override
    StreamSchedule getStreamSchedule(String channelName) {
        println("Request for $channelName")
        return null
    }

}
