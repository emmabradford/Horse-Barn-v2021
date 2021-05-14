public class HorseBarn
{
    /** The spaces in the barn.  Each array element hold a reference to the horse
     *  that is currently occupying the space.  A null value indicates an empty space.
     */
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces)
    {
        this.spaces = spaces;
    }

    /** Returns the index of the space that contains the horse with the specified name.
     *  Precondition: No two horses in the barn have the same name.
     *  @param name the name
     *  of the horse to find
     *  @return the index of the space containing the horse with the specified name;
     *          -1 if no horse with the specified name is in the barn.
     */
    public int findHorseSpace(String name)
    {
        // to be implemented in part a
        for(int i = 0; i < spaces.length; i++)
        {
            if(spaces[i] != null && name.equals(spaces[i].getName()))
            {
                return i;
            }
        }
        return -1;   // replace this line
    }

    /** Consolidates the barn by moving horses so that the horses are in adjacent spaces,
     * starting at index 0, with no empty space between any two horses.
     * Postcondition: The order of the horses is the same as before the consolidation.
     */
    public void consolidate()
    {
        Horse[] newBarn = new Horse[spaces.length];
        int horseCount = 0;
        for(int i = 0; i < spaces.length; i++)
        {
            if(spaces[i] != null)
            {
                newBarn[horseCount] = spaces[i];
                horseCount++;
            }
        }
        spaces = newBarn;
        // to be implemented in part b
        /*int foundNull;
        int foundNext = 0;
        Horse temp;
        for(int i = 0; i < spaces.length; i++)
        {
            if(spaces[i] == null)
            {
                foundNull = i;
                //System.out.println("horse: null at " + i);
                foundNext = foundNull;
                while(foundNext < spaces.length)
                {
                    if(spaces[foundNext] != null)
                    {
                        temp = spaces[foundNext];
                        spaces[foundNext] = spaces[foundNull];
                        spaces[foundNull] = temp;
                        foundNext = spaces.length;
                    }
                    foundNext++;
                }
            }
        }
        int hourse = 0;
        for(int i = 0; i < spaces.length; i++)
        {
            Horse temp = spaces[i];
            spaces[i] = null;
            if(temp != null)
            {
                spaces[hourse] = temp;
                hourse++;
            }
        }*/
        
    }
}
