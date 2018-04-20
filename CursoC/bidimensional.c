#include<stdio.h>
#include<stdlib.h>
//nickygarcia@comunidad.unam.mx
//arreglo 3D
int main()
{

  int** a = NULL;

  int** a = (int**) calloc(2, sizeof(int*));

  a[0] = (int*) calloc(1, sizeof(int));
  a[1] = (int*) calloc(1, sizeof(int));

  a[0][0]=1;
  a[0][1]=1;
  a[1][0]=1;
  a[1][1]=1;

  for(int i = 0; i<2; i++)
    free (a[i]);

  free (a);
}
