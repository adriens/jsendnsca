/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.jsendnsca.encryption;

/**
 * All encryption methods must implement this interface
 * 
 * @author Raj Patel
 * 
 */
public interface Encryptor {

    /**
     * Encrypt the passive check
     * 
     * @param passiveCheckBytes
     *            the passive check bytes
     * @param initVector
     *            the init vector as sent by NSCA addon upon connection
     * @param password
     *            the NSCA daemon password
     */
    void encrypt(byte[] passiveCheckBytes, byte[] initVector, String password);
}