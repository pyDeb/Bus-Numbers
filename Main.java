import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int numOfInput = sc.nextInt();

        int[] busStops = new int[numOfInput];


        for(int i=0; i<numOfInput; i++){

            busStops[i] = sc.nextInt();
        }

        Arrays.sort(busStops);
        

        for(int i=0 ; i < numOfInput ; i++){
            //System.out.println(busStops[i]);
            if(i < numOfInput - 2 && numOfInput > 2)
            {
                if(busStops[i] + 1 == busStops[i + 1] && busStops[i + 1] + 1 == busStops[i + 2])
                {
                    int start = busStops[i];
                    int end = 0;
                    for(int j = busStops[i]; busStops[i] == j; j++, i++){
                        if(i == numOfInput-1)
                            break;
                    }
                    if(i == numOfInput - 1)
                    {
                        if(busStops[i] == busStops[i-1] + 1)
                            end = busStops[i];
                        else{
                        i--;
                        end = busStops[i];
                    }
                    }
                        
                    else{
                        i--;
                        end = busStops[i];
                    }
                        
                    System.out.print(start);
                    System.out.print('-');
                    System.out.print(end);
                    System.out.print(' ');
                }
                else{
                    System.out.print(busStops[i]);
                    System.out.print(' ');
                }
            }
            else{
                System.out.print(busStops[i]);
                System.out.print(' ');
            }
            
            
        }
    }
}
