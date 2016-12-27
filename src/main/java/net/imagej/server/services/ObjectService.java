/*
 * #%L
 * ImageJ server for RESTful access to ImageJ.
 * %%
 * Copyright (C) 2013 - 2016 Board of Regents of the University of
 * Wisconsin-Madison.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package net.imagej.server.services;

/**
 * @author Leon Yang
 */
public interface ObjectService {

	/**
	 * Registers an Object if it does not exist yet.
	 * 
	 * @param obj the Object to be registered.
	 * @return the UUID of the registered Object.
	 */
	String register(final Object obj);

	/**
	 * Retrieves the Object with the given UUID.
	 * 
	 * @param uuid
	 * @return Object with the given UUID
	 */
	Object find(final String uuid);

	/**
	 * Checks if exists an Object with the given UUID.
	 * 
	 * @param uuid
	 * @return true if such Object exists.
	 */
	boolean contains(final String uuid);
}