//import Services.PersonsServices;

import Models.Person;

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


//        CommunityEmailServices communityEmailServices = new CommunityEmailServices();
//        System.out.println(communityEmailServices.communityEmail("Culver"));


//        JsonReaderFile jsonReaderFile = new JsonReaderFile();






//        System.out.println(arrNode);
//        for(int i=0;i<jsonReaderFile.JsonReaderFilePerson().size();i++) {
//            ObjectNode objectNode = jsonReaderFile.JsonReaderFilePerson().path(i).deepCopy();
//            if (jsonReaderFile.JsonReaderFilePerson().path(i).path("firstName").asText().equals("John")){
//                objectNode.put("email","ykeshtdar@yahoo.com");
//
////                objectNode.set("ali","mamali","1 ue condat","clorado","1234","235689741","zizigolo@yahoo.com");
//                objectNode.remove("lastName");
//                objectNode.putObject("age");
//                objectNode.putArray("serialNumber");
//
//
//                ObjectMapper mapper = new ObjectMapper();
//                String json = mapper.writeValueAsString(objectNode);
//                JsonNode jsonNode = mapper.readTree(json);
//                System.out.println(jsonNode);
//            }

//            System.out.println(objectNode);

//        }

        Person person = new Person("ali","keshtdar","4th aryashahr","teheran","14567","44126190","akeshtadr@yahoo.com");
//        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString(object);
//        JsonNode jsonNode = mapper.readTree(json);

//        JsonNode node = mapper.valueToTree(person);


//        for(int i=0;i<jsonReaderFile.JsonReaderFilePerson().size();i++) {
//            ObjectNode objectNode = jsonReaderFile.JsonReaderFilePerson().path(i).deepCopy();
//            objectNode.putObject(person.toString());
//            ObjectMapper mapper = new ObjectMapper();
//            String json = mapper.writeValueAsString(objectNode);
//            JsonNode newjsonNodeperson = mapper.readTree(json);
//        }


    }
}
