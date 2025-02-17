package org.example.POS_UI_Test.PageObject.VendorManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Vendor_Inventory_Objects {

    WebDriver ldriver;
    WebElement[] tx;
    WebElement[] bt;
    WebElement[] dp;
    WebElement[] vv;

    public Vendor_Inventory_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
//        tx=new WebElement[]{inventoryCode,quantity,price,discount,itemName};
//        bt=new WebElement[]{VendorManagement,VendorInventory};
//        dp=new WebElement[]{vendorName,selectUnit};
//        vv=new WebElement[]{Kg,Gram,Pieces};
    }
    @FindBy(xpath = "//p[normalize-space()=\"Vendor Management\"]")
    WebElement VendorManagement;
    @FindBy(xpath = "//span[normalize-space()=\"Vendor Inventory\"]")
    WebElement VendorInventory;
    @FindBy(xpath = "//div[@id='mui-component-select-vendorName']")
    WebElement vendorName;
    @FindBy(xpath = "//input[@name='itemName']")
    WebElement itemName;

    @FindBy(xpath = "//input[@name='inventoryCode']")
    WebElement inventoryCode;

    @FindBy(xpath = "//input[@name='quantity']")
    WebElement quantity;

    @FindBy(xpath = "//input[@name='price']")
    WebElement price;

    @FindBy(xpath = "//input[@name='discount']")
    WebElement discount;

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    WebElement Submit;
    public void ClickOnSubmit()
    {
        Submit.click();
    }

    @FindBy(xpath = "//div[@id=\"mui-component-select-vendorName\"]")
    WebElement selectVendorName;

    @FindBy(xpath = "//div[@id=\"mui-component-select-itemName\"]")
    WebElement selectItemName;

    @FindBy(xpath = "//div[@id='mui-component-select-unit']")
    WebElement selectUnit;

    @FindBy(xpath = "//li[normalize-space()=\"Kg\"]")
    WebElement Kg;
    public void ClickOnKg()
    {
        Kg.click();
    }
    @FindBy(xpath = "//li[normalize-space()=\"Gram\"]")
    WebElement Gram;
    @FindBy(xpath = "//li[normalize-space()=\"Pieces\"]")
    WebElement Pieces;

//    @FindBy(xpath = "ff")
//    WebElement ff;


    public void EnterTheText(String name,String values)
    {
        tx=new WebElement[]{inventoryCode,quantity,price,discount,itemName};
        for (WebElement e:tx)
        {
            if(e.getAttribute("name").contains(name))
            {
                e.sendKeys(values);
            }
        }
    }
    public void ClickOnButtton(String name)
    {
        bt=new WebElement[]{VendorManagement,VendorInventory};
        for (WebElement b:bt)
        {
            if (b.getText().contains(name))
            {
               b.click();
            }
        }

    }
    public void ClickDropDown(String name)
    {
        dp=new WebElement[]{vendorName,selectUnit};
        for (WebElement e:dp)
        {
            if(e.getText().contains(name))
            {
                e.click();

            }
        }
    }
//public void ClickDropDown(String name)
//{
//    for (WebElement e:dp)
//    {
//        if (e.getText().contains(name))
//        {
//            e.click();
//            Select s=new Select(e);
//            List<WebElement> list = s.getOptions();
//                    for (int i=0;i<=list.size();i++)
//                    {
//                        list.get(list.size()-2).click();
//                    }
//        }
//    }
//}


}
