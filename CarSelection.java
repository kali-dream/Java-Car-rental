public class CarSelection {
    /**
     * This method returns the price of a vehicle of a particular model based on
     * its base price, upgrade coefficient, and color choice.
     *
     * @param basePrice           base price for the particular model
     * @param upgradeCoefficient dealer markup
     * @param colorIndex          addition for premium color
     * @return total model price including all markup and premium prices
     */
    public double calculateCarPrice(double basePrice, double upgradeCoefficient, double colorIndex) {
        // Calculate the total price including markup and premium color
    	double totalMarkup = basePrice * upgradeCoefficient;
        if (colorIndex == 1 || colorIndex == 2) {
            // Apply premium price for colors 1 and 2
            return basePrice + totalMarkup + 1000; // i set primium color price to 1000
        } else {
            // Standard price for other colors
            return basePrice + totalMarkup;
        }
    }
    
 
}
