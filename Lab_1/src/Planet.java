public class Planet {
    protected String m_planetName;
    protected int m_amountContinents;


    public Planet(String name, int amountContinents) {
        m_planetName = name;
        m_amountContinents = amountContinents;
    }


    public Planet getPlanet() {
        return this;
    }


    public void setPlanet(Planet planet) {
        this.m_planetName = planet.m_planetName;
        this.m_amountContinents = planet.m_amountContinents;
    }


    public void showInfo() {
        System.out.println("Планета: " + m_planetName);
        System.out.println("Кол-во материков: " + m_amountContinents);
    }


    @Override
    public int hashCode() {
        int result = m_planetName.hashCode();
        result = 31 * result + m_amountContinents;
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;


        return ( (m_planetName == planet.m_planetName) && (m_amountContinents == planet.m_amountContinents) );
    }

}
