/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_Package_Imp_Detail
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
public interface I_AD_Package_Imp_Detail 
{

    /** TableName=AD_Package_Imp_Detail */
    public static final String Table_Name = "AD_Package_Imp_Detail";

    /** AD_Table_ID=50004 */
    public static final int Table_ID = 50004;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_Backup_ID */
    public static final String COLUMNNAME_AD_Backup_ID = "AD_Backup_ID";

	/** Set Backup	  */
	public void setAD_Backup_ID (int AD_Backup_ID);

	/** Get Backup	  */
	public int getAD_Backup_ID();

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name AD_Package_Imp_Detail_ID */
    public static final String COLUMNNAME_AD_Package_Imp_Detail_ID = "AD_Package_Imp_Detail_ID";

	/** Set Imp. Package Detail	  */
	public void setAD_Package_Imp_Detail_ID (int AD_Package_Imp_Detail_ID);

	/** Get Imp. Package Detail	  */
	public int getAD_Package_Imp_Detail_ID();

    /** Column name AD_Package_Imp_Detail_UU */
    public static final String COLUMNNAME_AD_Package_Imp_Detail_UU = "AD_Package_Imp_Detail_UU";

	/** Set AD_Package_Imp_Detail_UU	  */
	public void setAD_Package_Imp_Detail_UU (String AD_Package_Imp_Detail_UU);

	/** Get AD_Package_Imp_Detail_UU	  */
	public String getAD_Package_Imp_Detail_UU();

    /** Column name AD_Package_Imp_ID */
    public static final String COLUMNNAME_AD_Package_Imp_ID = "AD_Package_Imp_ID";

	/** Set Package Imp.	  */
	public void setAD_Package_Imp_ID (int AD_Package_Imp_ID);

	/** Get Package Imp.	  */
	public int getAD_Package_Imp_ID();

	public org.compiere.model.I_AD_Package_Imp getAD_Package_Imp() throws RuntimeException;

    /** Column name AD_Table_ID */
    public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

	/** Set Table.
	  * Database Table information
	  */
	public void setAD_Table_ID (int AD_Table_ID);

	/** Get Table.
	  * Database Table information
	  */
	public int getAD_Table_ID();

	public org.compiere.model.I_AD_Table getAD_Table() throws RuntimeException;

    /** Column name Action */
    public static final String COLUMNNAME_Action = "Action";

	/** Set Action.
	  * Indicates the Action to be performed
	  */
	public void setAction (String Action);

	/** Get Action.
	  * Indicates the Action to be performed
	  */
	public String getAction();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name ExecCode */
    public static final String COLUMNNAME_ExecCode = "ExecCode";

	/** Set Execution Code	  */
	public void setExecCode (String ExecCode);

	/** Get Execution Code	  */
	public String getExecCode();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Record_ID */
    public static final String COLUMNNAME_Record_ID = "Record_ID";

	/** Set Record ID.
	  * Direct internal record ID
	  */
	public void setRecord_ID (int Record_ID);

	/** Get Record ID.
	  * Direct internal record ID
	  */
	public int getRecord_ID();

    /** Column name Record_UU */
    public static final String COLUMNNAME_Record_UU = "Record_UU";

	/** Set Record UUID	  */
	public void setRecord_UU (String Record_UU);

	/** Get Record UUID	  */
	public String getRecord_UU();

    /** Column name Result */
    public static final String COLUMNNAME_Result = "Result";

	/** Set Result.
	  * Result of the action taken
	  */
	public void setResult (String Result);

	/** Get Result.
	  * Result of the action taken
	  */
	public String getResult();

    /** Column name Success */
    public static final String COLUMNNAME_Success = "Success";

	/** Set Success	  */
	public void setSuccess (String Success);

	/** Get Success	  */
	public String getSuccess();

    /** Column name TableName */
    public static final String COLUMNNAME_TableName = "TableName";

	/** Set DB Table Name.
	  * Name of the table in the database
	  */
	public void setTableName (String TableName);

	/** Get DB Table Name.
	  * Name of the table in the database
	  */
	public String getTableName();

    /** Column name Type */
    public static final String COLUMNNAME_Type = "Type";

	/** Set Type.
	  * Type of Validation (SQL, Java Script, Java Language)
	  */
	public void setType (String Type);

	/** Get Type.
	  * Type of Validation (SQL, Java Script, Java Language)
	  */
	public String getType();

    /** Column name Uninstall */
    public static final String COLUMNNAME_Uninstall = "Uninstall";

	/** Set Uninstall	  */
	public void setUninstall (boolean Uninstall);

	/** Get Uninstall	  */
	public boolean isUninstall();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
