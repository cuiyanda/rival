/*
 * Copyright 2015 recommenders.net.
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
package net.recommenders.rival.recommend.frameworks.exceptions;

/**
 * Exception to be used in the recommender module.
 *
 * @author <a href="http://github.com/alansaid">Alan</a>
 */
@SuppressWarnings("serial")
public class RecommenderException extends Exception {

    /**
     * Constructs an exception with the specified message.
     *
     * @param msg the message to be shown later.
     */
    public RecommenderException(String msg) {
        super(msg);
    }

    /**
     * Constructs a new exception with the specified message and cause.
     *
     * @param msg the message to be shown later.
     * @param t the cause of the exception.
     */
    public RecommenderException(String msg, Throwable t) {
        super(msg, t);
    }
}