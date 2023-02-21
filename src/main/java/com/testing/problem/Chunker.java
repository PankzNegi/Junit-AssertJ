package com.testing.problem;

public abstract class Chunker {

    private  static final int[] [] EMPTY_ARRAY={};
    public static int[][]chunks(int[] input,int chunkSize)
    {

        if(input.length==0)
        {
            return EMPTY_ARRAY;
        }
        int resultArraySize=getResultArraySize(input,chunkSize);
        int[][] resultArray=new int[resultArraySize][];
       // resultArray[0]=new int[]{1};
        int inputIndex=0;
        for(int i=0;i<resultArraySize;i++)
        {
            int[] chunk=new int[chunkSize];
            if(i==resultArraySize-1)
            {
                chunk=new int[input.length-inputIndex];
            }
            for(int j=0;j<chunk.length;j++)

            {
                chunk[j]=input[inputIndex++];
            }
            resultArray[i]=chunk;
        }
        return resultArray;

    }
    private static int getResultArraySize(int []input,int chunkSize)
    {
        return input.length%chunkSize==0
                ?input.length/chunkSize
                :input.length/chunkSize+1;
    }
}
