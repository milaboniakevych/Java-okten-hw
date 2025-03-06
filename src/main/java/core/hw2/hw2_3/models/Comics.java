package core.hw2.hw2_3.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)

    public class Comics extends Book{
        private String title;
        private String author;
        private String numPages;

        public Comics(String pageColor, String pageSize, String cover, String font, String title, String author, String numPages) {
            super(pageColor, pageSize, cover, font);
            this.title = title;
            this.author = author;
            this.numPages = numPages;
        }

    }


