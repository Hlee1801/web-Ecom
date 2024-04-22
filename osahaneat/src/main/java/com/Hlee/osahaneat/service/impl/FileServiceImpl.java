package com.Hlee.osahaneat.service.impl;

import jakarta.annotation.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileServiceImpl {
    public boolean saveFile(MultipartFile file);
    public Resource loadFile(String fileName);
}
