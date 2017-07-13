	// Add your code here
    public Difference(int[] e){
        this.elements = e;
        this.maximumDifference = 0;
    }

    public void computeDifference(){
        int diff =0;
        for(int i = 0; i < elements.length-1; i ++){
            for(int j = 1; j < elements.length; j++){
                diff = Math.abs(elements[j] - elements[i]);
                maximumDifference = Math.max(maximumDifference,diff);
            }
        }
    }
