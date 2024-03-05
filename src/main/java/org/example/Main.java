package org.example;

import org.example.repository.StudentRepository;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;
public class Main {
    public static void main(String[] args) {

        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.CENTER);
        Table table = new Table(2, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.HEADER_FOOTER_AND_COLUMNS);

        table.addCell("1/",cellStyle);
        System.out.println(table.render());

    }
}