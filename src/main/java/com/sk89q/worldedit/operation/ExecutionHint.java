// $Id$
/*
 * This file is a part of WorldEdit.
 * Copyright (c) sk89q <http://www.sk89q.com>
 * Copyright (c) the WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software 
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.worldedit.operation;

/**
 * Provides hints about the current execution cycle. Operations should utilize this
 * information, but they may choose to not.
 */
public interface ExecutionHint {

    /**
     * Returns whether a single run is preferred.
     * 
     * @return true if the operation should complete as much as possible in one execution
     */
    boolean preferSingleRun();
    
    /**
     * Get the number of blocks that is recommended to be changed for this pass,
     * assuming that the operation is for a simple //set.
     * 
     * <p>Other operations should adjust accordingly and scale.</p>
     * 
     * @return the number of blocks
     */
    int getBlockCount();

}
