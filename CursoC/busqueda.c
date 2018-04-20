#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {

  clock_t inicio=clock();
  int a[6]= {4, 7, 1, 8, 3, 5};
  int search=5;
  for (int i = 0; i<6; i++)
  {
    if(a[i]==search)
    {
      printf("%d\n", a[i]);
    }
  }
  clock_t fin = clock();
  double tiempo=(double)(fin-inicio);
  printf("%f\n", tiempo);
  return 0;
}
