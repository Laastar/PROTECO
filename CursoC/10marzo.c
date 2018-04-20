#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

int main()
{
  int A[100];
  int aleatorio = rand(), numero, bandera, aux, minimo;
  FILE *Hola;
  /*Hola = fopen("numeros.txt", "w");
  for (int i=0; i<1000; i++)
    fprintf(Hola, "%d ,", rand()%1000);
  fclose(Hola);*/
  Hola = fopen("numeros.txt", "r");
  for (int i=0; i<100; i++)
  {
    fscanf(Hola, "%d ,", &A[i]);
    printf("%d, ", A[i]);
  }
  fclose(Hola);
  printf("\n\n");
  for (int i=0; i<100; i++)
  {
    bandera = A[i];
    for (int j=i; j<100; j++)
      if(bandera>A[j])
      {
        minimo= j;
      }
    aux = A[i];
    A[i]=A[minimo];
    A[minimo] = aux;
  }
  for (int i=0; i<100; i++)
    printf("%d, ", A[i]);
  printf("\n");
  return 0;
}
