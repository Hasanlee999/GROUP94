package seminarstudent;

public class University {

    int uniId;

    public int getUniId() {
        return uniId;
    }

    public void setUniId(int uniId) {
        this.uniId = uniId;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    String uniName;
    City city;

    @Override
    public String toString() {
        return "University{" +
                "uniId=" + uniId +
                ", uniName='" + uniName + '\'' +
                ", city=" + city +
                '}';
    }
}
