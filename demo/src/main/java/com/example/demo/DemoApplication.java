package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		__________________________
//		|                        |
//		|       JVM              |
//		|    _______________     |
//		|   | IOC           |    |
//		|   | obj=new Dev() |    |
//		|   |_______________|    |
//		|   Dev obj=new Dev();   |
//		|________________________|
//    in this diagram we can see that this is a whole JVM inside this JVM there is IOC which is
//    create by springApplication this is a container of spring this container is managed by spring
//    framework. in this example we can see that we create a context this is a whole container of spring
//    inside a context we have a method name getBean() which is used to tell spring boot for kii kiska
//    object tuje create karna hai mtlb kiss class ka object create karna hai otherwise nhi toh
//    spring sari classes joh project mee bnai hai uska object create kardega container ke andr
//  jo ki ek bda disadvantage hoga optimzation 	orr perfomance kharb kar dega project kii

		///
		// bake humne diagram me deakhna hai ki JVM me hii humne ek Dev ka object bnaya new keyword
		// ka use karke yeh kaam ek developer kar rha hai spring kuch nhi kar rha isme
		// isme deakha jaye toh developer kaa kaam jyada bdd gya objects bnana unko manage
		// karna its make complex so we use spring boot for optimization in project and also make
		// our work easy

		//

		// toh iss program mee humne context bnaya iske sath mee agr hume yeh project run karna hai
		// toh @Component annotation lgana pdega jis class ka hum object use karna chate hai vhaa pr
		// toh humare code mee hum Dev class me @Component annotation ka use karke btaye ge spring ko
		// ki hume Dev ka object bna kar dede 

 		SpringApplication.run(DemoApplication.class, args);

		ApplicationContext context=SpringApplication.run(DemoApplication.class);

		Dev obj = context.getBean(Dev.class);
		obj.build();
//		Demo d1=new Demo(obj);
//		d1.handleRequest();

		// without dependency injection we need to create class using new keyword in that
		// time we manage this process ourself. the object is create inside the jvm
		//		Dev obj=new Dev();
		//     obj.build();

	}

}
