class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        
       int rebandant=((purchaseAmount+5)/10)*10;

       return 100-rebandant;
}
}