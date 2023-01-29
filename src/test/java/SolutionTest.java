import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void countPathsOne() {
        assertEquals(3432, Solution.countPaths(0, 0, 8, 8));
    }

    @org.junit.jupiter.api.Test
    void countPathsTwo() {
        assertEquals(6, Solution.countPaths(0, 0, 3, 3));
    }

    @org.junit.jupiter.api.Test
    void countPathsThree() {
        assertEquals(35, Solution.countPaths(0, 0, 4, 5));
    }

    @org.junit.jupiter.api.Test
    void countPathsFour() {
        assertEquals(70, Solution.countPaths(0, 0, 5, 5));
    }

    @org.junit.jupiter.api.Test
    void countPathsFive() {
        assertEquals(70, Solution.countPaths(0, 0, 5, 5));
    }

}