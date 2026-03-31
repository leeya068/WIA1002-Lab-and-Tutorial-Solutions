package t3.t3q2;

/**
 * BidInterface.java
 * 
 * This interface defines the operations for an Air Conditioner Installation Bid.
 * A bid represents a proposal from a company to install a specific air conditioning unit,
 * including details about the unit, its performance, and associated costs.
 */
public interface BidInterface {
    
    /**
     * Returns the name of the company making this bid.
     * 
     * @return the company name as a String
     * @precondition none
     * @postcondition none - the state of the bid remains unchanged
     */
    String getCompanyName();
    
    /**
     * Returns the description of the air conditioner that this bid is for.
     * 
     * @return the AC unit description as a String
     * @precondition none
     * @postcondition none - the state of the bid remains unchanged
     */
    String getDescription();
    
    /**
     * Returns the capacity of this bid's AC in tons.
     * 1 ton = 12,000 BTU (British Thermal Units).
     * 
     * @return the cooling capacity in tons as a double
     * @precondition none
     * @postcondition none - the state of the bid remains unchanged
     */
    double getCapacityTons();
    
    /**
     * Returns the seasonal efficiency of this bid's AC.
     * SEER (Seasonal Energy Efficiency Ratio) measures cooling output
     * divided by total electric energy input over a season.
     * Higher SEER ratings indicate better energy efficiency.
     * 
     * @return the SEER rating as a double
     * @precondition none
     * @postcondition none - the state of the bid remains unchanged
     */
    double getSEER();
    
    /**
     * Returns the cost of this bid's AC unit.
     * 
     * @return the unit cost in dollars as a double
     * @precondition none
     * @postcondition none - the state of the bid remains unchanged
     */
    double getUnitCost();
    
    /**
     * Returns the cost of installing this bid's AC unit.
     * 
     * @return the installation cost in dollars as a double
     * @precondition none
     * @postcondition none - the state of the bid remains unchanged
     */
    double getInstallationCost();
    
    /**
     * Returns the yearly cost of operating this bid's AC unit.
     * This calculation typically considers:
     * - The unit's energy consumption based on capacity and SEER
     * - Average local electricity rates
     * - Estimated annual operating hours
     * 
     * @return the estimated yearly operating cost in dollars as a double
     * @precondition none
     * @postcondition none - the state of the bid remains unchanged
     */
    double getYearlyOperatingCost();
}