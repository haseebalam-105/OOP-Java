public class CheckDuplicate
{
    private int n1,n2,n3,n4,n5;

    public CheckDuplicate(int n1 , int n2 , int n3 , int n4 , int n5)
    {
        setN1(n1);
        setN2(n2);
        setN3(n3);
        setN4(n4);
        setN5(n5);
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        if(n1>10 && n1 <100)
        {
            this.n1 = n1;
        }
        else
        {
            System.out.println("Invalid number !");
        }
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        if(n2>10 && n2 <100)
        {
            this.n2 = n2;
        }
        else
        {
            System.out.println("Invalid number !");
        }
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        if(n3>10 && n3 <100)
        {
            this.n3 = n3;
        }
        else
        {
            System.out.println("Invalid number !");
        }
    }

    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        if(n4>10 && n4 <100)
        {
            this.n4 = n4;
        }
        else
        {
            System.out.println("Invalid number !");
        }
    }

    public int getN5() {
        return n5;
    }

    public void setN5(int n5) {
        if(n5>10 && n5 <100)
        {
            this.n5 = n5;
        }
        else
        {
            System.out.println("Invalid number !");
        }
    }
}
