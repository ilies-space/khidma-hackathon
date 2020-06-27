package com.hackathon.khidma27;

import java.io.Serializable;

public class CraftManModel  implements Serializable {

    int profilePic;
    String name ;
    String jobTitle;
    int evaluation ;
    String distances;


    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    public String getDistances() {
        return distances;
    }

    public void setDistances(String distances) {
        this.distances = distances;
    }

    public CraftManModel(int profilePic, String name, String jobTitle, int evaluation, String distances) {
        this.profilePic = profilePic;
        this.name = name;
        this.jobTitle = jobTitle;
        this.evaluation = evaluation;
        this.distances = distances;
    }
}
