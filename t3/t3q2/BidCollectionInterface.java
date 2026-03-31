package t3.t3q2;

/**
 * BidCollectionInterface.java
 * 
 * This interface defines the operations for a collection of Air Conditioner Installation Bids.
 * The collection allows for managing multiple bids, including the possibility of multiple
 * bids from the same company with different AC units.
 */
public interface BidCollectionInterface {
    
    /**
     * Adds a bid to this collection.
     * 
     * @param bid the bid to be added to the collection
     * @precondition bid is not null
     * @postcondition the bid is added to the collection and the size increases by 1
     */
    void addBid(BidInterface bid);
    
    /**
     * Returns the bid in this collection with the best yearly cost.
     * Best yearly cost is defined as the lowest yearly operating cost.
     * 
     * @return the bid with the lowest yearly operating cost, or null if the collection is empty
     * @precondition none
     * @postcondition none - the collection remains unchanged
     */
    BidInterface getBestYearlyCostBid();
    
    /**
     * Returns the bid in this collection with the best initial cost.
     * The initial cost is defined as the unit cost plus the installation cost.
     * Best initial cost is defined as the lowest total initial cost.
     * 
     * @return the bid with the lowest initial cost (unit cost + installation cost), 
     *         or null if the collection is empty
     * @precondition none
     * @postcondition none - the collection remains unchanged
     */
    BidInterface getBestInitialCostBid();
    
    /**
     * Clears all of the items from this collection.
     * After this operation, the collection will be empty.
     * 
     * @precondition none
     * @postcondition the collection is empty and size is 0
     */
    void clear();
    
    /**
     * Gets the number of items in this collection.
     * 
     * @return the number of bids currently in the collection
     * @precondition none
     * @postcondition none - the collection remains unchanged
     */
    int getSize();
    
    /**
     * Sees whether this collection is empty.
     * 
     * @return true if the collection contains no bids, false otherwise
     * @precondition none
     * @postcondition none - the collection remains unchanged
     */
    boolean isEmpty();
}