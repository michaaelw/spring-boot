/*
 * Copyright 2012-2013 the original author or authors.
 *
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
 */

package org.springframework.boot.loader.tools;

import java.io.IOException;

/**
 * Encapsulates information about libraries that may be packed into the archive.
 *
 * @author Phillip Webb
 */
public interface Libraries {

	/**
	 * Represents no libraries.
	 */
	public static Libraries NONE = new Libraries() {
		@Override
		public void doWithLibraries(LibraryCallback callback) throws IOException {
		}
	};

	/**
	 * Iterate all relevant libraries.
	 * @param callback a callback for each relevant library.
	 * @throws IOException
	 */
	void doWithLibraries(LibraryCallback callback) throws IOException;

}