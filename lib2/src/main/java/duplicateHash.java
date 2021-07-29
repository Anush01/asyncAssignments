import java.util.HashMap;
import java.util.Map;

public class duplicateHash {

    public static void main(String[] args) {


        int[] masaiArray = {11,22,33,10,11,30,40,50,11};

        //int marrLen = masaiArray.length;

        int matsize = 3;

        int[][] mat = new int[matsize][matsize];

        int countPosition = 0;

        for(int i = 0; i<matsize; i++){

            for(int j = 0; j<matsize; j++){


                mat[i][j] = getelement(masaiArray, countPosition);
                countPosition = countPosition + 1;

            }

        }


        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int k = 0; k<matsize; k++){

            for(int l = 0; l<matsize; l++){

                int element = mat[k][l];

                if(freqMap.containsKey(element)){

                    freqMap.put(element, freqMap.get(element) + 1);

                }else{

                    freqMap.put(element,1);
                }

            }

        }

        int dupElement = 0;
        int dupElementfreq = 1;

        for(Map.Entry m : freqMap.entrySet()){


           int dupElementholder = Integer.parseInt(m.getKey().toString());

           int dupElmentfreqholder = Integer.parseInt(m.getValue().toString());

            if(dupElmentfreqholder>dupElementfreq){

                //dupElementfreq = dupElmentfreqholder;
                dupElement = dupElementholder;
                break;
            }



        }



        System.out.println("it worked, the first duplicate element with frequency greater than 1 is shown below. ");
        System.out.println(dupElement);

    }


    public static int getelement(int[] m, int position){

        int response = m[position];

        return response;

    }

}


