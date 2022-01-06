package com.ddh.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import sun.nio.cs.StandardCharsets;

import javax.net.ssl.StandardConstants;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.UUID;

@RestController
public class FileController {

    @PostMapping("upload")
    public String upload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {
        //获取文件名
        String filename = file.getOriginalFilename();
        if ("".equals(filename)) {
            return "文件不能为空";
        }
        System.out.println("上传文件名: " + filename);
        //上传路径保存设置
        String path = request.getServletContext().getRealPath("/upload");
         //若文件不存在，则创建一个
        File realPath = new File(path);

        if (!realPath.exists()){
            realPath.mkdir();
        }
        System.out.println("上传文件保存地址: " + realPath);

        InputStream is = file.getInputStream();//文件输入流
        FileOutputStream os = new FileOutputStream(new File(realPath, UUID.randomUUID() + filename));//文件输出流
         int len = 0;
         byte[] buffer= new byte[1024];
         while ((len = is.read(buffer))!=-1){
             os.write(buffer, 0, len);
             os.flush();
         }
         os.close();
         is.close();
        return "上传成功";
    }

    @PostMapping("upload2")
    public String upload2(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {

        //上传路径保存设置
        String path = request.getServletContext().getRealPath("/upload");
        //若文件不存在，则创建一个
        File realPath = new File(path);

        if (!realPath.exists()){
            realPath.mkdir();
        }
        System.out.println("上传文件保存地址: " + realPath);
        file.transferTo(new File(realPath+"/"+file.getOriginalFilename()));
        return "上传成功";
    }

    @RequestMapping("download")
    public String download(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String realPath = request.getServletContext().getRealPath("/upload");

        String fileName = "aaaaaaaaaaaaaaaaa.jpg";
        //设置响应头
        response.reset();

        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode( fileName,"utf-8"));
         File file = new File(realPath, fileName);
        FileInputStream is = new FileInputStream(file);
        ServletOutputStream os = response.getOutputStream();
        int len = 0;
        byte[] buffer= new byte[1024];
        while ((len = is.read(buffer))!=-1){
            os.write(buffer, 0, len);
            os.flush();
            os.close();
        }
        is.close();
        return "ok";
    }
}
