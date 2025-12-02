package com.example.coursemgmt2.coursemgmt2.soap;

import courses.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;


@Endpoint
public class CourseDetailEndpoint {


    
    @Autowired
    CourseDetailService Service;
//    method
//    input-> request getcoursedetailrequest
//    output->response getcoursedetailresponse


//    from this namespace and the request come
    @PayloadRoot(namespace="http://example.com/courses" ,localPart="GetCourseDetailRequest")
    @ResponsePayload
    public GetCourseDetailResponse getCourseDetail(@RequestPayload GetCourseDetailRequest request) {
        GetCourseDetailResponse response = new GetCourseDetailResponse();



        Course course=Service.getCoursebyID(request.getId());
        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setId(course.getId());
        courseDetails.setName(course.getName());
        courseDetails.setDescription(course.getDescription());
        response.setCourseDetails(courseDetails);
        return response;
    }


    @PayloadRoot(namespace="http://example.com/courses", localPart="GetAllCourseDetailRequest")
    @ResponsePayload
    public GetAllCourseDetailResponse getAllCourseDetail(@RequestPayload GetAllCourseDetailRequest request) {
        GetAllCourseDetailResponse response = new GetAllCourseDetailResponse();

        List<Course> coursesList = Service.getCourses();

        for (Course c : coursesList) {
            CourseDetails courseDetails = new CourseDetails();
            courseDetails.setId(c.getId());
            courseDetails.setName(c.getName());
            courseDetails.setDescription(c.getDescription());
            response.getCourseDetails().add(courseDetails); // JAXB list accessor
        }
        return response;
    }

//    delete course
@PayloadRoot(namespace="http://example.com/courses", localPart="DeleteCourseDetailRequest")
@ResponsePayload
public DeleteCourseDetailResponse deleteCourseDetail(@RequestPayload DeleteCourseDetailRequest request) {
    DeleteCourseDetailResponse response = new DeleteCourseDetailResponse();

    // Call your service to delete by ID
    int result = Service.deleteByID(request.getId()); // returns 1 if deleted, 0 if not found
    if (result == 1) {
        response.setMessage("Course with ID " + request.getId() + " deleted successfully.");
    } else {
        response.setMessage("Course with ID " + request.getId() + " not found.");
    }
    return response;
}

}
