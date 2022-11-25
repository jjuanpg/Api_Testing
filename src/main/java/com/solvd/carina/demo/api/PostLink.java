package com.solvd.carina.demo.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/v4/shorten", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/bitly/post/rq.json")
@ResponseTemplatePath(path = "api/bitly/post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
public class PostLink extends AbstractApiMethodV2 {

    public PostLink (){
        setHeaders("Authorization=Bearer f760f98a301586115dd5a9fa30563cd73a30cb31", "Content-Type=application/json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
