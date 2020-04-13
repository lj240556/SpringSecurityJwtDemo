package com.company.project.utils;

import io.minio.MinioClient;
import io.minio.policy.PolicyType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


@Slf4j
@Component
/**
 * 上传组件
 *   MinIO 是一款基于Go语言的高性能对象存储服务，在Github上已有19K+Star.
 */
public class MinioUpload {
    @Value("${minio.endpoint}")
    private  String ENDPOINT;

    @Value("${minio.bucketName}")
    private  String BUCKET_NAME;

    @Value("${minio.accessKey}")
    private  String ACCESS_KEY;

    @Value("${minio.secretKey}")
    private  String SECRET_KEY;

    /**
     * 上传文件
     * @param multiReq
     * @return 返回文件的存储路径
     */
    public    String uploadFile(MultipartFile multiReq){
        // 原始文件名
        String fileName = multiReq.getOriginalFilename();
        log.info("开始上传图片");
        // 后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        String fileurl="";
        try {
            MinioClient minioClient = new MinioClient(ENDPOINT, ACCESS_KEY, SECRET_KEY);
            boolean isExist = minioClient.bucketExists(BUCKET_NAME);
            //如果存在
            if (isExist) {
                log.info("存储桶已经存在！可以直接上传");
            } else {
                //创建存储桶并设置只读权限
                minioClient.makeBucket(BUCKET_NAME);
                minioClient.setBucketPolicy(BUCKET_NAME, "*.*", PolicyType.READ_ONLY);
            }
            //设置简单的日历格式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            // 设置存储对象名称
            String objectName = sdf.format(new Date()) + "/" + fileName;
            //调用putObject方法上传
            minioClient.putObject(BUCKET_NAME, objectName, multiReq.getInputStream(), multiReq.getContentType());
            //文件地址
            fileurl = ENDPOINT + "/" + BUCKET_NAME + "/" + objectName;
            log.info("上传图片结束");
            log.info("返回图片地址:{}",fileurl);
            return fileurl;
        }catch (Exception e){
            log.error("上传文件失败");
            return  "";
        }
    }
}
