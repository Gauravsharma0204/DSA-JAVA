// Job Search Application SRS Implementation in Java
// This is a simple representation of main functionalities in a Job Search App like LinkedIn

import java.util.*;

// --------------------------- User Classes ---------------------------

// Abstract User class for common properties
abstract class User {
    protected String name;
    protected String email;
    protected String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public abstract void viewProfile();
}

// Job Seeker class
class JobSeeker extends User {
    private List<String> skills = new ArrayList<>();
    private List<Job> appliedJobs = new ArrayList<>();

    public JobSeeker(String name, String email, String password) {
        super(name, email, password);
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void searchJob(List<Job> jobList, String keyword) {
        System.out.println("Searching jobs for keyword: " + keyword);
        for (Job job : jobList) {
            if (job.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(job);
            }
        }
    }

    public void applyJob(Job job) {
        appliedJobs.add(job);
        job.addApplicant(this);
        System.out.println(name + " applied for " + job.getTitle());
    }

    @Override
    public void viewProfile() {
        System.out.println("Job Seeker Profile: " + name + ", Email: " + email + ", Skills: " + skills);
    }
}

// Employer class
class Employer extends User {
    private List<Job> postedJobs = new ArrayList<>();

    public Employer(String name, String email, String password) {
        super(name, email, password);
    }

    public void postJob(Job job) {
        postedJobs.add(job);
        System.out.println("Job Posted: " + job.getTitle());
    }

    public void viewApplicants(Job job) {
        System.out.println("Applicants for " + job.getTitle() + ": " + job.getApplicants());
    }

    @Override
    public void viewProfile() {
        System.out.println("Employer Profile: " + name + ", Email: " + email);
    }
}

// --------------------------- Job Class ---------------------------
class Job {
    private String title;
    private String description;
    private String location;
    private List<JobSeeker> applicants = new ArrayList<>();

    public Job(String title, String description, String location) {
        this.title = title;
        this.description = description;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void addApplicant(JobSeeker seeker) {
        applicants.add(seeker);
    }

    public List<JobSeeker> getApplicants() {
        return applicants;
    }

    @Override
    public String toString() {
        return "Job: " + title + ", Location: " + location + ", Description: " + description;
    }
}

// --------------------------- Main Application ---------------------------
public class JobSearchApp {
    public static void main(String[] args) {
        // Sample Users
        JobSeeker seeker1 = new JobSeeker("Gaurav Kumar", "gaurav@example.com", "pass123");
        seeker1.addSkill("Java");
        seeker1.addSkill("Spring Boot");

        Employer employer1 = new Employer("Tech Corp", "hr@techcorp.com", "admin123");

        // Sample Jobs
        Job job1 = new Job("Java Developer", "Develop enterprise Java applications", "Delhi");
        Job job2 = new Job("Frontend Developer", "ReactJS and UI development", "Mumbai");

        // Employer posts jobs
        employer1.postJob(job1);
        employer1.postJob(job2);

        // Job Seeker searches and applies for jobs
        List<Job> allJobs = Arrays.asList(job1, job2);
        seeker1.searchJob(allJobs, "Java");
        seeker1.applyJob(job1);

        // Employer views applicants
        employer1.viewApplicants(job1);

        // Display profiles
        seeker1.viewProfile();
        employer1.viewProfile();
    }
}
