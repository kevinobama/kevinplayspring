package com.kevingates.kevinplayspring.models;

import com.kevingates.kevinplayspring.defineannotation.JsonElement;
import com.kevingates.kevinplayspring.defineannotation.JsonSerializable;
import com.kevingates.kevinplayspring.defineannotation.methodInit;

@JsonSerializable
public class decentraland {

    @JsonElement
    private String tokenId;
    @JsonElement
    private String name;

    @methodInit
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
