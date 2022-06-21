class Main {
  public static void main(String[] args) {
   int[][] tablica={{5,3,1,4,2},{1,1,1,0,2},{5,6,4,7,3,8,2}};
    int min=0;
    int k=1;
    for(int i=0;i<3;i++)
      {
        min=tablica[i][0];
        for(int j=0;j<tablica[i].length;j++)
          {
            if(tablica[i][j]<min)
            min=tablica[i][j];
          }
        System.out.println("Najmniejsza wartoscia w kolumnie "+k+" jest "+min);
        k++;
      }
  }
}