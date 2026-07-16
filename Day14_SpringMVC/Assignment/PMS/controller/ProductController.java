package com.coforge.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/add")
    public String add() {
        return "addProduct";
    }

    @RequestMapping("/save")
    public String save(Product p, Model model) {

        model.addAttribute("msg",
                service.addProduct(p));

        return "result";
    }

    @RequestMapping("/view")
    public String view(Model model) {

        model.addAttribute("products",
                service.viewProducts());

        return "viewProducts";
    }

    @RequestMapping("/search")
    public String search() {
        return "searchProduct";
    }

    @RequestMapping("/find")
    public String find(int productId,
                       Model model) {

        model.addAttribute("product",
                service.searchProduct(productId));

        return "result";
    }

    @RequestMapping("/delete")
    public String delete() {
        return "deleteProduct";
    }

    @RequestMapping("/remove")
    public String remove(int productId,
                         Model model) {

        model.addAttribute("msg",
                service.deleteProduct(productId));

        return "result";
    }

    @RequestMapping("/update")
    public String update() {
        return "updateProduct";
    }

    @RequestMapping("/modify")
    public String modify(Product p,
                         Model model) {

        model.addAttribute("msg",
                service.updateProduct(p));

        return "result";
    }
}