creating a course :
POST localhost:9193/courses
Requestbody:
{
    "couserName":"MSC information Sc",
    "courseDescription":"5 years integrated"
}


===============================================================================

Retriev a student for a course:
GET localhost:9193/courses/1/students

==============================================================================

Register student for a course:

POST localhost:8765/ACADEMIC-REGISTRATION/register

Request body:
  {
    "candidateName":"Alexdander M",
    "courseId":"1"
}

================================================================================

