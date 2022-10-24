package org.launchcode.techjobs.oo;


import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    public Job() {
        id = nextId;
        nextId++;
    }
    private String name;




    public int getId() {

        return id;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Employer getEmployer() {

        return employer;
    }

    public void setEmployer(Employer employer) {

        this.employer = employer;
    }

    public Location getLocation() {

        return location;
    }

    public void setLocation(Location location) {

        this.location = location;
    }

    public PositionType getPositionType() {

        return positionType;
    }

    public void setPositionType(PositionType positionType) {

        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {

        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {

        this.coreCompetency = coreCompetency;
    }

    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;





    public Job (String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {

        this();
        name = aName;
        employer = aEmployer;
        location = aLocation;
        positionType = aPositionType;
        coreCompetency = aCoreCompetency;
    }

        public String toString(){
        String employerString = employer.toString();
        if(Objects.equals(employerString, "")){
            employerString = "Data not available";
        }

        String locationString = location.toString();
            if(Objects.equals(locationString, "")){
                locationString = "Data not available";
            }
        String positionTypeString = positionType.toString();
            if(Objects.equals(positionTypeString, "")){
                positionTypeString = "Data not available";
            }
        String coreCompetencyString = coreCompetency.toString();
            if(Objects.equals(coreCompetencyString, "")){
                coreCompetencyString = "Data not available";
            }
        String formattedJobString = new String('\n'+ "ID: "+ getId()+ '\n'+"Name: "+name +'\n' + "Employer: "+employerString +'\n' +"Location: "+ locationString+ '\n' + "Position Type: "+ positionTypeString + '\n' + "Core Competency: "+ coreCompetencyString +'\n');
                return formattedJobString;
    }














    }



    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

