/*
 * This file is generated by jOOQ.
 */
package com.oneops.user.tables;

import com.oneops.user.*;
import com.oneops.user.tables.records.AuthenticationsRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.*;

/** This class is generated by jOOQ. */
@Generated(
  value = {"http://www.jooq.org", "jOOQ version:3.9.2"},
  comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Authentications extends TableImpl<AuthenticationsRecord> {

  private static final long serialVersionUID = 322705572;

  /** The reference instance of <code>public.authentications</code> */
  public static final Authentications AUTHENTICATIONS = new Authentications();

  /** The class holding records for this type */
  @Override
  public Class<AuthenticationsRecord> getRecordType() {
    return AuthenticationsRecord.class;
  }

  /** The column <code>public.authentications.id</code>. */
  public final TableField<AuthenticationsRecord, Integer> ID =
      createField(
          "id",
          org.jooq.impl.SQLDataType.INTEGER
              .nullable(false)
              .defaultValue(
                  org.jooq.impl.DSL.field(
                      "nextval('authentications_id_seq'::regclass)",
                      org.jooq.impl.SQLDataType.INTEGER)),
          this,
          "");

  /** The column <code>public.authentications.user_id</code>. */
  public final TableField<AuthenticationsRecord, Integer> USER_ID =
      createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

  /** The column <code>public.authentications.provider</code>. */
  public final TableField<AuthenticationsRecord, String> PROVIDER =
      createField("provider", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

  /** The column <code>public.authentications.uid</code>. */
  public final TableField<AuthenticationsRecord, String> UID =
      createField("uid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

  /** The column <code>public.authentications.created_at</code>. */
  public final TableField<AuthenticationsRecord, Timestamp> CREATED_AT =
      createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

  /** The column <code>public.authentications.updated_at</code>. */
  public final TableField<AuthenticationsRecord, Timestamp> UPDATED_AT =
      createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

  /** Create a <code>public.authentications</code> table reference */
  public Authentications() {
    this("authentications", null);
  }

  /** Create an aliased <code>public.authentications</code> table reference */
  public Authentications(String alias) {
    this(alias, AUTHENTICATIONS);
  }

  private Authentications(String alias, Table<AuthenticationsRecord> aliased) {
    this(alias, aliased, null);
  }

  private Authentications(
      String alias, Table<AuthenticationsRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, "");
  }

  /** {@inheritDoc} */
  @Override
  public Schema getSchema() {
    return Public.PUBLIC;
  }

  /** {@inheritDoc} */
  @Override
  public Identity<AuthenticationsRecord, Integer> getIdentity() {
    return Keys.IDENTITY_AUTHENTICATIONS;
  }

  /** {@inheritDoc} */
  @Override
  public UniqueKey<AuthenticationsRecord> getPrimaryKey() {
    return Keys.AUTHENTICATIONS_PKEY;
  }

  /** {@inheritDoc} */
  @Override
  public List<UniqueKey<AuthenticationsRecord>> getKeys() {
    return Arrays.<UniqueKey<AuthenticationsRecord>>asList(Keys.AUTHENTICATIONS_PKEY);
  }

  /** {@inheritDoc} */
  @Override
  public Authentications as(String alias) {
    return new Authentications(alias, this);
  }

  /** Rename this table */
  @Override
  public Authentications rename(String name) {
    return new Authentications(name, null);
  }
}
