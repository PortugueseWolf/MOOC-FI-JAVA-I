package warehousing;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        
        double max = 0;
        for (double calc : history) {
            if (calc > max) {
                max = calc;
            }
        }
        return max;
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }

        double min = history.get(0);
        for(double calc : history) {
            if (calc < min) {
                min = calc;
            }
        }
        return min;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }

        int count = history.size();
        int sum = 0;
        for(double calc : history) {
            sum += calc;
        }
        return 1.0 * sum / count;
    }


    
}
