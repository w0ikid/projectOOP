package CourseService.LessonService;

import CourseService.LessonType;

public class Lesson {
    
    private String lessonName;
    private LessonType lessonType;
    
    public String getLessonName() {
        return this.lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public LessonType getLessonType() {
        return this.lessonType;
    }
    
    public void setLessonType(LessonType lessonType) {
        this.lessonType = lessonType;
    }
}
