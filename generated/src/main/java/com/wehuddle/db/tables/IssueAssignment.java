/*
 * This file is generated by jOOQ.
 */
package com.wehuddle.db.tables;


import com.wehuddle.db.Keys;
import com.wehuddle.db.Public;
import com.wehuddle.db.tables.records.IssueAssignmentRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IssueAssignment extends TableImpl<IssueAssignmentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.issue_assignment</code>
     */
    public static final IssueAssignment ISSUE_ASSIGNMENT = new IssueAssignment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IssueAssignmentRecord> getRecordType() {
        return IssueAssignmentRecord.class;
    }

    /**
     * The column <code>public.issue_assignment.id</code>.
     */
    public final TableField<IssueAssignmentRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field("uuid_generate_v4()", SQLDataType.UUID)), this, "");

    /**
     * The column <code>public.issue_assignment.issue_id</code>.
     */
    public final TableField<IssueAssignmentRecord, UUID> ISSUE_ID = createField(DSL.name("issue_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.issue_assignment.profile_id</code>.
     */
    public final TableField<IssueAssignmentRecord, UUID> PROFILE_ID = createField(DSL.name("profile_id"), SQLDataType.UUID.nullable(false), this, "");

    private IssueAssignment(Name alias, Table<IssueAssignmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private IssueAssignment(Name alias, Table<IssueAssignmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.issue_assignment</code> table reference
     */
    public IssueAssignment(String alias) {
        this(DSL.name(alias), ISSUE_ASSIGNMENT);
    }

    /**
     * Create an aliased <code>public.issue_assignment</code> table reference
     */
    public IssueAssignment(Name alias) {
        this(alias, ISSUE_ASSIGNMENT);
    }

    /**
     * Create a <code>public.issue_assignment</code> table reference
     */
    public IssueAssignment() {
        this(DSL.name("issue_assignment"), null);
    }

    public <O extends Record> IssueAssignment(Table<O> child, ForeignKey<O, IssueAssignmentRecord> key) {
        super(child, key, ISSUE_ASSIGNMENT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<IssueAssignmentRecord> getPrimaryKey() {
        return Keys.ISSUE_ASSIGNMENT_PKEY;
    }

    @Override
    public List<UniqueKey<IssueAssignmentRecord>> getKeys() {
        return Arrays.<UniqueKey<IssueAssignmentRecord>>asList(Keys.ISSUE_ASSIGNMENT_PKEY, Keys.ISSUE_ASSIGNMENT_ISSUE_ID_PROFILE_ID_KEY);
    }

    @Override
    public IssueAssignment as(String alias) {
        return new IssueAssignment(DSL.name(alias), this);
    }

    @Override
    public IssueAssignment as(Name alias) {
        return new IssueAssignment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IssueAssignment rename(String name) {
        return new IssueAssignment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IssueAssignment rename(Name name) {
        return new IssueAssignment(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UUID, UUID, UUID> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}