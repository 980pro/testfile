package com.example.testfile.dao;

import com.example.testfile.domain.TodoVO;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TodoDAO {

    public static void insert(TodoVO todoVO) throws Exception {
        String sql = "insert into test (age,name,userid,userpass,sex,hobby,tarvel,text) values(?,?,?,?,?,?,?,?)";

        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, todoVO.getAge());
        preparedStatement.setString(2, todoVO.getName());
        preparedStatement.setString(3,todoVO.getUserid());
        preparedStatement.setString(4,todoVO.getUserpass());
        preparedStatement.setString(5,todoVO.getSex());
        preparedStatement.setString(6,todoVO.getHobby());
        preparedStatement.setString(7,todoVO.getTravel());
        preparedStatement.setString(8,todoVO.getText());

        preparedStatement.executeUpdate();
    }
}
