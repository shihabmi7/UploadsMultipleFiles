package org.snowcorp.sample.uploadfiles;

import com.google.gson.annotations.SerializedName;

public class AddOrcefResponse {
    @SerializedName("fileUrl")
    private String fileUrl;

    @SerializedName("message")
    private String message;

    @SerializedName("status")
    private String status;

    @SerializedName("token")
    private String token;

    public void setFileUrl(String fileUrl){
        this.fileUrl = fileUrl;
    }

    public String getFileUrl(){
        return fileUrl;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    public void setToken(String token){
        this.token = token;
    }

    public String getToken(){
        return token;
    }
}
