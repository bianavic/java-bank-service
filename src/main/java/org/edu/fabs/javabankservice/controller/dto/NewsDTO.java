package org.edu.fabs.javabankservice.controller.dto;

import org.edu.fabs.javabankservice.domain.model.News;

public record NewsDTO(String icon, String description) {

    public NewsDTO(News model) {
        this(model.getIcon(), model.getDescription());
    }

    public News toModel() {
        News model = new News();
        model.setIcon(this.icon);
        model.setDescription(this.description);
        return model;
    }

}
