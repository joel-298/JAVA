class University {
    private String universityName = "Chitkara";
    public String getuniversityName(){
        return universityName ; 
    }
}
class Department extends University {
    private String departmentName ; 
    Department(String departmentName){
        super() ;
        this.departmentName = departmentName ; 
    }
    public String getdepartmentName(){
        return departmentName ; 
    }
}
class Section extends Department { 
    private String sectionName ; 
    Section(String departmentName, String sectionName) {
        super(departmentName) ; 
        this.sectionName = sectionName ; 
    }
    public String getSectionName(){
        return sectionName; 
    }
}
class Student extends Section { 
    private String studentName ; // by default empty string
    private int age ;
    private int fees ;             // by default 0
    static int totalfees ; // by default 0
    Student(String studentName , String sectionName , String departmentName , int age , int fees){
        super(departmentName,sectionName) ;
        this.studentName = studentName ; 
        this.age = age ; 
        this.fees = fees ; 
        totalfees += fees ; // incrementing total fees :  
    }

}