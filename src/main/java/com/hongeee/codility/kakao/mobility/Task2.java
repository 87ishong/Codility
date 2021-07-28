package com.hongeee.codility.kakao.mobility;

import java.util.HashSet;
import java.util.Set;

/**
 * In role-playing video games a player assumes the role of a fictional character exploring the world, completing quests and learning new skills. The skill tree is one of the systems for progressing the characters development. It represents a hierarchy of skills.
 *
 * The main difficulty with such system is that whnever the player wants to learn a particular new skill, there is another skill that has to be learned first. The exception to this rule is the easiest skill to learn in the game, as it has no prerequisites. The name "skill tree" derives from the fact that those dependencies create the structure of a tree, with the easiest skill being at the root.
 *
 * Once a skill is learned, the character will always have it, so there is no need to learn it again if some other skill requires it. For example, if skill 1 requires skill 0, skill 2 requires skill 1 and skill 3 requires skill 1, then in order to learn skill 2, the player needs to learn three skills: 2, 1 and 0. If the player would also like to learn skill 3, then they need to learn only one more skill, skill3, as its prerequisites, skill 1 and 0, have already been fulfilled.
 *
 * In the pictures below, red color illustrates skills that are supposed to be learned, solid edges and vertices are ones that have to be learned to unlock red ones and dashed edges and vertices are ones that can be skipped.
 *
 * You are given an array T of N integers that represents the skill tree. The K-th skill can be learned only if the T[K]-th skill has already been learned. Skill 0 is the root and T[0] = 0. For the example explained above: T[0] = 0, T[1] = 0, T[2] = 1 and T[3] = 1, hence T = [0, 0, 1, 1].
 *
 * Write a function:
 * class Solution { public int solution(int[] T, int[] A); }
 *
 * that, given an array T of N integers and an array A of M integers, returns the minimum number of skills which have to be learned to acquire all of the skills from the array A in the skill tree T.
 *
 * Examples:
 * 1. Given T = [0, 0, 1, 1] and A = [2], your function should return 3, as explained above.
 * 2. Given T = [0, 0, 0, 0, 2, 3, 3] and A = [2, 5, 6], your function should return 5. To learn skill numbers 2, 5, 6, skills T[2] = 0, T[5] = 3 and T[6] = 3 have to be learned. To learn skill number 3, skill T[3] = 0 has to be acquired. Skill 0 is the root. This gives five skills in total: 2, 5, 6, 3, 0.
 * 3. Given T = [0, 0, 1, 2] and A = [1, 2], your function should return 3. Skill number 1 is necessary to unlock skill number 2, and skill number 1 requires skill number 0. That gives three skills in total.
 * 4. Given T [0, 3, 0, 0, 5, 0, 5] and A = [4, 2, 6, 1, 0], your function should return 7. Skills 4, 2, 6, 1 require respectively skills 5, 0, 5, 3. Skills 5, and 3 require skill 0. This gives seven different skills in total that have to be learned in order to acquire all skills from set A.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range[1..100,000];
 * M is an integer within the range[1..N];
 * each element of arrays T, A is an integer within the range [0..N-1]
 * skills form a tree rooted at 0;
 * the elements of A are all distinct.
 */
public class Task2 {

    public int solution(int[] T, int[] A) {
        int count = 0;
        // 이미 배운 스킬 중복 확인을 위한 HashSet
        Set<Integer> set = new HashSet<>();
        int preSkill;

        for (int i : A) {
            // 현재 스킬이 다른 스킬의 선행 스킬일 수 있으므로
            if (!set.contains(i)) {
                set.add(i);
                count++;
            }

            // 현재 스킬을 배우기 위한 선행 스킬
            preSkill = T[i];

            // 선행 스킬을 배우기 위한 다른 선행 스킬 탐색
            while (!set.contains(preSkill)) {
                set.add(preSkill);
                count++;
                preSkill = T[preSkill];
            }
        }

        return count;
    }
}
