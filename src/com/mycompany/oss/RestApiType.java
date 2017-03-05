package com.mycompany.oss;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public enum RestApiType
{
    // fixed the enum issue to move the PTS-199
    // add one line in another repo -- the OSS repo
    REST_API_TYPE_UNKNOWN(0, "Unknown"),
    REST_API_TYPE_POST(1,"Post"),
    REST_API_TYPE_GET(2,"Get"),
    REST_API_TYPE_PUT(3, "Put"),
    REST_API_TYPE_DELETE(4,"Delete");

    // add one line here
    private int index;
    private String name;

    // add one more line to move it further
    // add one line in RestApiType to move the feature-1

    RestApiType(int index, String name)
    {
        this.index = index;
        this.name = name;
    }

    // add B1 to move the master branch
    public int getIndex()
    {
        return index;
    }

    public String getName()
    {
        return name;
    }
}
