/**
 * @ author milkycx
 * @ create 2018-11-01
 **/
public class PhraseOMatic {
    public static void main(String[] args){
        // make three sets of words to choose from
        String[] wordListOne = {"24/7","Multi-Tier","30,000 foot","B-TO-B","win-win",
        "front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
        String[] wordListTwo = {"empowered","sticky","value-added","oriented","centric","distributed",
        "clustered","branded","outside-the-box","positioned","networked","focused","leveraged","aligned",
        "targeted","shared","cooperative","accelerated"};
        String[] wordListThree = {"process","tipping-point","solution","architecture","core competency",
        "strategy","mindshare","portal","space","vision","paradigm","mission"};

        // find out how many words are in each list;
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //generate three random number;
        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);

        // build pharse
        String pharse = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];
        // output
        System.out.println(pharse);

    }
}
