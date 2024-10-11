public class Offerings {
    private List<Registration> registrations;

    public Offerings() {
        this.registrations = new ArrayList<Registration>();
    }

    public void make(Student s, Course c) {
        Registration r = new Registration(s, c);
        this.registrations.add(r);
    }
}