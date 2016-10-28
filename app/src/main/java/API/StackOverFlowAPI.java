package API;

import Models.StackOverFlowQuestions;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Usman Yaqoob on 10/28/2016.
 */

public interface StackOverFlowAPI {
    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
    Call<StackOverFlowQuestions> loadQuestions(
            @Query("tagged") String tags
    );
}
