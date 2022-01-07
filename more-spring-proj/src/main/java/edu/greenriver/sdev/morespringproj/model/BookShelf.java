package edu.greenriver.sdev.morespringproj.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component //<--- this makes a spring bean instance for BookShelf
public class BookShelf
{
    private String material;
    private boolean fullOfBooks;
}
