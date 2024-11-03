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
        return jobRepository.getAllJobs();
    }

    public void addJobPost(JobPost jobPost){
        jobRepository.addJob(jobPost);
    }

    public JobPost getJobById(int id) {
        return jobRepository.getJobById(id);
    }
}
