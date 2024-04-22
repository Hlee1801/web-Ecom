package com.Hlee.osahaneat.dto;

import java.util.Date;
import java.util.List;

public class RestaurantDTO {
    private String title, subtitle,image;
    private int id;
    private boolean isFreeship;
    private Date openDate;
    private List<CategoryDTO> listCategoryDTO;
    private String desc;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFreeship() {
        return isFreeship;
    }

    public void setFreeship(boolean freeship) {
        isFreeship = freeship;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public List<CategoryDTO> getListCategoryDTO() {
        return listCategoryDTO;
    }

    public void setListCategoryDTO(List<CategoryDTO> listCategoryDTO) {
        this.listCategoryDTO = listCategoryDTO;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
