/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

// stc: -> (abstract class className)
public class  Rahim extends MobileUser {
    //after extend mobileUser this class got both methods that mobileUser have
    //call(), sendMessage();
    @Override
    void sendMessage(){
        System.out.println("I am Rahim....");
    };
}
