package com.yama.generator;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JobEntryIdGenerator implements IdentifierGenerator {

  @Override
  public Serializable generate(SharedSessionContractImplementor session, Object o) {
    String prefix = "DK";
    Connection connection;
    try {
      connection = session.getJdbcConnectionAccess().obtainConnection();
      Statement statement = connection.createStatement();

      ResultSet rs = statement.executeQuery("SELECT MAX(id) FROM dang_ky_lam_them");
      int nextVal = 1;

      if(rs.next()) {
        String maxId = rs.getString(1);
        if(maxId != null) {
          int num = Integer.parseInt(maxId.substring(2));
          nextVal = num + 1;
        }
      }
      rs.close();
      statement.close();

      return prefix + String.format("%03d", nextVal);
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return null;
  }
}
