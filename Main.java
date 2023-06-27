public class Main {
    public static void main(String[] args) {
        Toy designer = new Toy(1, "Конструктор", 20);
        Toy robot = new Toy(2, "Робот", 20);
        Toy dool = new Toy(3, "Кукла", 40);
        
        Contest contest = new Contest();
            
        contest.addToy(dool);
        contest.addToy(designer);
        contest.addToy(robot);
        contest.contestToy();
        contest.readContest();
        contest.contestToy();
        contest.readContest();
        contest.contestToy();
        contest.readContest();
        contest.getToy();
        contest.getCount();
    }
}
