package grayherring.starwarsfilmdata.networking;

import grayherring.starwarsfilmdata.modle.PagedData;
import grayherring.starwarsfilmdata.modle.People;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by David on 8/10/2015.
 */
public interface SWInterface {

    @GET("/")
    public void getRootUrls();

    @GET("/people/")
    public PagedData<People> getAllPeople(@Query("page") int page);

    @GET("/people/{id}/")
    public  People getPeople(@Path("id") int peopleId);

    @GET("/films/")
    public void getAllFilms(@Query("page") int page);

    @GET("/films/{id}/")
    public void getFilm(@Path("id") int filmId);

    @GET("/starships")
    public void getAllStarships(@Query("page") int page);

    @GET("/starships/{id}/")
    public void getStarship(@Path("id") int starshipId);

    @GET("/vehicles/")
    public void getAllVehicles(@Query("page") int page);

    @GET("/vehicles/{id}/")
    public void getVehicle(@Path("id") int vehicleId);

    @GET("/species/")
    public void getAllSpecies(@Query("page") int page);

    @GET("/species/{id}/")
    public void getSpecies(@Path("id") int speciesId);

    @GET("/planets/")
    public void getAllPlanets(@Query("page") int page);

    @GET("/planets/{id}/")
    public void getPlanet(@Path("id") int planetId);
    
}
