package org.mld.pojo;

public class SaleGoods {

    private Integer id;
    private String goodsname;
    private float weight;
    private int type;
    private Boolean onSale;

    public SaleGoods() {
    }

    public SaleGoods(Integer id, String goodsname, float weight, int type, Boolean onSale) {
        this.id = id;
        this.goodsname = goodsname;
        this.weight = weight;
        this.type = type;
        this.onSale = onSale;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public String toString() {
        return "SaleGoods{" +
                "id=" + id +
                ", goodsname='" + goodsname + '\'' +
                ", weight=" + weight +
                ", type=" + type +
                ", onSale=" + onSale +
                '}';
    }
}
