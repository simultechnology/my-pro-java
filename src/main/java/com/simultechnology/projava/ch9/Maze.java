package com.simultechnology.projava.ch9;

import java.io.IOException;

public class Maze {
    public static void main(String[] args) throws IOException {
        record Position(int x, int y) {}
        int[][] map = {
                {1, 1, 1, 1, 1, 0},
                {1, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 1}
        };
        var current = new Position(1, 4);
        var goal = new Position(5, 0);
        for (;;) {
            for (int y = 0; y < map.length; y++) {
                for (int x = 0; x < map[y].length; x++) {
                    if (x == goal.x() && y == goal.y()) {
                        System.out.print("G");
                    } else if (x == current.x() && y == current.y()) {
                        System.out.print("o");
                    } else if (map[y][x] == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }

            if (current.equals(goal)) {
                System.out.println("GOAL!!!");
                break;
            }
            int read = System.in.read();
            var next = switch (read) {
                case 'a' -> new Position(current.x() - 1, current.y());
                case 'w' -> new Position(current.x(), current.y() - 1);
                case 's' -> new Position(current.x() + 1, current.y());
                case 'z' -> new Position(current.x(), current.y() + 1);
                default -> current;
            };
            if (map[next.y()][next.x()] == 0) {
                current = next;
            }
            System.in.read();
        }
    }
}
