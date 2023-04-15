class Product_info
{
    private  int id;
    private String name;
    private int price;
    private String company;
    Product_info()
    {

    }
    Product_info(int id, String name, int price, String company) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.company = company;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getCompany() {
        return company;
    }

}
