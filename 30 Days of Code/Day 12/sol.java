class Student extends Person{
	private int[] testScores;
    
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String fn, String ln, int id,int[] ts){
        super(fn,ln,id);
        testScores = ts;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        char rt = '\0'; 
        int avg = 0;
        for(int i = 0; i < this.testScores.length; i++){
            avg+= testScores[i];
        }
        avg = avg/(testScores.length);
        
        if(avg >= 90 && avg <= 100){
            rt = 'O';
        }else if(avg >= 80 && avg <=90){
            rt =  'E';
        }else if(avg >= 70 && avg <= 80){
            rt = 'A';
        }else if(avg >= 55 && avg <= 70){
            rt = 'P';
        }else if(avg >= 40 && avg <= 55){
            rt = 'D';
        }else if(avg < 40){
            rt = 'T';
        }
        return rt;
    }
}
