class Student {  

  String name; 

  double gpa;  

  String major;  

  String getName() {    
    return name;  
    }  

  double getGPA() {    
    return gpa;  
      }  

  String getMajor() {    
    return major;  
      }  
  
  void setName(String theName) {   
    name = theName;  
      }  

    void setGPA(double theGPA) {  
      gpa = theGPA;  
       }  

  void setMajor(String theMajor) {   
      major = theMajor;  
      }
      
  void print() {
    System.out.println("The students name is " + 
    name + " and they have a GPA of " + 
    gpa + " and are majoring in "+ 
    major);

  }
}