module com.module.one {

    exports com.module.one.services to com.module.main;
    exports com.module.one.services.impl to com.module.main, spring.beans;
    exports com.module.one.models;

    provides com.module.one.services.UserService with com.module.one.services.impl.UserServiceImpl;

    requires spring.context;
    requires java.persistence;
    requires spring.data.jpa;
    requires spring.data.commons;
    requires spring.beans;

    requires static lombok;

}