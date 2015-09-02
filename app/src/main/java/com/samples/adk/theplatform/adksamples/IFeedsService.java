package com.samples.adk.theplatform.adksamples;

import java.util.List;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by john.williams on 9/1/2015.
 */
public interface IFeedsService {
        @GET("{url}")
        List<Feed> feeds(@Path("url")String url);

}
