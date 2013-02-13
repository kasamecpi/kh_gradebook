public class Grade {
	private String studentId;
	private String teacherId;
	private String courseId;
	private String gradeNr;
	
	public Grade(String s,String t, String c, String g)
	{
	 studentId = s;
	 teacherId = t;
	 courseId = c;
	 gradeNr = g;
	}
	
	/*
	public String getStudentId(){
		return studentId;
		
	}
	public String getTeacherId()
	{
		return teacherId;
	}
	public String getCourseId()
	{
		return courseId;
	}	
	public String getGrade()
	{
		return gradeNr;
	}
	*/
	
	public String[] getGrade()
	{
		String[] myGrade = {studentId, teacherId, courseId, gradeNr};
		
		return myGrade;
		
	}
	
}
	