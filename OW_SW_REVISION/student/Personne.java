public interface Personne{
  /**
   * @pre -
   * @post retourne le nom de la personne
   */
   public String getName();

   /**
    * @pre -
    * @post retourne l'age de la personne
    */
    public int getAge();

    /**
     * @pre -
     * @post retourne true si la personne a vu le film, false sinon
     */
     public boolean hasSeenStarWars();

     /**
      * @pre -
      * @post retourne true si la personne risque de raconter la fin du film,
      *       false sinon
      */
      public boolean spoilerAlert();
}
