#include <stdio.h>

int main() {

    int r1, r2, t, i;
    scanf ("%d", &t);
    if (t <= 10000) {
        for (i = 1; i <= t; i++) {
            scanf("%d %d", &r1, &r2);
            int t = ((r1 * 2) + (r2 * 2)) / 2;
            printf("%d\n", t);
        }
    }
    return 0;
}
