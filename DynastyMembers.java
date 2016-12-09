public class DynastyMembers {
    public static void main(String[] args) {
        int i = 1;
        int great = 1;
        int children = 10;
        int heirs = 0;

        int gen = Integer.parseInt(args[0]);
        System.out.println(CountPeople(i, gen, great, children, heirs));
    }

    public static int CountPeople(int i, int gen, int great, int children, int heirs) {
        if (children < 2) {
            children = 2;
        }
        great = children * great;
        heirs = heirs + great;
        if (i % 2 == 1) {
            children = children - 2;
        } else {
            children = children + 1;
        }
        if (i < gen) {
            return CountPeople(i + 1, gen, great, children, heirs);
        } else {
            return heirs;
        }
    }
}