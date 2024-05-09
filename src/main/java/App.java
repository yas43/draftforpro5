//import Services.PersonsServices;

import DTO.HabitantsParAdresse;
import DTO.NumérosTéléphoneParCaserne;
import Reader.JsonReaderFile;
import Services.EnfantsHabitantsLesAdressesServices;
import Services.HabitantsParAdressService;
import Services.NumérosTelephoneParCaserneService;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        HabitantsParAdressService habitantsParAdressService = new HabitantsParAdressService();
        String adress = "1509 Culver St";
        System.out.println(  habitantsParAdressService.personaddress(adress));
    }
}
