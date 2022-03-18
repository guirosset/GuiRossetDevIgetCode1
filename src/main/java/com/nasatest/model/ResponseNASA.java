package com.nasatest.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author guirosset
 * @created/modified on 03/17/2022
 */
@Getter
@Setter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Accessors(fluent = true)
public class ResponseNASA {

    @JsonProperty("photos")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public Photo[] photos;

}
