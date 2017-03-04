package com.mycompany.oss;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class RESTApi
{
    String name;
    RestApiType restApiType;

    // add line B1 to move the master
    // add one line to RESTApi to move the PTS-199
    public RESTApi(String name, RestApiType restApiType)
    {
        // add line A2 to move the PTS-200
        this.name = name;
        this.restApiType = restApiType;
    }
}
