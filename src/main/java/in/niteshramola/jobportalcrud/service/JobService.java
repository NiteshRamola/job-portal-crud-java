package in.niteshramola.jobportalcrud.service;

import in.niteshramola.jobportalcrud.model.JobPost;
import in.niteshramola.jobportalcrud.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<JobPost> getAllJobs(){
        return jobRepository.findAll();
//        return jobRepository.getAllJobs();
    }

    public void addJobPost(JobPost jobPost){
        jobRepository.save(jobPost);
//        jobRepository.addJob(jobPost);
    }

    public JobPost getJobById(int id) {
        return jobRepository.findById(id).orElse(new JobPost());
//        return jobRepository.getJobById(id);
    }

    public void updateJobPost(JobPost jobPost) {
        jobRepository.save(jobPost);
//        jobRepository.updateJobPost(jobPost);
    }

    public void deleteJobById(int id) {
        jobRepository.deleteById(id);
//        jobRepository.deleteJobById(id);
    }

    public List<JobPost> searchJobByKeyword(String keyword) {
       return jobRepository.findByPostProfileContainingIgnoreCaseOrPostDescContainingIgnoreCase(keyword, keyword);
    }
}
