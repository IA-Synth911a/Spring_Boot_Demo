/**
 * Comment
 */

package com.example.demo.service;
import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

  private final List<Product> products = new ArrayList<Product>();

  public ProductService() {
    products.add(new Product(1, "瑪利歐派對 超級巨星",
        "https://f.ecimg.tw/items/DGBJCWA900BL03D/000001_1635130622.jpg", 1790,
        "《瑪利歐派對 超級巨星》中包含從歷代《瑪利歐派對》中嚴選出來的「雙陸遊戲」以及「小遊戲」。" +
            "雙陸遊戲：如「碧姬公主的生日蛋糕」和「太空樂園」等。"));
    products.add(new Product(2, "星之卡比 新星同盟",
        "https://b.ecimg.tw/items/DGCW131900B4I2A/000001_1611818979.jpg", 1690,
        "在這次的《星之卡比 新星同盟》中，卡比可以與敵人成為夥伴，\n" +
            "透過「分享」Joy-Con 可以操控夥伴，享受最多同時 4 人協力遊戲的樂趣。"));
    products.add(new Product(3, "集合啦！動物森友會",
        "https://b.ecimg.tw/items/DGCW131900B4I6O/000001_1611819498.jpg", 1890,
        "《動物森友會》系列最新作品《集合啦！動物森友會》將會重新詮釋動物森友會的傳統體驗方式。"));
  }

  public List<Product> getProducts() {
    return products;
  }

}