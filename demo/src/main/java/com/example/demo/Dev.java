package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // @Autowired ek annotation hai spring ka jiski help se hum 2 class ko connect kar skte hai
    // class hoo ya koi interface ho hum apne case mai Computer comp ek interface bna kar, kar rhe
    // rhe hai kaam jo ki computer<------------>Dev ko connect kar rha hai
    // hum without @Autowired bhi kar skte hai kaam but uss case mai hume Computer comp= new Computer();
    // bnana pdega new keyword ki help se initialize karna pdega object ko
    //------------------------------------------
    // if we create 2 classes that is desktop and laptop which is implement computer interface
    // in that case humari dono class desktop aur laptop mee compile name ka function bna hua hai
    // toh hum agr run karege toh error ayega iss case mai hume btana pdega spring ko kis compile
    // function ko run karoge desktop yaa Laptop ke compile function ko toh humare pass to methods
    // mtlb 2 annotations hai
    // @Primary -> yeh annoatation spring ko btayega ki konca uske liye primary class hai
    // jisko execute karna hai and dusre ko skip karna hai
    // @Qualifier yeh annotation bhi use kar skte hai iska benifit yeh hai ki hum primary ke
    // case mee dono class desktop aur laptop ko primary bna skte thee but abbb hum use karege
    // @Qualifier ko iski help see hum jha humne computer interface ko autowired kara hai
    // Dev class me vha implement karege aur btayege ki hume kis class ko execute karna hai
    // isme hum dono class ko ek sath execute nhi kar skte bss ek ko kar skte hai
    // @Qualifier("Laptop") jese iss case mee hum bta rhe hai ki sirf laptop hii run karna bss
    // spring abb desktop ka object vagar kuch nhi bnayega usko skip kardega
    // @Qualifier("Desktop") is the is reverse of Laptop abb yaha desktop chlega

     //      _____________________________
     //      |      IOC Container         |
    //       |                            |
    //       |   Desktop object           |
   //        |   Laptop object            |
    //       |   Dev Object               |
    //       |                            |
    //       |                            |
    //       |____________________________|
    //
    //     iss IOC container mee 3 objects hai abb joo spring framework handle kar rha hai
    //     isme extra
    //        Computer (Interface)
    //          /\
    /*        /   \
             /     \
(Component)Laptop    Desktop(Component)

     */
    @Autowired
    @Qualifier("Laptop")
    private Computer comp;
    public void build()
    {
        comp.compile();
        System.out.println("lets build something");

    }

}
