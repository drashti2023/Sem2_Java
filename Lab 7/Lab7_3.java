interface Transport{
 public void deliver();
}
abstract class Animal{
 public void show(){
  
 }
}
class Tiger extends Animal{
 public void show(){
  System.out.println("I am in show method of Animal class overrided in Tiger class ");
 }
}
class Camel extends Animal implements Transport{
 public void deliver(){
   System.out.println("I am in deliver method of Transport Interface overrided in Camel class ");
 }
}
class Deer extends Animal{
 public void show(){
   System.out.println("I am in show method of Animal class overrided in Deer class ");
 }
 
}
class Donkey extends Animal implements Transport{
 public void deliver(){
   System.out.println("I am in deliver method of Transport Interface overrided in Donkey class ");
 }
 
}
public class Lab7_3{
   public static void main(String args[]){
 Animal A[]=new Animal[4];
 A[0]=new Tiger();
 A[1]=new Camel();
 A[2]=new Deer();
 A[3]=new Donkey();

 if(A[0] instanceof Transport){
  ((Transport)A[0]).deliver();
 }
 else{
  A[0].show();
 }
 if(A[1] instanceof Transport){
  ((Transport)A[1]).deliver();
 }
 else{
  A[1].show();
 }
 if(A[2] instanceof Transport){
  ((Transport)A[2]).deliver();
 }
 else{
  A[2].show();
 }
 if(A[3] instanceof Transport){
  ((Transport)A[3]).deliver();
 }
 else{
  A[3].show();
 }
   }
}
