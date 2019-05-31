module com.module.main {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires java.sql;
    requires spring.web;
    requires spring.beans;
    requires com.module.one;
    requires spring.data.jpa;
    requires spring.webmvc;

    exports com.module.main to spring.core, spring.beans, spring.context;
    exports com.module.main.controllers to spring.beans, spring.web, spring.core;

    opens com.module.main to spring.core;
    opens com.module.main.controllers to spring.core;
}