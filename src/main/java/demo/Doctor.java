package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

    private String qualification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist() {
        System.out.println("Doctor is assisting");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean name method is called");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct method is called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("This is from pre-destroy method");
    }
}
