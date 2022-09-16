import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
    public static void main(String args[]) throws MarkException, CourseException {
        RMITStudent s1 = new RMITStudent("Minh");
        s1.updateCourse("COSC2081", 80);
        s1.updateCourse("INTE2512", 75);
        s1.updateCourse("COSC2081", 83);
        System.out.println(s1);
        s1.updateCourse("COSC2440", 84);
        System.out.println(s1);
        s1.updateCourse("COSC2083", 83);
        //s1.updateCourse("COSC2085", 105);
    }

}
class RMITException extends Exception {
    public RMITException(String str){
        super(str);
    }
}
class CourseException extends RMITException {

    public CourseException(String str) {
        super("Exceptions related to course: " + str);
    }
}
class MarkException extends RMITException {

    public MarkException(String str) {
        super("Exceptions related to mark: " + str);
    }
}
class RMITStudent {
    private String name;
    private Map<String, Integer> marks;

    public RMITStudent(String name) {
        this.name = name;
        this.marks = new HashMap<String, Integer>();
    }

    public void updateCourse(String code, int mark) throws MarkException, CourseException {
        if (mark < 0 || mark > 100){
            throw new MarkException("Invalid mark");
        }
        marks.put(code, mark);
        if (marks.size() > 3) {
            throw new CourseException("Exceed limit");
        }
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        for (String code: marks.keySet()){
            sb.append("\n");
            sb.append(code + ": ");
            sb.append(marks.get(code));
        }
        return sb.toString();
    }
}
