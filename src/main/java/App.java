//import Services.PersonsServices;

import DTO.HabitantsParAdresse;
import DTO.NumérosTéléphoneParCaserne;
import Reader.JsonReaderFile;
import Services.*;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

//        HabitantsParAdressService habitantsParAdressService = new HabitantsParAdressService();
//        String adress = "1509 Culver St";
//        System.out.println(  habitantsParAdressService.personaddress(adress));


//        AdressParCasernServices adressParCasernServices = new AdressParCasernServices();
//        System.out.println( adressParCasernServices.addresseesForFireStation(2));


//        PersonInfoServices personInfoServices = new PersonInfoServices();
//        System.out.println( personInfoServices.personInfo("Sophia","Zemicks"));


        CommunityEmailServices communityEmailServices = new CommunityEmailServices();
        System.out.println(communityEmailServices.communityEmail("Culver"));
    }
}
