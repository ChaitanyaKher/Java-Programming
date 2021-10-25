package edX;

public class MaximumProfit {
    public static double getMaximumLoot(int weight, Item[] items){
        double totalProfit = 0;
        int n = items.length -1;

        while (weight>0){
            double maxProfit = 0;
            int pos = 0;
            Item item = null;

            for (int i=0;i<items.length-1;i++){
                if (!items[i].isLooted()&&items[i].getProfit()>=maxProfit){
                    item = items[i];
                    maxProfit = items[i].getProfit();
                    pos =i;
                }
            }

            if (item!=null){
                item.setLooted(true);
                items[pos]=item;
                if (item.getWeight()<=weight){
                    weight -= item.getWeight();
                    totalProfit += item.getValue();
                } else {
                    if (item.getWeight()>weight){
                        totalProfit += (double) item.getValue()/(double) (item.getWeight()/weight);
                        weight = 0;
                    }
                }
            }
        }
        return totalProfit;
    }
}
