
package courses;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the courses package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: courses
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCourseDetailRequest }
     * 
     */
    public GetCourseDetailRequest createGetCourseDetailRequest() {
        return new GetCourseDetailRequest();
    }

    /**
     * Create an instance of {@link GetCourseDetailResponse }
     * 
     */
    public GetCourseDetailResponse createGetCourseDetailResponse() {
        return new GetCourseDetailResponse();
    }

    /**
     * Create an instance of {@link CourseDetails }
     * 
     */
    public CourseDetails createCourseDetails() {
        return new CourseDetails();
    }

    /**
     * Create an instance of {@link DeleteCourseDetailRequest }
     * 
     */
    public DeleteCourseDetailRequest createDeleteCourseDetailRequest() {
        return new DeleteCourseDetailRequest();
    }

    /**
     * Create an instance of {@link DeleteCourseDetailResponse }
     * 
     */
    public DeleteCourseDetailResponse createDeleteCourseDetailResponse() {
        return new DeleteCourseDetailResponse();
    }

    /**
     * Create an instance of {@link GetAllCourseDetailRequest }
     * 
     */
    public GetAllCourseDetailRequest createGetAllCourseDetailRequest() {
        return new GetAllCourseDetailRequest();
    }

    /**
     * Create an instance of {@link GetAllCourseDetailResponse }
     * 
     */
    public GetAllCourseDetailResponse createGetAllCourseDetailResponse() {
        return new GetAllCourseDetailResponse();
    }

}
