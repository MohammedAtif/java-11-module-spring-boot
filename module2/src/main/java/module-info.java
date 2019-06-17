module com.module.two {
    exports com.module.two.services to com.module.main;
    exports com.module.two.services.impl to com.module.main, spring.beans;
    exports com.module.two.models;

    requires spring.context;
    requires java.persistence;
    requires spring.data.jpa;
    requires spring.data.commons;
    requires spring.beans;
}