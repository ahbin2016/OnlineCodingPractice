package com.test.future.skill.shoesizes;

public class Solution {

        public Solution() {
            // If you need initialization code, you can write it here!
            // Do not remove.
            API = new ShoeSizesAPI();
            processData();
        }

        /**
         * Return the most popular shoe size in the customer list.
         */
        public int popularSize() {
            // Todo: Write your code here!
            if (uniqueSize) {
                return popularSize;
            } else return -1;
        }

        /**
         * Return the most popular name for the most popular shoe size in the given
         * list.
         */
        public String popularName() {
            // Todo: Write your code here!
            if (uniqueName) {
                return popularName;
            } else return "";
        }


        public void processData() {

            int recordCount = getListCount();
            int highestSizeCount = 0;
            int highestNameCount = 0;


            for (int s = 0; s < recordCount; s ++ ) {

                int currentSizeCount = 0;
                int currentNameCount = 0;
                int currentSize = getSize(s);
                String currentName = getName(s);

                System.out.println(currentSize + "-" + currentName);

                for (int s2 = 0; s2 < recordCount; s2 ++ ) {

                    if (s != s2) {

                        int otherSize = getSize(s2);
                        String otherName = getName(s2);

                        if (currentSize == otherSize) {
                            currentSizeCount += 1;
                        }

                        if (currentName.equals(otherName)) {
                            currentNameCount += 1;
                        }
                    }
                }

                if (currentSizeCount > highestSizeCount) {
                    highestSizeCount = currentSizeCount;
                    this.popularSize = currentSize;
                }


                if ((highestSizeCount > 0) && (currentSizeCount == highestSizeCount)) {

                        System.out.println("currentSizeCount: " + currentSizeCount + ", highestSizeCount: " + highestSizeCount);
                        System.out.println("not unique size: " + currentSize );
                        if (popularSize != currentSize) {
                            this.uniqueSize = false;
                        }
                }



                if (currentNameCount > highestNameCount) {
                    highestNameCount = currentNameCount;
                    if (currentSize == popularSize) {
                        this.popularName = currentName;
                    }

                }

                if ((highestNameCount > 0) && (currentNameCount == highestNameCount)) {

                    if(!popularName.equals(currentName)) {
                        this.uniqueName = false;
                    }
             }

            }
        }

        private String popularName = "";
        private int popularSize = -1;
        private boolean uniqueSize = false;
        private boolean uniqueName = false;
        private ShoeSizesAPI API;

        private int getListCount() {
            return API.getListLength();
        }


        private String getName(int index) {
            return API.getName(index);
        }

        private int getSize(int index) {
            return API.getSize(index);
        }


    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println("Popular Name: " + solution.popularName());
        System.out.println("Popular Size: " + solution.popularSize());

    }

}
