class invoice{
//declare instance variables string number;
string description;
int quantity;
double price;
//constructor for variables' initialization
invoice(string n,string d,int q,double p){
number=n;
description=d;
quantity=q;
price=p;
}
//set method 
void setNumber(string n){
number=n;
}
void setDescription(string d){
description=d;
}
void setQuantity(int q){
quantity=q;
if(q<0)
quantity=0;
}
void setPrice(double p){
price=p;
if(p<0)
price=0.0;
}

//Get method
string getNumber(){
return number;
}
string getDescription(){
return description;
}
int getQuantity(){
return quantity;
}
double getPrice(){
return price;
}
//getInvoiceAmount method double getinvoice Amount(){
return quantity*price;
}
}
class InvoiceTest{
public static void main(string []arg){
//create object(S)
Invoice object1=new Invoice("27","Blueberry Parfait",3,9.9);
Invoice object2=new Invoice("12","Rainbow Fraffucino",5,6.6);
Invoice object3=new Invoice("94","strawberry Shortcake",7,29.8);
//print the invice system.out.println("This is an Invoice for the item(s)sold:"+"\n");
system.out.println(object1.getNumber()+"\t"+object1.getDescription()+"\t"+object1.getQuantity()+"\t"+object1.getprice()+"\t"+object1.getinvoiceAmount());
system.out.println(object2.getNumber()+"\t"+object2.getDescription()+"\t"+object2.getQuantity()+"\t"+object2.getPrice()+"\t"+object2.getInvoiceAmount());
system.out.println(object3.getNumber()+"\t"+object3.getDescription()+"\t"+object3.getQuantity()+"\t"+object3.getPrice()+"\t"+object3.getInvoiceAmount());
double total=object1.getInvoiceAmount()+object2.getInvoiceAmount()+object3.getInvoiceAmount();
System.out.println("TOTAL:"+total+"\n\n");
}
}


 
