package com.leetcode.medium.graph.dfs;


/**
 * Note:
 * <p>
 * max 3 consequitive forward jumps possible for input -> a = 1999, b = 2000, c = 2000 |  2000*3=6000
 * with any further jumps, we will need more than 1 backward move to get to target     |  6000+1=6001
 * hence it's sufficient to consider x-axis points between 0 and 6000
 */

public class MinimumValueimumJumpstoReachHome {

    int target;
    int forward;
    int backward;

    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        target = x;
        forward = a;
        backward = b;
        int[] DP = new int[6001];
        // mark all forbidden indices with -1
        for (int index : forbidden)
            DP[index] = -1;
        // recursive processing
        return getMinJumps(0, false, DP);
    }

    int getMinJumps(int index, boolean wasLastJumpBackward, int[] DP) {
        // exclusion case -> cannot jump to negative indices
        if (index < 0) return -1;
        // beyond this we will need more than 1 backward move to reach index between 0 to 2000
        if (index >= DP.length) return -1;
        // terminate and return not possible if we are going in cycles
        if (DP[index] == -2) return -1;
        // base case -> we have reached target
        if (index == target) return 0;
        // return memoized result
        if (DP[index] != 0) return DP[index];

        // process if not memoized
        DP[index] = -2; // mark (-2) as being processed to avoid cycles
        if (wasLastJumpBackward) {
            // cannot perform 2 consequitive backward jumps
            int moveForward = getMinJumps(index + forward, false, DP);

            if (moveForward == -1) {
                DP[index] = -1;
            } else {
                DP[index] = 1 + moveForward;
            }
        } else {
            // get minimum of forward and backward jump paths
            int moveBackward = getMinJumps(index - backward, true, DP);
            int moveForward = getMinJumps(index + forward, false, DP);
            System.out.println("moveBackward :" + moveBackward + "  moveForward :" + moveForward);
            if (moveBackward == -1 && moveForward == -1) {//Stuck somwhere
                //
                /**
                 *   (-1 means exclusion case -> cannot jump to negative indices)
                 *
                 *    Stuck in backward and  forward.
                 *   Otherwise, we can say
                 *   We can't  move towards backward and  forward
                 */
                DP[index] = -1;
            } else if (moveBackward == -1 || moveForward == -1) {
                /**
                 *   Stuck in backward or in forward.
                 *   Otherwise, we can say
                 *   We can move either move towards backward or  forward
                 */
                DP[index] = 1 + Math.max(moveForward, moveBackward);
            } else {
                /**
                 *     We can  move both towards backward and  forward
                 */
                DP[index] = 1 + Math.min(moveForward, moveBackward);
            }
        }
        return DP[index];
    }
}