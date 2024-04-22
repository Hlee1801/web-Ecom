package com.Hlee.osahaneat.service.impl;

import com.Hlee.osahaneat.dto.CategoryDTO;
import com.Hlee.osahaneat.dto.RestaurantDTO;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
import java.util.List;

public interface RestaurantServiceImpl {
    boolean insertRestaurant(MultipartFile multipartFile, String  title, String  subtitle
            , String  description, boolean is_freeship
            , String   address, String openDate) throws ParseException;
    List<RestaurantDTO> getAllRestaurant();
    RestaurantDTO getDetailRestaurant(int id);
}
