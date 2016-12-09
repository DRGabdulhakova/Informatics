public class DynastyMembers {
    public static void main(String[] args) {
        int i = 1;
        int childGen = 1;
        int multiplier = 10;
        int sumPeople = 0;

        int gen = Integer.parseInt(args[0]);
        System.out.println(CountPeople(i, gen, childGen, multiplier, sumPeople));
    }

    public static int CountPeople(int i, int gen, int childGen, int multiplier, int sumPeople) {
        if (multiplier < 2) {
            multiplier = 2;
        }
        childGen = multiplier * childGen;
        sumPeople = sumPeople + childGen;
        if (i % 2 == 1) {
            multiplier = multiplier - 2;
        } else {
            multiplier = multiplier + 1;
        }
        if (i < gen) {
            return CountPeople(i + 1, gen, childGen, multiplier, sumPeople);
        } else {
            return sumPeople;
        }
    }
}
