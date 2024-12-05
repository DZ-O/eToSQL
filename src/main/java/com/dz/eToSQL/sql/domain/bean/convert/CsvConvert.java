package com.dz.eToSQL.sql.domain.bean.convert;

import com.dz.eToSQL.exception.MyCustomException;
import com.dz.eToSQL.sql.domain.bean.convert.abs.FillConvertAbstract;
import com.dz.eToSQL.sql.domain.request.UploadRequest;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @author daizhen
 * @Description
 * @create 2024-12-04 16:26
 */
@Component
public class CsvConvert extends FillConvertAbstract {

    @Override
    public String[] fillToSql(File uploadFile, String type, UploadRequest uploadRequest) {
        return super.fillToSql(uploadFile, type, uploadRequest);
    }

    @Override
    public Boolean executeSql(String[] sql, UploadRequest uploadRequest) throws ClassNotFoundException, MyCustomException {
        return super.executeSql(sql, uploadRequest);
    }
}