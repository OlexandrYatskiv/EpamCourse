public class Student extends Human  {
    private String education;
    int course;


    Student(String name, String surname, int age, int weight, int height, String education, int course) {
        super(name, surname, age, weight, height);
        this.education = education;
        this.course = course;
    }

    public void setEducation(String education){
        this.education = education;
    }
    public String getEducation()
    {
        return education;
    }
    public void setCourse(int course)
    {
        this.course = course;
    }
    public int getCourse()
    {
        return course;
    }
    @Override
    public String toString() {
        return super.toString()+ "\neducation: " + education + "\ncouse: " + course;
    }

}
