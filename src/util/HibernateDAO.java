package util;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import model.AtendenteDTO;
import model.AtendimentoDTO;
import model.ClienteDTO;
import model.EntregadorDTO;
import model.FuncionarioDTO;


public class HibernateDAO {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/clinica?createDatabaseIfNotExist=true");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "");//minha maquina n tem senha
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				
				configuration.setProperties(settings);
				
				configuration.addAnnotatedClass(ClienteDTO.class);
				configuration.addAnnotatedClass(AtendimentoDTO.class);
				configuration.addAnnotatedClass(FuncionarioDTO.class);
				configuration.addAnnotatedClass(AtendenteDTO.class);
				configuration.addAnnotatedClass(EntregadorDTO.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
