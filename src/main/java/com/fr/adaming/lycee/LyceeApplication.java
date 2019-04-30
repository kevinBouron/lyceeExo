package com.fr.adaming.lycee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.fr.adaming.lycee.dao.IEleveDao;
import com.fr.adaming.lycee.dao.ISectionDao;
import com.fr.adaming.lycee.entities.Eleve;
import com.fr.adaming.lycee.entities.Section;

@SpringBootApplication
public class LyceeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(LyceeApplication.class, args);
//		IEleveDao edao =  ctx.getBean(com.fr.adaming.lycee.dao.IEleveDao.class);
////		Eleve p = new Eleve("jean", "louis", null, null);
////		edao.save(p);
		ISectionDao sdao = ctx.getBean(com.fr.adaming.lycee.dao.ISectionDao.class);
		Section s = new Section("math");
		sdao.save(s);
	}

}
