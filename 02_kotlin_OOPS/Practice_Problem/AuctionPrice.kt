// In an auction, the highest bidder determines the price of an item. 
// In this special auction, if there's no bidder for an item, 
// the item is automatically sold to the auction house at the minimum price.

// You're given an auctionPrice() function that accepts a nullable Bid? type as an argument:

fun main() {
    val winningBid = Bid(5000, "Android Developer")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item A is sold at ${auctionPrice(null, 3000)}.")
}
class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}

// The solution uses the ?. safe call operator and the ?: Elvis operator to return the correct price: