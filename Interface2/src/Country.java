import java.util.ArrayList;
import java.util.Arrays;

public class Country implements Stats
{
    private String name;

    int[] provincesAreas = new int[] {14,23,44,55,59};
    ArrayList<Integer> statsAreas;

    public Country(String name)
    {
        this.name = name;
        statsAreas = new ArrayList<>();
        statsAreas.add(22);
        statsAreas.add(33);
        statsAreas.add(44);
    }

    @Override
    public double computeArea()
    {
        double provincearea = 0;
        double statesarea =0;

        for(int i=0;i<provincesAreas.length;i++)
        {
             provincearea = (double) (provincearea + provincesAreas[i]);
        }
        for(Integer i : statsAreas)
        {
            statesarea = (double) (i+statesarea);
        }
        double area = provincearea+statesarea;

        return area;
    }

    @Override
    public void reset()
    {
        for(int i=0 ; i<provincesAreas.length ; i++)
        {
            provincesAreas[i] = 0;
        }
        for(int i=0 ; i<statsAreas.size() ; i++)
            statsAreas.set(i, 0);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", provincesAreas=" + Arrays.toString(provincesAreas) +
                ", statsAreas=" + statsAreas +
                '}';
    }
}
