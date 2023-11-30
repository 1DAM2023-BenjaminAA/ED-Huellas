import java.util.ArrayList;

public class Adoption {

    private Integer IdAdoption;
    public String adoptionDate;

    private ArrayList<Pets>adopcionPets = new ArrayList<>();
    private ArrayList<Person>personAdop = new ArrayList<>();


    public Integer getIdAdoption() {
        return IdAdoption;
    }

    public void setIdAdoption(Integer idAdoption) {
        IdAdoption = idAdoption;
    }

    public String getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(String adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public ArrayList<Pets> getAdopcionPets() {
        return adopcionPets;
    }

    public void setAdopcionPets(ArrayList<Pets> adopcionPets) {
        this.adopcionPets = adopcionPets;
    }

    public ArrayList<Person> getPersonAdop() {
        return personAdop;
    }

    public void setPersonAdop(ArrayList<Person> personAdop) {
        this.personAdop = personAdop;
    }

    public void addPets(Pets pets){
        adopcionPets.add(pets);
    }

    public Pets getPets(Integer posicion){

        return adopcionPets.get(posicion);
    }

    public void addPerson(Person person){
        personAdop.add(person);
    }

    public Person getPerson(Integer posicion){
        return personAdop.get(posicion);
    }
}
