package com.which.apisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author which
 */
@Data
@Accessors(chain = true)
public class RandomWallpaperParams implements Serializable {
    private static final long serialVersionUID = 1L;
    private String lx;
    private String method;
}
