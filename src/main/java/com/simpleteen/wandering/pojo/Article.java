package com.simpleteen.wandering.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("article")
public class Article implements Serializable {
    private static final long serialVersionUID = -1849698844197610571L;
    @TableId
    private String id;
    private String author;
    private String category;
    private String tabloid;
    private String content;
    private String tags;
    private String title;
    private Integer type;
    private Integer views;
    private Long gmtCreate;
    private Long gmtUpdate;
}
