
    import java.util.TreeMap;
import java.util.TreeSet;

    public class CourseEnrollmentManager {

        private TreeMap<String, TreeSet<String>> courses;

        public CourseEnrollmentManager() {
            courses = new TreeMap<>();
        }

        public void addStudentToCourse(String course, String studentName) {
            courses.putIfAbsent(course, new TreeSet<>());
            courses.get(course).add(studentName);
        }

        public void removeStudentFromCourse(String course, String studentName) {
            if (courses.containsKey(course)) {
                courses.get(course).remove(studentName);

                if (courses.get(course).isEmpty()) {
                    courses.remove(course);
                }
            }
        }

        public boolean isStudentEnrolled(String course, String studentName) {
            return courses.containsKey(course) &&
                    courses.get(course).contains(studentName);
        }

        public void displayCourseRoster(String course) {
            if (!courses.containsKey(course)) {
                System.out.println("Course not found.");
                return;
            }

            for (String student : courses.get(course)) {
                System.out.println(student);
            }
        }

        public static void main(String[] args) {
            CourseEnrollmentManager manager = new CourseEnrollmentManager();

            manager.addStudentToCourse("Java", "Ali");
            manager.addStudentToCourse("Java", "Ahmed");
            manager.addStudentToCourse("Java", "Bilal");
            manager.addStudentToCourse("Python", "Sara");

            manager.displayCourseRoster("Java");

            System.out.println(manager.isStudentEnrolled("Java", "Ali"));

            manager.removeStudentFromCourse("Java", "Ali");

            manager.displayCourseRoster("Java");
        }
    }

