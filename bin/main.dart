import 'dart:math';
import 'dart:io';
main() {
  List<int> num=[1,2,3,4,5,6,7,8,9,10,11,12,13];
  List<String> sig=["Heart","Diamond","Clups","Spead" ];
  Random D= Random();
  int numberIndex = D.nextInt(12);
  String name;
  switch(numberIndex){
    case 0:
      name="ACK";
      break;
    case 10:
      name="Jack";
      break;
    case 11:
      name="Quuen";
      break;
    case 12:
      name="King";
      break;
      default:
        name=num[numberIndex].toString();
        break;
  }
  Random B=Random();
  int sigIndix=B.nextInt(3);
  //MAP
  Map choice ={"number":name,"sign":sig[sigIndix]};
  String number= choice["number"];
  String sign= choice ["sign"];
  print("your cart is $number $sign");
}
