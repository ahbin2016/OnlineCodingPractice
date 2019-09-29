package com.test.hackerrank;

public class BudgetShop {
	static int budgetShopping(int n, int[] bundleQuantities, int[] bundleCosts) {

        int unitsCount = 0;
        int bundleCost = 0;
        int bundleQuantity = 0;

        int totalUnits = 0;

        int storesCount = bundleQuantities.length;

        for (int s = 0 ; s < storesCount ; s++ ) {

            int currBundleCount = n / bundleCosts[s];

            int currMaxUnitsCount = currBundleCount * bundleQuantities[s];

            if (s == 0) {
                unitsCount = currMaxUnitsCount;
                bundleCost = currBundleCount;
                bundleQuantity = bundleQuantities[s];
            }

            if (currMaxUnitsCount > unitsCount) {
                unitsCount = currMaxUnitsCount;
                bundleCost = currBundleCount;
                bundleQuantity = bundleQuantities[s];
            }

        }

        totalUnits = bundleCost * bundleQuantity;

        return totalUnits;
    }

    public static void main(String[] args) {
        int[] qtyArr = {20, 19};
        int[] costArr = {24,20};

        System.out.println(BudgetShop.budgetShopping(50, qtyArr , costArr));
    }
}
