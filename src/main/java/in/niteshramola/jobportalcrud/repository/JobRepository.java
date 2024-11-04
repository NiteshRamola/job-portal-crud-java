package in.niteshramola.jobportalcrud.repository;

import in.niteshramola.jobportalcrud.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {
    List<JobPost> findByPostProfileContainingIgnoreCaseOrPostDescContainingIgnoreCase(String postProfile, String postDesc);

}

// Before Spring Data JPA

//@Repository
//public class JobRepository {
//    List<JobPost> jobPosts = new ArrayList<>();
//
//    public JobRepository() {
//        // Java Developer Job Post
//        jobPosts.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));
//
//        // Frontend Developer Job Post
//        jobPosts.add(
//                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
//                        3, List.of("HTML", "CSS", "JavaScript", "React")));
//
//        // Data Scientist Job Post
//        jobPosts.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//                List.of("Python", "Machine Learning", "Data Analysis")));
//
//        // Network Engineer Job Post
//        jobPosts.add(new JobPost(4, "Network Engineer",
//                "Design and implement computer networks for efficient data communication", 5,
//                List.of("Networking", "Cisco", "Routing", "Switching")));
//
//        // Mobile App Developer Job Post
//        jobPosts.add(new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
//                        3, List.of("iOS Development", "Android Development", "Mobile App")));
//
//    }
//
//    public List<JobPost> getAllJobs() {
//        return  jobPosts;
//    }
//
//    public void addJob(JobPost job) {
//        jobPosts.add(job);
//    }
//
//    public JobPost getJobById(int id) {
//        for (JobPost job : jobPosts) {
//            if(job.getPostId() == id){
//                return job;
//            }
//        }
//
//        return null;
//    }
//
//    public void updateJobPost(JobPost jobPost) {
//        for(JobPost job : jobPosts){
//            if(job.getPostId() == jobPost.getPostId()){
//                job.setPostDesc(jobPost.getPostDesc());
//                job.setPostProfile(jobPost.getPostProfile());
//                job.setPostTechStack(jobPost.getPostTechStack());
//                job.setReqExperience(jobPost.getReqExperience());
//            }
//        }
//    }
//
//    public void deleteJobById(int id) {
//        jobPosts.remove(getJobById(id));
//    }
//}
