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
    private int hashCode = -1;
    private int lowerBound = TreeSearch.negInf;
    private int upperBound = TreeSearch.posInf;
}