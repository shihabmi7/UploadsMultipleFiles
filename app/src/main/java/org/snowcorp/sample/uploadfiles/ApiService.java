package org.snowcorp.sample.uploadfiles;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by Akshay Raj on 05/02/18.
 * akshay@snowcorp.org
 * www.snowcorp.org
 */

public interface ApiService {
//    @Multipart
//    @POST("upload.php")
//    Call<ResponseBody> uploadMultiple(
//                    @Part("description") RequestBody description,
//                    @Part("size") RequestBody size,
//                    @Part List<MultipartBody.Part> files);

    @Multipart
    @POST("rxapi/public/api/v1/orCefFormSubmit")
    Call<AddOrcefResponse> uploadMultiple(
            @Part("user_id") RequestBody user_id,
            @Part("token") RequestBody token,
            @Part("n_date") RequestBody n_date,
            @Part List<MultipartBody.Part> file
    );
}
