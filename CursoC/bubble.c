#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  clock_t inicio=clock();
  int i, j, tmp;
  int a[5]= {7, 5, 2, 1, 0};
  for (i=0; i<5; i++)
    for (j=0; j<5; j++)
      if(a[j]>a[j+1])
      {
        tmp=a[j+1];
        a[j+1]=a[j];
        a[j]=tmp;
      }
      else
        exit;
  for(i=0; i<5; i++)
    printf("%d\n", a[i]);
  clock_t fin = clock();
  double tiempo=(double)(fin-inicio);
  printf("%f\n", tiempo);
  return 0;
}
