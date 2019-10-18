/**
 * 
 */
package com.portal.utility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Vikram
 *
 */
public class PortalHelper {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PortalHelper.class);
	
	/**
	 * Common method to release resources.
	 * 
	 * @param connection
	 *            - connection
	 * @param statement
	 *            - statement
	 * @param resultSet
	 *            - resultSet
	 * 
	 */
	public static void releaseResources(Connection connection, Statement statement, ResultSet resultSet) {
		try {
			try {
				if (null != resultSet) {
					try {
						resultSet.close();
						resultSet = null;
					} catch (SQLException sqlException) {
						LOGGER.error("Error closing resultset", sqlException);
					}
				}
			} finally {
				if (null != statement) {
					try {
						statement.close();
						statement = null;
					} catch (SQLException sqlException) {
						LOGGER.error("Error closing statement", sqlException);
					}
				}
			}
		} finally {
			try {
				if (null != connection) {
					connection.close();
					connection = null;
				}
			} catch (SQLException sqlException) {
				LOGGER.error("Error closing connection", sqlException);
			}
		}
	}
	
}
