package com.which.apisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author which
 */
@Data
@Accessors(chain = true)
public class HoroscopeParams implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 十二星座对应英文小写，aries, taurus, gemini, cancer, leo, virgo, libra, scorpio, sagittarius, capricorn, aquarius, pisces
     */
    private String type;
    /**
     * 十二星座对应英文小写，aries, taurus, gemini, cancer, leo, virgo, libra, scorpio, sagittarius, capricorn, aquarius, pisces
     */
    private String time;
}
