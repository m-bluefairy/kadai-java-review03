package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam teamA = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        teamA.report();

        BaseBallTeam teamB = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        teamB.report();

        BaseBallTeam teamC = new BaseBallTeam("阪神タイガース",68,71,4);
        teamC.report();

        BaseBallTeam teamD = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        teamD.report();

        BaseBallTeam teamE = new BaseBallTeam("広島東洋カープ",66,74,3);
        teamE.report();

        BaseBallTeam teamF = new BaseBallTeam("中日ドラゴンズ",66,75,2);
        teamF.report();

    }//--static void main

}//class Review03
