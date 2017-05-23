/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.conecxao;

import es.beans.Equipes;
import es.beans.Grupos;
import es.beans.Jogadores;
import es.beans.Nacionalidades;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author a912433
 */
public class HibernateUtil {

    private static AnnotationConfiguration cfg;
    private static SessionFactory sessionFactory;
    private static String pass = "aluno";
    private static String user = "root";

    public static Session openConnect() {
        if (cfg == null) {
            cfg = new AnnotationConfiguration();
            cfg.setProperty("hibernate.connection.driver", "com.mysql.jdbc.Driver");
            cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/syshotel");
            cfg.setProperty("hibernate.connection.username", user);
            cfg.setProperty("hibernate.connection.password", pass);
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
            cfg.setProperty("hibernate.show_sql", "true");
            cfg.setProperty("hibernate.format_sql", "true");
            cfg.setProperty("hibernate.hbm2ddl.auto", "update");

            cfg.addAnnotatedClass(Jogadores.class);
            cfg.addAnnotatedClass(Grupos.class);
            cfg.addAnnotatedClass(Equipes.class);
            cfg.addAnnotatedClass(Nacionalidades.class);

            sessionFactory = cfg.buildSessionFactory();

        }
        return sessionFactory.openSession();
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        HibernateUtil.pass = pass;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        HibernateUtil.user = user;
    }

    public static void criarSchema() {
        openConnect().close();
        org.hibernate.tool.hbm2ddl.SchemaExport schemaEx = new SchemaExport(cfg);
        schemaEx.create(true, true);
    }
}
