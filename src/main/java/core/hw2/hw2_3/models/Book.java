package core.hw2.hw2_3.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book extends Papyrus {
    private String cover;
    private String font;

    public Book(String pageColor, String pageSize, String cover, String font) {
        super(pageColor, pageSize);
        this.cover = cover;
        this.font = font;
    }

}

