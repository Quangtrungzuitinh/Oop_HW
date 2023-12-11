class Individual implements Person {
    private String birthdate;
    private String gender;

    public Individual(String birthdate, String gender) {
        this.birthdate = birthdate;
        this.gender = gender;
    }

    @Override
    public void displayDetails() {
        System.out.println("Birthdate: " + birthdate + ", Gender: " + gender);
    }
}