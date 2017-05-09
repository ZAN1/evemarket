package dk.tv2.evemarket1.Interface;

import dk.tv2.evemarket1.Holders.HeadGroup;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by cfr on 09-05-2017.
 */

public interface GetQuery {

@GET("/market/groups/")
    Call<HeadGroup> HeadMidListCall();


}
