package grayherring.starwarsfilmdata.networking;

import grayherring.starwarsfilmdata.Constants;
import retrofit.RestAdapter;

/**
 * Created by David on 8/10/2015.
 */
public class StarWarsApiManager {


    private static StarWarsApiManager sInstance;
    private SWInterface mSwApi;

    private StarWarsApiManager() {
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(Constants.BASE_URL)
                .build();
        mSwApi = restAdapter.create(SWInterface.class);
    }

    public StarWarsApiManager getInstance(){
        if (sInstance == null) {
            sInstance = new StarWarsApiManager();
        }
        return sInstance;
    }

    public SWInterface getAPI(){
       return sInstance.mSwApi;
    }
}


