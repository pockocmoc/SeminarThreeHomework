import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void countPathsOne() {
        assertEquals(3432, Solution.countPaths(0, 0, 8));
    }
    @org.junit.jupiter.api.Test
    void countPathsTwo() {
        assertEquals(924, Solution.countPaths(0, 0, 7));
    }
    @org.junit.jupiter.api.Test
    void countPathsThree() {
        assertEquals(2, Solution.countPaths(0, 0, 2));
    }
    @org.junit.jupiter.api.Test
    void countPathsFour() {
        assertEquals(70, Solution.countPaths(0, 0, 5));
    }
}