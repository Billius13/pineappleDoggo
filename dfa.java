/***************************************************
* Author: Francis Lowery
*
*
****************************************************/
public class dfa
{
    private int numOfStates;
    private int transitions;
    private String alphabet;
    private int terminatingStates;


    public dfa()
    {
      this.numOfStates = 0;
      this.transitions = 0;
      this.alphabet = "";
      this.terminatingStates = 0;
    }

    public dfa(int a,int b,String c,int d)
    {
      this.setNOS(a);
      this.setTransitions(b);
      this.setAlpha(c);
      this.setTS(d);
    }

    public int getNOS()
    { return this.numOfStates; }
    public int getTransitions()
    { return this.transitions; }
    public String getAlpha()
    { return this. alphabet; }
    public int getTS()
    { return this.transitions; }

    public void setNOS(int a)
    { this.numOfStates = a; }
    public void setTransitions(int a)
    { this.transitions = a; }
    public void setAlpha(String a)
    { this.alphabet = a; }
    public void setTS(int a)
    { this.terminatingStates = a; }

    public void printDFA()
    {
      System.out.println("Number of States:" + getNOS()
                       +"\nTransitions: " + getTransitions()
                       +"\nAlphabet: " + getAlpha()
                       +"\nTerminating States: " + getTS());
    }
}
