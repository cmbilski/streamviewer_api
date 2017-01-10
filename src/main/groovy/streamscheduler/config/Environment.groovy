package streamscheduler.config

/**
 * Created by Cadorn on 11/14/2016.
 */
class Environment {
    static String POSTGRES_HOST = System.getenv('POSTGRES_HOST')
    static String POSTGRES_PORT = System.getenv('POSTGRES_PORT')
    static String POSTGRES_TABLE = System.getenv('POSTGRES_TABLE')
    static String POSTGRES_USER = System.getenv('POSTGRES_USER')
    static String POSTGRES_PASS = System.getenv('POSTGRES_PASS')
}
