package backend.oss;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class RESTApi
{
    String name;
    RestApiType restApiType;

    public RESTApi(String name, RestApiType restApiType)
    {
        this.name = name;
        this.restApiType = restApiType;
    }
}
