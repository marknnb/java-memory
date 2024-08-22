package org.demo.gc;

public class Customer  {
    private String name;

    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(Customer oldCustomer) {
        this.name = oldCustomer.name;
    }


    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void finalize() throws Throwable {
        //System.out.println("this object s being gc :: "+name);
    }

}