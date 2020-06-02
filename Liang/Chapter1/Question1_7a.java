class Pi {
  static final int counter = 1000;

  static int setSignum(int count){
    return (count % 2 == 0 ? -1 : +1);
  }

  static double calculatePi(){
    double sum = 0;
    double answer;

    for(int i = 1; i <= counter; i++){
      sum = sum + ( (double) setSignum(i) / (double) (2 * i - 1));
    }
    answer = sum * 4;

    return answer;
  }
}
