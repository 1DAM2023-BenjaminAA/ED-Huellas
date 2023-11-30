import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){

        ArrayList<Dog>dogs = new ArrayList<>();
        Dog dog1 = new Dog();
        dog1.setId(1);
        dog1.setName(" RaphJun ");
        dog1.setDateOfBirth(" 30/06/2021 ");
        dog1.setFriendly(" amistoso ");

        Dog dog2 = new Dog();
        dog2.setId(2);
        dog2.setName(" Apolo ");
        dog2.setDateOfBirth(" 21/04/2022 ");
        dog2.setFriendly(" amistoso ");

        Dog dog3 = new Dog();
        dog3.setId(3);
        dog3.setName(" Cervero ");
        dog3.setDateOfBirth(" 18/2/2022 ");
        dog3.setFriendly(" antisocial ");

        Dog dog4 = new Dog();
        dog4.setId(4);
        dog4.setName(" Mosdicos");
        dog4.setDateOfBirth(" 10/06/2022 ");
        dog4.setFriendly(" amistoso ");



        ArrayList<Cat>cats = new ArrayList<>();
        Cat cat1 = new Cat();
        cat1.setId(11);
        cat1.setName(" Abogato ");
        cat1.setDateOfBirth(" 01/06/2020 ");
        cat1.setFelineLeukemiaV(" no padece de leucemia(gato sano) ");

        Cat cat2 = new Cat();
        cat2.setId(12);
        cat2.setName(" Lucifer ");
        cat2.setDateOfBirth(" 02/07/2020 ");
        cat2.setFelineLeukemiaV("no padede de leucemia(gato sano) ");

        Cat cat3 = new Cat();
        cat3.setId(13);
        cat3.setName(" Rasguños ");
        cat3.setDateOfBirth(" 22/02/2019");
        cat3.setFelineLeukemiaV(" padece de leucemia ");

        Cat cat4 = new Cat();
        cat4.setId(14);
        cat4.setName(" Orion ");
        cat4.setDateOfBirth(" 05/02/2022 ");
        cat4.setFelineLeukemiaV(" no padece de leucemia(gato sano)");

        Cat cat5 = new Cat();
        cat5.setId(15);
        cat5.setName(" Doritos ");
        cat5.setDateOfBirth(" 15/12/2019 ");
        cat5.setFelineLeukemiaV(" con leucemia ");


        Person person1 = new Person();
        person1.setIdPerson(1);
        person1.setName(" Marco ");
        person1.setSurname(" Velasquez R. ");
        person1.setDni("1231231A");
        person1.setTelephone("636344343");

        Person person2 = new Person();
        person2.setIdPerson(2);
        person2.setName(" Jose ");
        person2.setSurname(" Herrera G.");
        person2.setDni("2231231B");
        person2.setTelephone("636344344");

        Person person3 = new Person();
        person3.setIdPerson(3);
        person3.setName(" Miriam ");
        person3.setSurname(" Hernandez L.");
        person3.setDni("3231231C");
        person3.setTelephone("636344345");

        Person person4 = new Person();
        person4.setIdPerson(4);
        person4.setName(" Tadeo ");
        person4.setSurname(" Rioz Ch. ");
        person4.setDni("4231231D");
        person4.setTelephone("636344346");



        Adoption adoption1 = new Adoption();
        adoption1.setIdAdoption(111);
        adoption1.setAdoptionDate("30/03/2023");
        adoption1.addPets(cat4);
        adoption1.addPerson(person2);


        Adoption adoption2 = new Adoption();
        adoption2.setIdAdoption(112);
        adoption2.setAdoptionDate("30/03/2023");
        adoption2.addPets(dog1);
        adoption2.addPerson(person1);

        Adoption adoption3 = new Adoption();
        adoption3.setIdAdoption(113);
        adoption3.setAdoptionDate("30/03/2023");
        adoption3.addPets(dog2);
        adoption3.addPerson(person3);

        Adoption adoption4 = new Adoption();
        adoption4.setIdAdoption(114);
        adoption4.setAdoptionDate("30/03/2023");
        adoption4.addPets(cat1);
        adoption4.addPerson(person4);


        System.out.println("======================================PROTECTORA DE ANIMALES [HUELLAS]========================================= \n");
        System.out.println("===========================================MASCOTAS>[PERROS]========================================= \n"
                + "Perros[001] "
                + "----------CODIGO DE PERRO: " + dog1.getId()
                + "----NOMBRE: " + dog1.getName()
                + "----FECHA DE NACIMIENTO " + dog1.getDateOfBirth()
                + "----SOCIABLE/NOSOCIABLE?: " + dog1.getFriendly() + "----------" );

        System.out.println(
                  "Perros[002]"
                 + "----------CODIGO DE PERRO: " + dog2.getId()
                 + "----NOMBRE: " + dog2.getName()
                 + "----FECHA DE NACIMIENTO: " + dog2.getDateOfBirth()
                 + "----SOCIABLE/NO SOCIABLE?: " + dog2.getFriendly() + "----------");

        System.out.println(
                "Perros[003]"
                        + "----------CODIGO DE PERRO: " + dog3.getId()
                        + "----NOMBRE: " + dog3.getName()
                        + "----FECHA DE NACIMIENTO: " + dog3.getDateOfBirth()
                        + "----SOCIABLE/NO SOCIABLE?: " + dog3.getFriendly() + "----------");

        System.out.println(
                "Perros[004]"
                        + "----------CODIGO DE PERRO: " + dog4.getId()
                        + "----NOMBRE: " + dog4.getName()
                        + "----FECHA DE NACIMIENTO: " + dog4.getDateOfBirth()
                        + "----SOCIABLE/NO SOCIABLE?: " + dog4.getFriendly() + "----------");


        System.out.println("==========================================MASCOTAS>[GATOS]========================================= \n"
                        + "Gatos[001] "
                        + "----------CODIGO DE GATO: " + cat1.getId()
                        + "----NOMBRE: " + cat1.getName()
                        + "----FECHA DE NACIMIENTO " + cat1.getDateOfBirth()
                        + "----ENFERMEDADES virus(leucemia?: " + cat1.getFelineLeukemiaV() + "----------" );

        System.out.println(
                "Gatos[002]"
                        + "----------CODIGO DE GATO: " + cat2.getId()
                        + "----NOMBRE: " + cat2.getName()
                        + "----FECHA DE NACIMIENTO: " + cat2.getDateOfBirth()
                        + "----  ENFERMEDADES virus(leucemia)?: " + cat2.getFelineLeukemiaV() + "----------");

        System.out.println(
                "Gatos[003]"
                        + "----------CODIGO DE GATO: " + cat3.getId()
                        + "----NOMBRE: " + cat3.getName()
                        + "----FECHA DE NACIMIENTO: " + cat3.getDateOfBirth()
                        + "----ENFERMEDADES virus(leucemia): " + cat3.getFelineLeukemiaV() + "----------");

        System.out.println(
                "Gatos[004]"
                        + "----------CODIGO DE GATO: " + cat4.getId()
                        + "----NOMBRE: " + cat4.getName()
                        + "----FECHA DE NACIMIENTO: " + cat4.getDateOfBirth()
                        + "----ENFERMEDADES virus(leucemia): " + cat4.getFelineLeukemiaV() + "----------");

        System.out.println(
                "Gatos[005]"
                        + "----------CODIGO DE GATO: " + cat5.getId()
                        + "----NOMBRE: " + cat5.getName()
                        + "----FECHA DE NACIMIENTO: " + cat5.getDateOfBirth()
                        + "----ENFERMEDADES virus(leucemia): " + cat5.getFelineLeukemiaV() + "----------");


        imprimirAdoption1(adoption1);
        imprimirAdoption2(adoption2);
        imprimirAdoption3(adoption3);
        imprimirAdoption4(adoption4);
    }

    public  static  void imprimirAdoption1(Adoption adoption1){

        System.out.println("============================================ANIMALES ADOPTADOS=========================================");
        System.out.println(
                "Adopcion[A1] "
        + "----------CODIGO DE ADOPCION: " + adoption1.getIdAdoption()
        + "-----FECHA DE ADOPCION: " + adoption1.getAdoptionDate()
        + "-----MASCOTA ADOPTADA: " + adoption1.getAdopcionPets()
        + "-----Persona que adopta a la mascota: " + adoption1.getPersonAdop());
    }


    public static void imprimirAdoption2(Adoption adoption2){

        System.out.println(
                "Adopcion[A2] "
                        + "----------CODIGO DE ADOPCION: " + adoption2.getIdAdoption()
                        + "-----FECHA DE ADOPCION: " + adoption2.getAdoptionDate()
                        + "-----MASCOTA ADOPTADA: " + adoption2.getAdopcionPets()
                        + "-----Persona que adopta a la mascota: " + adoption2.getPersonAdop());
    }


    public static void imprimirAdoption3(Adoption adoption3){

        System.out.println(
                "Adopcion[A3] "
                        + "----------CODIGO DE ADOPCION: " + adoption3.getIdAdoption()
                        + "-----FECHA DE ADOPCION: " + adoption3.getAdoptionDate()
                        + "-----MASCOTA ADOPTADA: " + adoption3.getAdopcionPets()
                        + "-----Persona que adopta a la mascota: " + adoption3.getPersonAdop());
    }


    public static void imprimirAdoption4(Adoption adoption4){

        System.out.println(
                "Adopcion[A4] "
                        + "----------CODIGO DE ADOPCION: " + adoption4.getIdAdoption()
                        + "-----FECHA DE ADOPCION: " + adoption4.getAdoptionDate()
                        + "-----MASCOTA ADOPTADA: " + adoption4.getAdopcionPets()
                        + "-----Persona que adopta a la mascota: " + adoption4.getPersonAdop());
    }
}