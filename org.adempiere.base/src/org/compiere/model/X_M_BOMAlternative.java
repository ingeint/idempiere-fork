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
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.KeyNamePair;

/** Generated Model for M_BOMAlternative
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="M_BOMAlternative")
public class X_M_BOMAlternative extends PO implements I_M_BOMAlternative, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_M_BOMAlternative (Properties ctx, int M_BOMAlternative_ID, String trxName)
    {
      super (ctx, M_BOMAlternative_ID, trxName);
      /** if (M_BOMAlternative_ID == 0)
        {
			setM_BOMAlternative_ID (0);
			setM_Product_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_BOMAlternative (Properties ctx, int M_BOMAlternative_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, M_BOMAlternative_ID, trxName, virtualColumns);
      /** if (M_BOMAlternative_ID == 0)
        {
			setM_BOMAlternative_ID (0);
			setM_Product_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_BOMAlternative (Properties ctx, String M_BOMAlternative_UU, String trxName)
    {
      super (ctx, M_BOMAlternative_UU, trxName);
      /** if (M_BOMAlternative_UU == null)
        {
			setM_BOMAlternative_ID (0);
			setM_Product_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_BOMAlternative (Properties ctx, String M_BOMAlternative_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, M_BOMAlternative_UU, trxName, virtualColumns);
      /** if (M_BOMAlternative_UU == null)
        {
			setM_BOMAlternative_ID (0);
			setM_Product_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_M_BOMAlternative (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_M_BOMAlternative[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Alternative Group.
		@param M_BOMAlternative_ID Product BOM Alternative Group
	*/
	public void setM_BOMAlternative_ID (int M_BOMAlternative_ID)
	{
		if (M_BOMAlternative_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_BOMAlternative_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_BOMAlternative_ID, Integer.valueOf(M_BOMAlternative_ID));
	}

	/** Get Alternative Group.
		@return Product BOM Alternative Group
	  */
	public int getM_BOMAlternative_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_BOMAlternative_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set M_BOMAlternative_UU.
		@param M_BOMAlternative_UU M_BOMAlternative_UU
	*/
	public void setM_BOMAlternative_UU (String M_BOMAlternative_UU)
	{
		set_Value (COLUMNNAME_M_BOMAlternative_UU, M_BOMAlternative_UU);
	}

	/** Get M_BOMAlternative_UU.
		@return M_BOMAlternative_UU	  */
	public String getM_BOMAlternative_UU()
	{
		return (String)get_Value(COLUMNNAME_M_BOMAlternative_UU);
	}

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
	{
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_ID)
			.getPO(getM_Product_ID(), get_TrxName());
	}

	/** Set Product.
		@param M_Product_ID Product, Service, Item
	*/
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_Product_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getName());
    }
}