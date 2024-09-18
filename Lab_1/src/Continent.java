import java.util.Objects;

public class Continent extends Planet {
    private String m_continentName;


    public Continent(String continentName, Planet planet) {
        super(planet.m_planetName, planet.m_amountContinents);
        m_continentName = continentName;
    }


    public Continent getContinent() {
        return this;
    }


    public void setContinent(Continent continent) {
        super.setPlanet(continent.getPlanet());
        m_continentName = continent.m_continentName;
    }


    public void showInfo() {
        super.showInfo();
        System.out.println("Континент: " + m_continentName);
    }


    @Override
    public int hashCode() {
        int result = m_planetName.hashCode();
        result = 31 * result + m_amountContinents;
        result += m_continentName.hashCode();
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return m_continentName == continent.m_continentName && super.equals(continent.getPlanet());
    }
}
