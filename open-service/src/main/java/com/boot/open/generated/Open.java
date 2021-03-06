/*
 * This file is generated by jOOQ.
*/
package com.boot.open.generated;


import com.boot.open.generated.tables.Request;
import com.boot.open.generated.tables.SchemaVersion;
import com.boot.open.generated.tables.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Open extends SchemaImpl {

    private static final long serialVersionUID = -1250797689;

    /**
     * The reference instance of <code>open</code>
     */
    public static final Open OPEN = new Open();

    /**
     * 请求记录
     */
    public final Request REQUEST = com.boot.open.generated.tables.Request.REQUEST;

    /**
     * The table <code>open.schema_version</code>.
     */
    public final SchemaVersion SCHEMA_VERSION = com.boot.open.generated.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * 用户表
     */
    public final User USER = com.boot.open.generated.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Open() {
        super("open", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Request.REQUEST,
            SchemaVersion.SCHEMA_VERSION,
            User.USER);
    }
}
