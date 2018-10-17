package com.zendesk.connect;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.zendesk.connect.Config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConfigProvider {

    /**
     * Config
     * 
     * @param platform  (required) * @param version  (required)
     * @return Call&lt;Config&gt;
     */
    Call<Config> config(String platform, String version);

}
