package edu.greenriver.sdev.morespringproj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class House
{
    //this field, if included in a constructor, must be a spring bean
    private BookShelf shelf;

}

