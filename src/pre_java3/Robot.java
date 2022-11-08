package pre_java3;


import java.util.Arrays;
import java.util.Stack;

public class Robot {
    public static int Max_direction = 4;
    public static int Max = 8;

    public static int visit = 2;

    Stack<Move> stack = new Stack<Move>();
    Maze maze = new Maze();

    public int[][] offsets =
        {
            {-1, 0},		// 위쪽으로 이동.
            {0, 1},			// 오른쪽으로 이동.
            {1, 0},			// 아래쪽으로 이동.
            {0, -1}			// 왼쪽으로 이동.
        };

    int[][] markArray = new int[8][8];


    public void findPath(int startX, int startY, int endX, int endY){
        boolean isFound = false;

        Move start = new Move(startX, startY);
        start.direction = 0;        // 초기 Move인스턴스는 다 0으로 시작함

        stack.push(start); // 시작 위치를 스택에 저장

        while (!isFound ){
            Move now_loc = stack.pop(); //  현위치는 스택의 마지막으로 저장된 Move 인스턴스이다.
            int x = now_loc.x;
            int y = now_loc.y;
            int direction = now_loc.direction;

            while(direction < Max_direction) { // 사방이 방문했거나 막혔으면 반복문을 나오게된다.

                int newX = x + offsets[direction][0];  // direction 값에 따른 x, 값 y값을 수정 북동남서 방향으로 이동
                int newY = y + offsets[direction][1];

                if (newX >= 0 && newX < Max
                    && newY >= 0 && newY < Max
                    && markArray[newX][newY] != visit
                    && maze.myMaze[newX][newY] !=visit
                    && maze.myMaze[newX][newY] !=1
                ){
                    Move newPosition = new Move(newX, newY); //새로운 좌표로 객체 생성
                    newPosition.direction = direction +1;
                    stack.push(newPosition); // 스택에 저장
                    markArray[x][y] = visit;

                    x = newX;        // 새로운 위치를 현위치로
                    y = newY;
                    direction = 0;  // 방향 초기화(다시 북쪽부터 시계방향으로 탐색한다)

                    System.out.print("(" +x +"," + y + ")->");
                    if (newX == endX && newY == endY){ // 미로 출구로 나왔을경우
                        System.out.println();
                        isFound = true;
                        newPosition.x = newX;
                        newPosition.y = newY;
                        newPosition.direction = 0;
                        stack.push(newPosition);
                        markArray[newY][newX] = visit;

                        for (int[] ints : markArray) {
                            for (int a : ints) {
                                if (a == visit) {
                                    System.out.print(" ");
                                } else {
                                    System.out.print("*");
                                }
                            }
                            System.out.println();
                        }
                    }
                } else {
                    direction++; // 조건이 충족하지 않다면 위치 전환
                }
            }
        }
    }


}
