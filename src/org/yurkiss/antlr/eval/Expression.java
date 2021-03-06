/*
 * Copyright (c) 2005 Einar Pehrson <einar@pehrson.nu>.
 *
 * This file is part of
 * CleanSheets - a spreadsheet application for the Java platform.
 *
 * CleanSheets is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * CleanSheets is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CleanSheets; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.yurkiss.antlr.eval;

import java.io.Serializable;

/**
 * An expression in a formula, that can be evaluated and visited.
 * @author Einar Pehrson
 */
public interface Expression extends Serializable {

	/**
	 * Evaluates the expression and returns the result.
	 * @return the result of the evaluation
	 * @throws IllegalValueTypeException if a value of an unexpected type was
	 * encountered when evaluating the expression
	 */
	public Value evaluate() throws IllegalValueTypeException;

	/**
	 * Accepts to visit the given expression visitor.
	 * @param visitor the visitor
	 */
	public Object accept(ExpressionVisitor visitor);
}