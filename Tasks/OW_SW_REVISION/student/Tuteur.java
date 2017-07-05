package student;

public class Tuteur implements Personne{
  String name;
  int age;
  boolean seen;
  boolean spoil;
  public Tuteur (String n, int a, boolean s, boolean sp){
    this.name=n;
    this.age=a;
    this.seen=s;
    this.spoil=sp;
  }
  public String getName(){return this.name;}
  public int getAge(){return this.age;}
  public boolean hasSeenStarWars(){return this.seen;}
  public boolean spoilerAlert(){return this.spoil;}
}
