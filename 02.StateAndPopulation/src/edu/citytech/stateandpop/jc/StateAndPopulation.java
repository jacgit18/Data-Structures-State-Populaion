package edu.citytech.stateandpop.jc;
// you can copy the code from the class to the end where to curlly brackets and paste into the package to create the class
public class StateAndPopulation 
{
    private String code;

    private String name;

    private int rank;
 
    private int population;

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public int getRank ()
    {
        return rank;
    }

    public void setRank (int rank)
    {
        this.rank = rank;
    }

    public int getPopulation ()
    {
        return population;
    }

    public void setPopulation (int population)
    {
        this.population = population;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [code = "+code+", name = "+name+", rank = "+rank+", population = "+population+"]";
    }
}
			
			