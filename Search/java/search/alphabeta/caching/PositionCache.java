package search.alphabeta.caching;

import search.TreeSearch;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 22, 2009
 * Time: 9:33:35 PM
 * This caches a position that we have already seen
 * (Need to decide whether or not to cache the actual position, or just a hash of it)
 */
public class PositionCache {
    int hashCode = -1;
    int lowerBound = TreeSearch.negInf;
    int upperBound = TreeSearch.posInf;

    public void setNewHashCode(int hashCode) {
        this.hashCode = hashCode;
        lowerBound = TreeSearch.negInf;
        upperBound = TreeSearch.posInf;
    }
}
