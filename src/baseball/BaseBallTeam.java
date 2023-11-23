package baseball;

public class BaseBallTeam {

    // フィールド
    private String name;// チーム名
    private int win;// 勝ち数
    private int lose;// 負け数
    private int draw;// 引き分け数

    //コンストラクタの定義
    public BaseBallTeam (String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // 勝率のメソッド
    public double getRate() {
        // 勝率表示する「勝ち数/(勝ち数+負け数)」
       double result = (double)win /(win +lose);
       return result;
    }

    public void report() {
        // チームの情報を出力する
        String value =String.valueOf(getRate());
        System.out.println(name + "の2022年の成績は"+ win +"勝"+ lose +"敗"+ draw + "分、勝率は" + value +"です。");
    }


    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getwin() {
        return win;
    }

   public void setwin(int win) {
       this.win = win;
   }

   public int getlose() {
       return lose;
   }

   public void setlose(int lose) {
      this.lose = lose;
  }

   public int getdraw() {
       return draw;
   }

   public void setdraw(int draw) {
      this.draw = draw;
  }



}//--class BaseBallTeam
