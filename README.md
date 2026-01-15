* Functionality of admin > add , remove for all models , showDataForEachModel , calculatedCGPA, Create course,Delete course,AssignInstructor_To_Course.
* Functionality of students >  Enroll , Drop courses , showProfile
* functionality of instructor > CalculateGrades , TeachCourse ,  DropCourse (will not teach this course) , showProfile ,viewEnrolledStudents(int courseId),gradeStudent().
--------------------------------

Database Design Steps:

1.Define System Requirements</br>
   Identify system users (Students, Instructors, Admin)
   Define main functionalities:
   Register students
   Manage courses
   Enroll students in courses
   Store and view grades

2.Identify Entities</br>
    Identify the main entities in the system
    Each entity represents a database table
    
3.Define Attributes for Each Entity</br>
    Define table columns (attributes)
    Identify:
         Primary Keys (PK)
         Foreign Keys (FK)
4.Define Relationships Between Entities</br>
5.Draw ER Diagram</br>
6.Convert ER Diagram to Tables (Logical Design)</br>
7.Normalize the Database</br>
   Ensure:
   No data redundancy
   Each table has a primary key
   Attributes depend only on the primary key
   
8.Review Database Design</br>
  Review tables and relationships</br>
  Validate design consistency</br>
  Ensure the design can be easily mapped to OOP classes

------------------------------
Note:
Each database table will later be converted into a Java class
&nbsp;







