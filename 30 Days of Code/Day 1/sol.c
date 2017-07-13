 // Declare second integer, double, and String variables.
    int i2;
    double d2;
    char ss[100]; 
     
    // Read and save an integer, double, and String to your variables.
    //scanf("%d",&i2);
    //scanf("%lf",&d2);
    scanf(" %d %lf\n%[^\n]", &i2, &d2,ss);
    // Print the sum of both integer variables on a new line.
    printf("%d\n",i+i2);
 
    // Print the sum of the double variables on a new line.
    printf("%.1lf\n",d+d2);
    // Concatenate and print the String variables on a new line
   printf("%s",s);
   int counter = 0;
   int len = strlen(ss);
   while (counter < len) {
        printf("%c", ss[counter]);
        counter++;
    }
