import java.util.HashSet;
import java.util.Set;

class SkillAnalyzer {
    public static void main(String[] args) {
        Set<String> candidateASkills = new HashSet<>();
        candidateASkills.add("Java");
        candidateASkills.add("Python");
        Set<String> candidateBSkill = new HashSet<>();
        candidateBSkill.add("Python");
        candidateBSkill.add("SQL");
        System.out.println("candidateA" + candidateASkills);
        System.out.println("candidateB" + candidateBSkill);
        System.out.println(findUniqueSkills(candidateASkills, candidateBSkill));
    }

    public static Set<String> findUniqueSkills(Set<String> candidateASkills, Set<String> candidateBSkills) {
        Set<String> union = new HashSet<>(candidateASkills);
        union.addAll(candidateBSkills);
        Set<String> intersection = new HashSet<>(candidateASkills);
        intersection.retainAll(candidateBSkills);
        union.removeAll(intersection);


        return new HashSet<>(union);
    }
}