package com.testing.problem;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class ChunkerTest {
    //chunks([],1)-->{[]}
    @Test
    public void chunkShouldReturnEmptyIfTheInputIsEmpty() {
        int[] emptyArray = {}; //Arrange
        int[][] chunks = Chunker.chunks(emptyArray, 1); //Act
        Assertions.assertThat(chunks).isEmpty(); //Assert
    }
    //chunks([1],1)-->{[1]}
    @Test
    public  void chunkShouldReturnChunksOfSizeOneWhenInputArrayHasOneElementAndChunkSizeIsOne()
    {
        int[] input = {1}; //Arrange
        int[][] chunks = Chunker.chunks(input, 1); //Act
        Assertions.assertThat(chunks)
                .isEqualTo(new int[][]{   //Assert
                new int []{1}
        });

    }
    //chunks([1,2],1)-->{[1],[2]}
    @Test
    public void chunkShouldReturnChunksOfSizeTwoWhenInputArrayHasTwoElementAndChunkSizeIsOne()
    {

        int[] input = {1,2}; //Arrange
        int[][] chunks = Chunker.chunks(input, 1); //Act
        Assertions.assertThat(chunks)
                .isEqualTo(new int[][]{   //Assert
                        new int []{1},
                        new int[]{2}
                });

    }
    //chunks([1,2,3],2)-->{[1,2],[3]}
    @Test
    public void chunkShouldReturnChunksOfSizeTwoWhenInputArrayHasThreeElementAndChunkSizeIsTwo()
    {


    int[] input = {1,2,3}; //Arrange
    int[][] chunks = Chunker.chunks(input, 2); //Act
        Assertions.assertThat(chunks)
            .isEqualTo(new int[][]{   //Assert
        new int []{1,2},
                new int[]{3}
    });

}
@Test
public void chunkShouldReturnChunksOfSizeThreeWhenInputArrayHasFiveElementAndChunkSizeIsTwo()
{
    int[] input = {1,2,3,4,5}; //Arrange
    int[][] chunks = Chunker.chunks(input, 2); //Act
    Assertions.assertThat(chunks)
            .isEqualTo(new int[][]{   //Assert
                    new int []{1,2},
                    new int[]{3,4},
                    new int[]{5}
            });

}

}
