/**
 * SAP HANA connection parameters.
 *
 * @author Stefan Uhrig, SAP SE
 */
public class HanaConnectionParameters {

    /**
     * SAP HANA connection parameters constructor.
     *
     * @param host The database host.
     * @param instance The database instance.
     * @param database The name of the tenant database. Set to null or empty string if the database
     *     is a single-container system. Set to SYSTEMDB to connect to the system database of a
     *     multi-container system.
     */
    public HanaConnectionParameters(String host, int instance, String database,int port) {
        super();
        this.host = host;
        this.instance = instance;
        this.database = database;
        this.port = port;
    }

    private String host;

    private Integer  instance;

    private String database;

    private Integer port;

    public String getHost() {
        return host;
    }

    public Integer getInstance() {
        return instance;
    }

    public String getDatabase() {
        return database;
    }

    public Integer getPort() {
        return this.port;
    }
    /**
     * Builds a JDBC connection URL.
     *
     * @return Returns the JDBC connection URL corresponding to these parameters.
     */
    public String buildUrl() {

         String url = "jdbc:sap://" + this.host + ":" + this.port;
         return url;

    }
}