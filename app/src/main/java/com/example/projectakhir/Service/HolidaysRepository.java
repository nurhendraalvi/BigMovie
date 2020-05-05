package com.example.projectakhir.Service;

import com.example.projectakhir.HolidaysModel.HolidaysResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HolidaysRepository {
    @GET("v1/holidays?api_key=ec599a58-fa97-402b-bb76-544b372ab5cf&country=US&year=2020")
    Call<HolidaysResponse> getHoliday();

}
