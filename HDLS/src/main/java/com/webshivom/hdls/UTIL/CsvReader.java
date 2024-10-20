package com.webshivom.hdls.UTIL;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.webshivom.hdls.models.User;
import lombok.NoArgsConstructor;
import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public final class CsvReader {
    public static List<User> readCsv(String filePath) throws FileNotFoundException {
        List<User> users = new ArrayList<User>();

        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            String[] values;
            // Skip the header row
            csvReader.readNext();

            while ((values = csvReader.readNext()) != null) {
                User user = new User().builder()
                        .userId(values[0])
                        .firstName(values[1])
                        .lastName(values[2])
                        .sex(values[3])
                        .email(values[4]).phone(values[5]).dateOfBirth(values[6]).jobTitle(values[7]).build();

                users.add(user);
            }
        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException(e);
        }

        return users;
    }
}
