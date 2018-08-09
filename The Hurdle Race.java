//Author: Rohit Goswami
//Email: lynus.mascot@gmail.com
 static int hurdleRace(int k, int[] height) {
         int min_drink=0;
         int max_height=k;
         int temp= height[0];
         int i;
        for(i=0;i<height.length;i++){
        if(height[i]>temp)
            temp=height[i];
        }
        if(temp<max_height) return 0;
        else return  temp-max_height; 
        }
