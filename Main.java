//Use an array that has the quiz scores of the first five quizzes. 
//Print the scores. Then your teacher gives a good curve on all the quizzes. 

//Your scores go up by 4 points for every quiz (use for loop). Print the new scores.

//Find the average of all the quiz scores. At the end of the semester, the teacher thinks all your grades are way too inflated and decides to take off 1 point from each quiz score. Print the new scores now and find the new average.

class Main {
  public static void main(String[] args) {
    int[] quizes = {99,88,77,66,55};
    

   for (int i =0; i<quizes.length; i++){
     quizes[i] = quizes[i]+4;
     System.out.print(quizes[i]+" ");
   }
    System.out.println("");

    double avg = averageFind(quizes);
    System.out.println("The average now is "+avg);
    for (int i =0; i<quizes.length; i++){
     quizes[i] = quizes[i]-1;
     System.out.print(quizes[i]+" ");
   }
     System.out.println("");
    avg = averageFind(quizes);
    System.out.println("The average now is "+avg);
    
  }

  public static double averageFind(int [] quizz){
    double total = 0;

    for(int i =0; i<quizz.length; i++){
      total = total + quizz[i];
    }
    double average = total / quizz.length;
    return average;
  }


  
}