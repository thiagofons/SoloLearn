#include <stdio.h>
#include <stdlib.h>
#include <errno.h>
#include <math.h>

int main(void){
    float k = -5, num = 1000, result;

    // EDOM (Domain out of range)
    errno = 0;
    result = sqrt(k);

    if(errno == 0)
        printf("%f ", result);
    else if(errno == EDOM)
        fprintf(stderr, "%s\n", strerror(errno));

    // ERANGE (Range error)
    errno = 0;
    result = exp(num);

    if(errno == 0)
        printf("%f ", result);
    else if(errno == ERANGE)
        fprintf(stderr, "%s\n", strerror(errno));

    return 0;
}