package in.niteshramola.jobportalcrud.controller;

import in.niteshramola.jobportalcrud.model.JobPost;
import in.niteshramola.jobportalcrud.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/job")
@RestController
public class JobPostController {
    @Autowired
    private JobService jobService;

    @GetMapping("/posts")
    public List<JobPost> getAllJobPosts() {
        return jobService.getAllJobs();
    }

    @GetMapping("/post/{id}")
    public JobPost getJobPostById(@PathVariable int id) {
        return jobService.getJobById(id);
    }

    @PostMapping("/post")
    public JobPost addJobPost(@RequestBody JobPost jobPost) {
        jobService.addJobPost(jobPost);
        return jobService.getJobById(jobPost.getPostId());
    }

    @PutMapping("/post")
    public JobPost updateJobPost(@RequestBody JobPost jobPost) {
        jobService.updateJobPost(jobPost);
        return jobService.getJobById(jobPost.getPostId());
    }

    @DeleteMapping("/post/{id}")
    public void deleteJobPost(@PathVariable int id) {
        jobService.deleteJobById(id);
    }

    @GetMapping("/post/keyword/{keyword}")
    public List<JobPost> searchJobByKeyword(@PathVariable String keyword) {
        return jobService.searchJobByKeyword(keyword);
    }
}
