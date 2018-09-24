public class HypnotizeAlice {
    public static void main(String[] args){
        Alice alice = new Alice("Normal", "Normal costume");

        System.out.println("…は？催眠？");
        System.out.println("効くわけないでしょ");
        System.out.println("ありえないわ");

        do {
            alice.setStatus("Hypnotism");
            alice.setCostume("Bunny suits");
        }while(alice.getStatus().equals("Normal") || alice.getCostume().equals("Normal costume"));

        System.out.println("-----------------");
        System.out.println("えっちしよ");
        System.out.println("恋人でしょ？");
        System.out.println("そんなの当然じゃない？");

        System.out.println("状態：" + alice.getStatus());
        System.out.println("衣装：" + alice.getCostume());
    }
}
