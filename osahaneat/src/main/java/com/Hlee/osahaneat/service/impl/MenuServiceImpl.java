package com.Hlee.osahaneat.service.impl;

import org.springframework.web.multipart.MultipartFile;

public interface MenuServiceImpl {
    public boolean createMenu(MultipartFile multipartFile,
                              String title,
                              boolean is_freeship,
                              String time_ship,
                              double price,
                              int cate_id);
}
